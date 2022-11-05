package ru.iteco.fmhandroid.api

import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.*

interface WishApi {

    @GET("wishes")
    suspend fun getAllWish(): Response<List<Wish>>

    @POST("wishes")
    suspend fun createWishItem(@Body wishItem: Wish): Response<Wish>

    @PUT("wishes")
    suspend fun updateWishItem(@Body wishItem: Wish): Response<Wish>

    @GET("wishes/{id}")
    suspend fun getWishById(@Path("id") id: Long): Response<Wish>

    @GET("wishes/{id}/comments")
    suspend fun getAllWishComments(@Path("id") id: Int): Response<List<WishComment>>

     @POST("wishes/{id}/comments")
    suspend fun saveWishComment(
        @Path("id") id: Int,
        @Body wishComment: WishComment
    ): Response<WishComment>

    @PUT("wishes/{id}/status")
    suspend fun updateWishStatus(
        @Path("id") id: Int,
        @Query("status") wishStatus: Wish.Status,
        @Query("executorId") executorId: Int?,
        @Body wishComment: WishComment
    ): Response<Wish>

    @PUT("wishes/comments")
    suspend fun updateWishComment(@Body wishComment: WishComment): Response<WishComment>

    @GET("wishes/comments/{id}")
    suspend fun getWishCommentById(@Path("id") id: Long): Response<WishComment>

    @GET("wishes/open-in-progress")
    suspend fun getWishInOpenAndInProgressStatus(): Response<List<Wish>>

   }
