package ru.iteco.fmhandroid.repository.newsRepository

import androidx.paging.*
import androidx.room.withTransaction
import ru.iteco.fmhandroid.api.NewsApi
import ru.iteco.fmhandroid.dao.NewsDao
import ru.iteco.fmhandroid.dao.NewsKeyDao
import ru.iteco.fmhandroid.db.AppDb
import ru.iteco.fmhandroid.entity.*
import ru.iteco.fmhandroid.exceptions.ApiException

@OptIn(ExperimentalPagingApi::class)
class NewsRemoteMediator(
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
                LoadType.REFRESH -> {
                    val id: Int? = newsKeyDao.max()

                    if (id != null) {
                        service.getAllNews(true, id, state.config.initialLoadSize)
                    } else {
                        service.getAllNews(true, state.config.initialLoadSize)
                    }
                }
                LoadType.PREPEND -> {
                    val id = newsKeyDao.max() ?: return MediatorResult.Success(
                        endOfPaginationReached = true
                    )
                    service.getAllNews(true, id, state.config.pageSize)
                }
                LoadType.APPEND -> {
                    val id = newsKeyDao.min() ?: return MediatorResult.Success(
                        endOfPaginationReached = false
                    )

                    /*  НУЖНО УТОЧНИТЬ НАСЧЕТ getAllClaims  */

                    service.getAllNews(true, id, state.config.pageSize)
                }
            }
            if (!response.isSuccessful) {
                throw ApiException(response.code(), response.message())
            }
            val body = response.body() ?: throw ApiException(response.code(), response.message())

            db.withTransaction {
                when (loadType) {
                    LoadType.REFRESH -> {
                        newsKeyDao.removeAll()

                        newsKeyDao.insert(
                            listOf(
                                NewsKeyEntity(
                                    type = NewsKeyEntity.KeyType.AFTER,
                                    page = body.newsList.first().id,
                                ),
                                NewsKeyEntity(
                                    type = NewsKeyEntity.KeyType.BEFORE,
                                    page = body.newsList.last().id,
                                ),
                            )
                        )
                        newsDao.removeAll()
                    }
                    LoadType.PREPEND -> {
                        newsKeyDao.insert(
                            NewsKeyEntity(
                                type = NewsKeyEntity.KeyType.AFTER,
                                page = body.newsList.first().id
                            )
                        )
                    }
                    LoadType.APPEND -> {
                        newsKeyDao.insert(
                            NewsKeyEntity(
                                type = NewsKeyEntity.KeyType.BEFORE,
                                page = body.newsList.last().id
                            )
                        )
                    }
                }
                newsDao.insert(body.newsList.toEntity())
            }
            return MediatorResult.Success(endOfPaginationReached = body.newsList.isEmpty())
        } catch (e: Exception) {
            return MediatorResult.Error(e)
        }
    }
}