package ru.iteco.fmh.data.impl

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import ru.iteco.fmh.data.NewsRepository
import ru.iteco.fmh.data.api.NewsApi
import ru.iteco.fmh.data.db.dao.NewsCategoryDao
import ru.iteco.fmh.data.db.dao.NewsDao
import ru.iteco.fmh.data.impl.converter.toDto
import ru.iteco.fmh.data.impl.converter.toEntity
import ru.iteco.fmh.data.impl.converter.toModel
import ru.iteco.fmh.data.impl.util.makeRequest
import ru.iteco.fmh.model.News
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewsRepositoryImpl @Inject constructor(
    private val newsDao: NewsDao,
    private val newsCategoryDao: NewsCategoryDao,
    private val newsApi: NewsApi
) : NewsRepository {
    override fun getAllNews(
        coroutineScope: CoroutineScope,
        publishEnabled: Boolean?,
        publishDateBefore: Long?,
        newsCategoryId: Int?,
        dateStart: Long?,
        dateEnd: Long?,
        status: Boolean?
    ): Flow<List<News.WithCategory>> = newsDao.getAllNews(
        publishEnabled = publishEnabled,
        publishDateBefore = publishDateBefore,
        newsCategoryId = newsCategoryId,
        dateStart = dateStart,
        dateEnd = dateEnd,
        status = status
    ).flowOn(Dispatchers.Default).map {
        it.toModel()
    }

    override suspend fun changeIsOpen(newsItem: News) {
        newsDao.insert(newsItem.toEntity())
    }

    override suspend fun refreshNews() = makeRequest(
        request = { newsApi.getAllNews() },
        onSuccess = { body ->
            val apiIds = body
                .map { it.id }
            val databaseIds = newsDao.getAllNewsList()
                .map { it.newsItem.id }
                .toMutableList()
            databaseIds.removeAll(apiIds)
            newsDao.removeNewsItemsByIdList(databaseIds)
            newsDao.insert(body.map { it.toEntity() })
        }
    )

    override suspend fun modificationOfExistingNews(newsItem: News): News =
        makeRequest(
            request = { newsApi.editNewsItem(newsItem.toDto()) },
            onSuccess = { body ->
                newsDao.insert(body.toEntity())
                body.toModel()
            }
        )

    override suspend fun createNews(newsItem: News): News =
        makeRequest(
            request = { newsApi.saveNewsItem(newsItem.toDto()) },
            onSuccess = { body ->
                newsDao.insert(body.toEntity())
                body.toModel()
            }
        )

    override suspend fun removeNewsItemById(id: Int) =
        makeRequest(
            request = { newsApi.removeNewsItemById(id) },
            onSuccess = {
                newsDao.removeNewsItemById(id)
            }
        )

    override fun getAllNewsCategories(): Flow<List<News.Category>> =
        newsCategoryDao.getAllNewsCategories().map { it.toModel() }

    override suspend fun saveNewsCategories(listNewsCategories: List<News.Category>) =
        newsCategoryDao.insert(listNewsCategories.toEntity())
}