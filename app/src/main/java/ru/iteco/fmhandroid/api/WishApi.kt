package ru.iteco.fmhandroid.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.*

interface WishApi {

    /**реестр всех просьб*/
     @GET("wishes")
    suspend fun getAllWishes(): Response<List<Wish>>

    /**реестр всех комментариев просьб*/
    @GET("wishes/{id}/comments")
    suspend fun getAllWishComments(@Path("id") id: Int): Response<List<WishComment>>

    /**получение полной информации по просьбе*/
    @GET("wishes/{id}")
    suspend fun getWishById(@Path("id") id: Int): Response<Wish>

    /**область видимости для просьбы*/
    @GET("wishes/visibility ")
    //TODO Область видимости???

    /**создание новой  просьбы*/
    @POST("wishes")
    suspend fun createWish(@Body wish: Wish): Response<Wish>

    /**реестр всех просьб со статусом open-in-progress*/
    @GET("wishes/{id}/wishes/open-in-progress")
    suspend fun getWishInOpenAndInProgressStatus(): Response<List<Wish>>

    /**получение полной информации по комментарию просьбы*/
    @GET("wishes/comments/{id}")
    suspend fun getFullInfoCommentForWish(@Path("id") id: Long): Response<WishComment>

    /**создание нового комментария*/
    @POST("wishes/{id}/comments")
    suspend fun createCommentForWish(
        @Path("id") id: Int,
        @Body wishComment: WishComment
    ): Response<WishComment>

    /**обновление информации по просьбе*/
    @PUT("wishes")
    suspend fun updateWish(@Body wish: Wish): Response<Wish>

    /**обработка просьб по статусной модели*/
    @PUT("wishes/{id}/status")
    suspend fun processingWishForStatusModel(
        @Path("id") id: Int,
        @Query("status") wishStatus: Wish.Status,
        @Query("executorId") executorId: Int?,
        @Body wishComment: WishComment
    ): Response<Wish>

    /**обновление информации по комментарию*/
    @PUT("wishes/comments")
    suspend fun updateInfoCommentForWish(@Body wishId: Int, comment: WishComment): Response<WishComment>
   }
