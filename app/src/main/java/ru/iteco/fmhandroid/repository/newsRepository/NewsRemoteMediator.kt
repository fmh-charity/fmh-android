package ru.iteco.fmhandroid.repository.newsRepository

import androidx.paging.*
import androidx.room.withTransaction
import ru.iteco.fmhandroid.api.NewsApi
import ru.iteco.fmhandroid.dao.NewsDao
import ru.iteco.fmhandroid.dao.NewsKeyDao
import ru.iteco.fmhandroid.db.AppDb
import ru.iteco.fmhandroid.dto.ClaimKey
import ru.iteco.fmhandroid.dto.NewsKey
import ru.iteco.fmhandroid.entity.*
import ru.iteco.fmhandroid.exceptions.ApiException
import javax.inject.Inject

@OptIn(ExperimentalPagingApi::class)
class NewsRemoteMediator @Inject constructor(
    private val service: NewsApi,
    private val db: AppDb,
    private val newsDao: NewsDao,
    private val newsKeyDao: NewsKeyDao
) : RemoteMediator<Int, NewsEntity>() {

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, NewsEntity>
    ): MediatorResult {
        try {
            val response = when (loadType) {
                LoadType.REFRESH -> service.getAllNews(state.config.initialLoadSize)
                LoadType.PREPEND -> {
                    val id = newsKeyDao.max() ?: return MediatorResult.Success(
                        endOfPaginationReached = false
                    )
                    service.getAllNews(id, state.config.pageSize)
                }
                LoadType.APPEND -> {
                    val id = newsKeyDao.min() ?: return MediatorResult.Success(
                        endOfPaginationReached = false
                    )
                    service.getAllNews(id, state.config.pageSize)
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
                        newsKeyDao.removeAll()
                        newsKeyDao.insert(
                            listOf(
                                NewsKeyEntity(
                                    type = NewsKey.Status.AFTER,
                                    page = body.elements.first().id,
                                ),
                                NewsKeyEntity(
                                    type = NewsKey.Status.BEFORE,
                                    page = body.elements.last().id,
                                ),
                            )
                        )
                        newsDao.removeAll()
                    }
                    LoadType.PREPEND -> {
                        newsKeyDao.insert(
                            NewsKeyEntity(
                                type = NewsKey.Status.AFTER,
                                page = body.elements.first().id,
                            )
                        )
                    }
                    LoadType.APPEND -> {
                        newsKeyDao.insert(
                            NewsKeyEntity(
                                type = NewsKey.Status.BEFORE,
                                page = body.elements.last().id,
                            )
                        )
                    }
                }
                newsDao.insert(body.elements.toEntity())
            }
            return MediatorResult.Success(endOfPaginationReached = body.elements.isEmpty())
        } catch (e: Exception) {
            return MediatorResult.Error(e)
        }
    }
}