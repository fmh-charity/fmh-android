package ru.iteco.fmhandroid.repository.newsRepository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import ru.iteco.fmhandroid.api.NewsApi
import ru.iteco.fmhandroid.dto.News
import ru.iteco.fmhandroid.exceptions.ApiException

class NewsPageSource(
    private val service: NewsApi
) : PagingSource<Int, News>() {

    override fun getRefreshKey(state: PagingState<Int, News>): Int? {
        val anchorPosition = state.anchorPosition ?: return null
        val page = state.closestPageToPosition(anchorPosition) ?: return null
        return page.prevKey?.plus(1) ?: page.nextKey?.minus(1)
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, News> {
        try {
            val page = params.key ?: 1
            val pageSize: Int = params.loadSize.coerceAtMost(20)
            val response = service.getAllNews(true, page, pageSize)

            return if (response.isSuccessful) {
                val news = response.body()!!.elements
                val nextPageNumber = if (news.isEmpty()) null else page + 1
                val prevPageNumber = if (page > 1) page - 1 else null
                LoadResult.Page(news, prevPageNumber, nextPageNumber)
            } else {
                LoadResult.Error(ApiException(response.code(), response.message()))
            }
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }
}