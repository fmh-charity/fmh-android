package ru.iteco.fmh.data.impl.util

import retrofit2.Response
import ru.iteco.fmh.data.*
import java.io.IOException
import java.net.ConnectException

internal suspend fun <T, R> makeRequest(
    request: suspend () -> Response<T>,
    onSuccess: suspend (body: T) -> R,
    onFailure: (response: Response<T>) -> R = { throw ApiException(it.code(), it.message()) }
): R {
    try {
        val response = request()
        if (!response.isSuccessful) return onFailure(response)
        val body =
            response.body() ?: throw ApiException(response.code(), response.message())
        return onSuccess(body)
    } catch (e: ConnectException) {
        throw LostConnectException
    } catch (e: IOException) {
        throw ServerException
    } catch (e: AuthorizationException) {
        throw AuthorizationException
    } catch (e: Exception) {
        throw UnknownException
    }
}
