package ru.iteco.fmhandroid.repository.newsRepository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import ru.iteco.fmhandroid.api.NewsApi
import ru.iteco.fmhandroid.dto.News
import ru.iteco.fmhandroid.exceptions.ApiException
import java.lang.Exception


class NewsPagingSource(
    private val service: NewsApi,
): PagingSource<Long, News>() {
    override fun getRefreshKey(state: PagingState<Long, News>): Long? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Long>): LoadResult<Long, News> {
        try {
            val response = when(params){
                is LoadParams.Refresh -> service.getLatest(params.loadSize)
                is LoadParams.Prepend -> return LoadResult.Page(
                    data = emptyList(),
                    prevKey = params.key,
                    nextKey = null
                )
                is LoadParams.Append -> service.getBefore(params.key, params.loadSize)
            }
            if (!response.isSuccessful){
             throw ApiException(response.code(), response.message())
            }
            val body = response.body() ?: throw ApiException(
                response.code(),
                response.message()
            )
            val nextKey = if (body.isEmpty()) null else body.last().id
            return LoadResult.Page(
                data = body,
                prevKey = params.key,
                nextKey = nextKey?.toLong(),
            )
        } catch (e: Exception){
            return  LoadResult.Error(e)
        }
    }
}