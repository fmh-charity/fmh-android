package ru.iteco.fmh.data.impl.converter

import ru.iteco.fmh.data.api.dto.Tokens
import ru.iteco.fmh.model.AuthState

internal fun Tokens.toModel() = AuthState(
    accessToken = accessToken,
    refreshToken = refreshToken
)