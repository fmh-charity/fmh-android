package ru.iteco.fmhandroid.repository.claimRepository

import androidx.paging.*
import androidx.room.withTransaction
import ru.iteco.fmhandroid.api.ClaimApi
import ru.iteco.fmhandroid.dao.ClaimDao
import ru.iteco.fmhandroid.dao.ClaimKeyDao
import ru.iteco.fmhandroid.db.AppDb
import ru.iteco.fmhandroid.dto.ClaimKey
import ru.iteco.fmhandroid.dto.NewsKey
import ru.iteco.fmhandroid.entity.ClaimEntity
import ru.iteco.fmhandroid.entity.ClaimKeyEntity
import ru.iteco.fmhandroid.entity.toEntity
import ru.iteco.fmhandroid.exceptions.ApiException
import javax.inject.Inject
import javax.inject.Singleton

@OptIn(ExperimentalPagingApi::class)
@Singleton
class ClaimRemoteMediator @Inject constructor(
    private val service: ClaimApi,
    private val db: AppDb,
    private val claimDao: ClaimDao,
    private val claimKeyDao: ClaimKeyDao
) : RemoteMediator<Int, ClaimEntity>() {

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, ClaimEntity>
    ): MediatorResult {
        try {
            val response = when (loadType) {
                LoadType.REFRESH -> service.getAllClaims(state.config.initialLoadSize)
                LoadType.PREPEND -> {
                    val id = claimKeyDao.max() ?: return MediatorResult.Success(
                        endOfPaginationReached = false
                    )
                    service.getAllClaims(id, state.config.pageSize)
                }
                LoadType.APPEND -> {
                    val id = claimKeyDao.min() ?: return MediatorResult.Success(
                        endOfPaginationReached = false
                    )
                    service.getAllClaims(id, state.config.pageSize)
                }
            }

            if (!response.isSuccessful) {
                throw ApiException(response.code(), response.message())
            }
            val body = response.body() ?: throw ApiException(
                response.code(),
                response.message(),
            )

            db.withTransaction {
                when (loadType) {
                    LoadType.REFRESH -> {
                        claimKeyDao.removeAll()
                        claimKeyDao.insert(
                            listOf(
                                ClaimKeyEntity(
                                    type = ClaimKey.Status.AFTER,
                                    page = body.elements.first().id,
                                ),
                                ClaimKeyEntity(
                                    type = ClaimKey.Status.BEFORE,
                                    page = body.elements.last().id,
                                ),
                            )
                        )
                        claimDao.removeAll()
                    }
                    LoadType.PREPEND -> {
                        claimKeyDao.insert(
                            ClaimKeyEntity(
                                type = ClaimKey.Status.AFTER,
                                page = body.elements.first().id,
                            )
                        )
                    }
                    LoadType.APPEND -> {
                        claimKeyDao.insert(
                            ClaimKeyEntity(
                                type = ClaimKey.Status.BEFORE,
                                page = body.elements.last().id,
                            )
                        )
                    }
                }
                claimDao.insertClaim(body.elements.toEntity())
            }
            return MediatorResult.Success(endOfPaginationReached = body.elements.isEmpty())
        } catch (e: Exception) {
            return MediatorResult.Error(e)
        }
    }
}