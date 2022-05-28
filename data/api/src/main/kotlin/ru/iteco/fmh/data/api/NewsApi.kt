package ru.iteco.fmh.data.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmh.model.News

interface NewsApi {
    @GET("news")
    suspend fun getAllNews(): Response<List<News>>

    @PUT("news")
    suspend fun editNewsItem(@Body newsItem: News): Response<News>

    @POST("news")
    suspend fun saveNewsItem(@Body newsItem: News): Response<News>

    @DELETE("news/{id}")
    suspend fun removeNewsItemById(@Path("id") id: Int): Response<Unit>
}
