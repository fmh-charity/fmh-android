package ru.iteco.fmhandroid.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.News
import ru.iteco.fmhandroid.dto.NewsResponseDto

interface NewsApi {
    @GET("news")
    suspend fun getAllNews(
        @Query("createDate") createDate: Boolean = true,
        @Query("elements") elements: Int = 8,
        @Query("newsCategoryId") newsCategoryId: Int? = null,
        @Query("pages") pages: Int = 0,
        @Query("publishDateFrom") publishDateFrom: Long? = null,
        @Query("publishDateTo") publishDateTo: Long? = null,
        ): Response<NewsResponseDto>

    @PUT("news")
    suspend fun editNewsItem(@Body newsItem: News): Response<News>

    @POST("news")
    suspend fun saveNewsItem(@Body newsItem: News): Response<News>

    @DELETE("news/{id}")
    suspend fun removeNewsItemById(@Path("id") id: Int): Response<Unit>
}
