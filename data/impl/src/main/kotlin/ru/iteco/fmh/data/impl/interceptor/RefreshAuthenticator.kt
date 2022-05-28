package ru.iteco.fmh.data.impl.interceptor

import kotlinx.coroutines.runBlocking
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import ru.iteco.fmh.data.AuthRepository
import ru.iteco.fmh.data.impl.AppAuth
import javax.inject.Provider

class RefreshAuthenticator(
    private val authRepositoryProvider: Provider<AuthRepository>,
    private val appAuth: AppAuth
) : Authenticator {
    override fun authenticate(route: Route?, response: Response): Request? {
        synchronized(this) {
            val authRepository = authRepositoryProvider.get()
            val refreshToken = checkNotNull(appAuth.authState) {
                "user must be authorized"
            }.refreshToken
            val accessToken: String? = runBlocking {
                authRepository.updateTokens(refreshToken)
            }?.accessToken
            if (appAuth.authState == null) {
                return null
            }
            return accessToken?.let {
                response.request().newBuilder()
                    .header("Authorization", it)
                    .build()
            }
        }
    }
}
