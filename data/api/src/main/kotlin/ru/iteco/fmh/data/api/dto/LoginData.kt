package ru.iteco.fmh.data.api.dto

import com.google.gson.annotations.SerializedName

class LoginData(
    @SerializedName("login")
    val login: String,
    @SerializedName("password")
    val password: String
)
