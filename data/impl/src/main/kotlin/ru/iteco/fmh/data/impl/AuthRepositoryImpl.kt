package ru.iteco.fmh.data.impl

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import ru.iteco.fmh.data.AuthRepository
import ru.iteco.fmh.data.api.AuthApi
import ru.iteco.fmh.data.api.RefreshTokensApi
import ru.iteco.fmh.data.api.dto.JwtResponse
import ru.iteco.fmh.data.api.dto.LoginData
import ru.iteco.fmh.data.api.dto.RefreshRequest
import ru.iteco.fmh.data.impl.exception.ApiException
import ru.iteco.fmh.data.impl.exception.AuthorizationException
import ru.iteco.fmh.data.impl.exception.UnknownException
import ru.iteco.fmh.data.impl.util.makeRequest
import ru.iteco.fmh.model.AuthState
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepositoryImpl @Inject constructor(
    private val authApi: AuthApi,
    private val refreshTokensApi: RefreshTokensApi,
    private val appAuth: AppAuth
) : AuthRepository {

    override suspend fun login(login: String, password: String) =
        makeRequest(
            request = { authApi.getTokens(LoginData(login = login, password = password)) },
            onSuccess = { body -> appAuth.authState = body },
            onFailure = {
                // Было бы здорово вынести этот код в отдельную функцию.
                val gson = Gson()
                val type = object : TypeToken<JwtResponse>() {}.type
                val errorResponse: JwtResponse? = gson.fromJson(it.errorBody()?.charStream(), type)
                if (errorResponse?.message.equals("ERR_INVALID_LOGIN")) {
                    throw AuthorizationException
                } else {
                    throw UnknownException
                }
            }
        )

    override suspend fun updateTokens(refreshToken: String): AuthState? =
        makeRequest(
            request = {
                refreshTokensApi.refreshTokens(
                    refreshToken,
                    RefreshRequest(refreshToken)
                )
            },
            onSuccess = { body ->
                appAuth.authState = body
                body
            },
            onFailure = {
                if (it.code() == 401) {
                    appAuth.authState = null
                    null
                } else {
                    throw ApiException(it.code(), it.message())
                }
            }
        )
}