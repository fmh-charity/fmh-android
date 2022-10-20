package ru.iteco.fmhandroid.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.Wish

interface WishApi {

        @GET("wish")
        suspend fun getAllWish(): Response<List<Wish>>

        @PUT("wish")
        suspend fun editWishItem(@Body wishItem: Wish): Response<Wish>

        @POST("wish")
        suspend fun saveWishItem(@Body wishItem: Wish): Response<Wish>

        @DELETE("wish/{id}")
        suspend fun removeWishItemById(@Path("id") id: Int): Response<Unit>
    }
