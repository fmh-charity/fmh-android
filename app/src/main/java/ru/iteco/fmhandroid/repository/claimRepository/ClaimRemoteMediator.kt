package ru.iteco.fmhandroid.repository.claimRepository

import androidx.paging.*
import androidx.room.withTransaction
import ru.iteco.fmhandroid.api.ClaimApi
import ru.iteco.fmhandroid.dao.ClaimDao
import ru.iteco.fmhandroid.dao.ClaimKeyDao
import ru.iteco.fmhandroid.db.AppDb
import ru.iteco.fmhandroid.entity.ClaimEntity
import ru.iteco.fmhandroid.entity.ClaimKeyEntity
import ru.iteco.fmhandroid.entity.toEntity
import ru.iteco.fmhandroid.exceptions.ApiException

@OptIn(ExperimentalPagingApi::class)
class ClaimRemoteMediator(
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
                LoadType.REFRESH -> {
                    val id: Int? = claimKeyDao.max()

                    if (id != null) {
                        service.getAllClaims(true, id, state.config.initialLoadSize)
                    } else {
                        service.getAllClaims(true, state.config.initialLoadSize)
                    }
                }
                LoadType.PREPEND -> {
                    val id = claimKeyDao.max() ?: return MediatorResult.Success(
                        endOfPaginationReached = true
                    )
                    service.getAllClaims(true, id, state.config.pageSize)
                }
                LoadType.APPEND -> {
                    val id = claimKeyDao.min() ?: return MediatorResult.Success(
                        endOfPaginationReached = false
                    )
                    /// НУЖНО УТОЧНИТЬ НАСЧЕТ getAllClaims
                    service.getAllClaims(true, id, state.config.pageSize)
                }
            }
            if (!response.isSuccessful) {
                throw ApiException(response.code(), response.message())
            }
            val body = response.body() ?: throw ApiException(response.code(), response.message())

            db.withTransaction {
                when (loadType) {
                    LoadType.REFRESH -> {
                        claimKeyDao.removeAll()
                        claimKeyDao.insert(
                            listOf(
                                ClaimKeyEntity(
                                    type = ClaimKeyEntity.KeyType.AFTER,
                                    page = body.claimList.first().id,
                                ),
                                ClaimKeyEntity(
                                    type = ClaimKeyEntity.KeyType.BEFORE,
                                    page = body.claimList.last().id,
                                ),
                            )
                        )
                        claimDao.removeAll()
                    }
                    LoadType.PREPEND -> {
                        claimKeyDao.insert(
                            ClaimKeyEntity(
                                type = ClaimKeyEntity.KeyType.AFTER,
                                page = body.claimList.first().id
                            )
                        )
                    }
                    LoadType.APPEND -> {
                        claimKeyDao.insert(
                            ClaimKeyEntity(
                                type = ClaimKeyEntity.KeyType.BEFORE,
                                page = body.claimList.last().id
                            )
                        )
                    }
                }
                claimDao.insertClaim(body.claimList.toEntity())
            }
            return MediatorResult.Success(endOfPaginationReached = body.claimList.isEmpty())
        } catch (e: Exception) {
            return MediatorResult.Error(e)
        }
    }
}