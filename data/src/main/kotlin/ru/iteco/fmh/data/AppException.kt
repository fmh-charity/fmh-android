package ru.iteco.fmh.data

sealed class AppException(var code: String) : RuntimeException()

class ApiException(val statusCode: Int, code: String) : AppException(code)
object AuthorizationException : AppException("authorization_failed")
object ServerException : AppException("error_server")
object DbException : AppException("error_db")
object LostConnectException : AppException("error_connect")
object UnknownException : AppException("error_unknown")
