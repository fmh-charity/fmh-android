package ru.iteco.fmhandroid.repository.newsRepository

import android.graphics.pdf.PdfRenderer.Page
import androidx.paging.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import ru.iteco.fmhandroid.api.NewsApi
import ru.iteco.fmhandroid.dao.NewsCategoryDao
import ru.iteco.fmhandroid.dao.NewsDao
import ru.iteco.fmhandroid.dao.NewsKeyDao
import ru.iteco.fmhandroid.db.AppDb
import ru.iteco.fmhandroid.dto.News
import ru.iteco.fmhandroid.dto.NewsWithCategory
import ru.iteco.fmhandroid.entity.*
import ru.iteco.fmhandroid.utils.Utils
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewsRepositoryImpl @Inject constructor(
    private val newsDao: NewsDao,
    private val newsCategoryDao: NewsCategoryDao,
    private val newsApi: NewsApi,
    private val db: AppDb,
    private val newsKeyDao: NewsKeyDao
) : NewsRepository {

    @OptIn(ExperimentalPagingApi::class)
    override fun getAllNews(
        coroutineScope: CoroutineScope
    ): Flow<PagingData<News>> = Pager(
        config = PagingConfig(pageSize = 10),
        remoteMediator = NewsRemoteMediator(newsApi, db, newsDao, newsKeyDao),
        pagingSourceFactory = newsDao::pagingSource
    ).flow.map { pagingData ->
        pagingData.map(NewsEntity::toDto)
    }

    override suspend fun changeIsOpen(newsItem: News) {
        newsDao.insert(newsItem.toEntity())
    }

    override suspend fun refreshNews() = Utils.makeRequest(
        request = { newsApi.getAllNews() },
        onSuccess = { body ->
            val apiId = body
                .newsList.map { it.id }
            val databaseId = newsDao.getAllNewsList()
                .map { it.newsItem.id }
                .toMutableList()
            databaseId.removeAll(apiId)
            newsDao.removeNewsItemsByIdList(databaseId)
            newsDao.insert(body.newsList.toEntity())
        }
    )

    override suspend fun modificationOfExistingNews(newsItem: News): News =
        Utils.makeRequest(
            request = { newsApi.editNewsItem(newsItem) },
            onSuccess = { body ->
                newsDao.insert(body.toEntity())
                body
            }
        )

    override suspend fun createNews(newsItem: News): News =
        Utils.makeRequest(
            request = { newsApi.saveNewsItem(newsItem) },
            onSuccess = { body ->
                newsDao.insert(body.toEntity())
                body
            }
        )

    override suspend fun removeNewsItemById(id: Int) =
        Utils.makeRequest(
            request = { newsApi.removeNewsItemById(id) },
            onSuccess = {
                newsDao.removeNewsItemById(id)
            }
        )

    override fun getAllNewsCategories(): Flow<List<News.Category>> =
        newsCategoryDao.getAllNewsCategories().map { it.toNewsCategoryDto() }

    override suspend fun saveNewsCategories(listNewsCategories: List<News.Category>) =
        newsCategoryDao.insert(listNewsCategories.toNewsCategoryEntity())
}