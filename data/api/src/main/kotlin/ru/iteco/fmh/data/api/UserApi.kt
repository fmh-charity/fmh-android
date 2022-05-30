package ru.iteco.fmh.data.api

import retrofit2.Response
import retrofit2.http.GET
import ru.iteco.fmh.data.api.dto.UserDto

interface UserApi {
    @GET("users")
    suspend fun getAllUsers(): Response<List<UserDto>>

    @GET("authentication/userInfo")
    suspend fun getUserInfo(): Response<UserDto>
}
