package ru.iteco.fmh.data.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmh.data.api.dto.NewsDto

interface NewsApi {
    @GET("news")
    suspend fun getAllNews(): Response<List<NewsDto>>

    @PUT("news")
    suspend fun editNewsItem(@Body newsItem: NewsDto): Response<NewsDto>

    @POST("news")
    suspend fun saveNewsItem(@Body newsItem: NewsDto): Response<NewsDto>

    @DELETE("news/{id}")
    suspend fun removeNewsItemById(@Path("id") id: Int): Response<Unit>
}
