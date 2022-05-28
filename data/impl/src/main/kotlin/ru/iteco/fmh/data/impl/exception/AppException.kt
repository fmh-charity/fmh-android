package ru.iteco.fmh.data.impl.exception

import android.database.SQLException
import java.io.IOException
import java.net.ConnectException

internal sealed class AppException(var code: String) : RuntimeException() {
    companion object {
        fun from(e: Throwable): AppException = when (e) {
            is AppException -> e
            is IllegalArgumentException -> AuthorizationException
            is SQLException -> DbException
            is IOException -> ServerException
            is ConnectException -> LostConnectException
            else -> UnknownException
        }
    }
}

internal class ApiException(val statusCode: Int, code: String) : AppException(code)
internal object AuthorizationException : AppException("authorization_failed")
internal object ServerException : AppException("error_server")
internal object DbException : AppException("error_db")
internal object LostConnectException : AppException("error_connect")
internal object UnknownException : AppException("error_unknown")
