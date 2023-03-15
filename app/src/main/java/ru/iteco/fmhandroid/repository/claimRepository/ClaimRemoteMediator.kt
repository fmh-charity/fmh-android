package ru.iteco.fmhandroid.repository.claimRepository

import androidx.paging.*
import androidx.room.withTransaction
import ru.iteco.fmhandroid.api.ClaimApi
import ru.iteco.fmhandroid.db.AppDb
import ru.iteco.fmhandroid.entity.ClaimEntity
import ru.iteco.fmhandroid.entity.ClaimRemoteKeys
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@OptIn(ExperimentalPagingApi::class)
@Singleton
class ClaimRemoteMediator @Inject constructor(
    private val claimApi: ClaimApi,
    private val db: AppDb
) : RemoteMediator<Int, ClaimEntity>() {

    private suspend fun getRemoteKeyLastItem(state: PagingState<Int, ClaimEntity>): ClaimRemoteKeys? {
        return state.pages.lastOrNull {
            it.data.isNotEmpty()
        }?.data?.lastOrNull()?.let { claim ->
            db.claimKeyDao().getRemoveKeyById(claim.id)
        }
    }

    override suspend fun initialize(): InitializeAction {
        val cacheTimeout = TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS)
        return if (System.currentTimeMillis() - (db.claimKeyDao().getCreationTime()
                ?: 0) < cacheTimeout
        ) {
            InitializeAction.SKIP_INITIAL_REFRESH
        } else {
            InitializeAction.LAUNCH_INITIAL_REFRESH
        }
    }
    private suspend fun getRemoteKeyFirstItem(state: PagingState<Int, ClaimEntity>): ClaimRemoteKeys? {
        return state.pages.firstOrNull {
            it.data.isNotEmpty()
        }?.data?.firstOrNull()?.let { claim ->
            db.claimKeyDao().getRemoveKeyById(claim.id)
        }
    }
    private suspend fun remoteKeyClosestToCurrentPosition(state: PagingState<Int, ClaimEntity>): ClaimRemoteKeys? {
        return state.anchorPosition?.let { position ->
            state.closestItemToPosition(position)?.id?.let { id ->
                db.claimKeyDao().getRemoveKeyById(id)
            }
        }
    }
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, ClaimEntity>
    ): MediatorResult {
        val page: Int = when (loadType) {
            LoadType.REFRESH -> {
                val remoteKeys = remoteKeyClosestToCurrentPosition(state)
                remoteKeys?.nextKey?.minus(1) ?: 1
            }

            LoadType.PREPEND -> {
                val remoteKey = getRemoteKeyFirstItem(state)
                val prevKey = remoteKey?.prevKey
                prevKey ?: return MediatorResult.Success(endOfPaginationReached = remoteKey != null)
            }
            LoadType.APPEND -> {
                val remoteKey = getRemoteKeyLastItem(state)
                val nextKey = remoteKey?.nextKey
                nextKey ?: return MediatorResult.Success(endOfPaginationReached = remoteKey != null)
            }
        }
        try {
            val apiResponse = claimApi.getAllClaims(pages = page)
            val claims = apiResponse.body()?.elements
            val paginationReached = claims.isEmpty()

            db.withTransaction {
                if (loadType == LoadType.REFRESH) {

                    db.claimKeyDao().remoteKeys()
                    db.getClaimDao().removeAll()
                }
                val prevKey = if (page > 1) page - 1 else null
                val nextKey = if (paginationReached) null else page + 1
                val remoteKeys = claims?.map {
                    ClaimRemoteKeys(
                        objectId = it.id,
                        prevKey = prevKey,
                        currentPage = page,
                        nextKey = nextKey
                    )
                }
                if (remoteKeys != null) {
                    db.claimKeyDao().insertAll(remoteKeys)
                }
                //** Уточнить про page**//
                //     db.getClaimDao().getAllClaims(claims.onEachIndexed { _, claim -> claim.id = page })
            }
            return MediatorResult.Success(endOfPaginationReached = paginationReached)
        } catch (e: Exception) {
            return MediatorResult.Error(e)
        }
    }
}


