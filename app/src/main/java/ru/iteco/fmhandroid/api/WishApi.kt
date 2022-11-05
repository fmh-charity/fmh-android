package ru.iteco.fmhandroid.api

import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.*

interface WishApi {

    @GET("wishes")
    suspend fun getAllWish(): Response<List<Wish>>

    @POST("wishes")
    suspend fun saveWishItem(@Body wishItem: Wish): Response<Wish>

    @GET("wishes/{id}/comments")
    suspend fun getAllWishComments(@Path("id") id: Int): Response<List<WishComment>>

    @GET("wishes/open-in-progress")
    suspend fun getWishsInOpenAndInProgressStatus(): Response<List<Wish>>

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

   }
