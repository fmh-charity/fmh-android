package ru.iteco.fmh.model

data class AuthState(
    val accessToken: String,
    val refreshToken: String
)
