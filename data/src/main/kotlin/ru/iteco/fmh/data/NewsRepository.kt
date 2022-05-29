package ru.iteco.fmh.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmh.model.News

interface NewsRepository {
    suspend fun refreshNews()
    suspend fun modificationOfExistingNews(newsItem: News): News
    suspend fun createNews(newsItem: News): News
    suspend fun removeNewsItemById(id: Int)
    fun getAllNewsCategories(): Flow<List<News.Category>>
    suspend fun saveNewsCategories(listNewsCategories: List<News.Category>)
    fun getAllNews(
        coroutineScope: CoroutineScope,
        publishEnabled: Boolean? = null,
        publishDateBefore: Long? = null,
        newsCategoryId: Int? = null,
        dateStart: Long? = null,
        dateEnd: Long? = null,
        status: Boolean? = null
    ): Flow<List<News.WithCategory>>

    suspend fun changeIsOpen(newsItem: News)
}