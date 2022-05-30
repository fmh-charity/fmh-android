package ru.iteco.fmh.data.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import ru.iteco.fmh.data.api.dto.RefreshRequest
import ru.iteco.fmh.data.api.dto.Tokens

interface RefreshTokensApi {
    @POST("authentication/refresh")
    suspend fun refreshTokens(
        @Header("Authorization") refreshToken: String,
        @Body refreshRequest: RefreshRequest
    ): Response<Tokens>
}
