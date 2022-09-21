package ru.iteco.fmh.data

import ru.iteco.fmh.model.AuthState

interface AppAuth {

    /**
     * Набор токенов. `null` если пользователь не авторизован
     */
    var authState: AuthState?
}