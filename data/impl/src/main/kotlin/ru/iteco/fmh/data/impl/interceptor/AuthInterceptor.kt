package ru.iteco.fmh.data.impl.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import ru.iteco.fmh.data.impl.AppAuth

class AuthInterceptor(private val auth: AppAuth) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val token = checkNotNull(auth.authState) {
            "User must be authorized"
        }.accessToken

        val newRequest = chain.request().newBuilder()
            .header("Authorization", token)
            .build()
        return chain.proceed(newRequest)
    }
}
