package ru.iteco.fmh.data.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import ru.iteco.fmh.data.api.dto.LoginData
import ru.iteco.fmh.data.api.dto.Tokens

interface AuthApi {
    @POST("authentication/login")
    suspend fun getTokens(
        @Body loginData: LoginData
    ): Response<Tokens>
}
