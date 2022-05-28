package ru.iteco.fmh.data.api

import retrofit2.Response
import retrofit2.http.GET
import ru.iteco.fmh.model.User

interface UserApi {
    @GET("users")
    suspend fun getAllUsers(): Response<List<User>>

    @GET("authentication/userInfo")
    suspend fun getUserInfo(): Response<User>
}
