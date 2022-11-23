package ru.iteco.fmhandroid.api


import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.*

interface WishApi {

    @GET("wishes")
    suspend fun getAllWishes(): Response<List<Wish>>

    @POST("wishes")
    suspend fun createWish(@Body wish: Wish): Response<Wish>

    @PUT("wishes")
    suspend fun updateWish(@Body wish: Wish): Response<Wish>

    @GET("wishes/{id}")
    suspend fun getWishById(@Path("id") id: Int): Response<Wish>

    @GET("wishes/{id}/comments")
    suspend fun getAllWishComments(@Path("id") id: Int): Response<List<WishComment>>

     @POST("wishes/{id}/comments")
    suspend fun createCommentForWish(
        @Path("id") id: Int,
        @Body wishComment: WishComment
    ): Response<WishComment>

    @PUT("wishes/{id}/status")
    suspend fun processingWishForStatusModel(
        @Path("id") id: Int,
        @Query("status") wishStatus: Wish.Status,
        @Query("executorId") executorId: Int?,
        @Body wishComment: WishComment
    ): Response<Wish>

    @PUT("wishes/comments")
    suspend fun updateInfoCommentForWish(@Body wishId: Int, comment: WishComment): Response<WishComment>

    @GET("wishes/comments/{id}")
    suspend fun getFullInfoCommentForWish(@Path("id") id: Long): Response<WishComment>

    @GET("wishes/open-in-progress")
    suspend fun getWishInOpenAndInProgressStatus(): Response<List<Wish>>

   }
