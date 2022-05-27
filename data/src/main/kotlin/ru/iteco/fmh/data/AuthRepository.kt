package ru.iteco.fmh.data

import ru.iteco.fmh.model.AuthState

interface AuthRepository {
    suspend fun login(login: String, password: String)

    /**
     * Обновляет токены при помощи [refreshToken]
     *
     * @return обновленные токены.
     * Если [refreshToken] истек возвращает `null`.
     */
    suspend fun updateTokens(refreshToken: String): AuthState?
}
