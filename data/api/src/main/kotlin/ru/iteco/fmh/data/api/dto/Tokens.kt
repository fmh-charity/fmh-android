package ru.iteco.fmh.data.api.dto

import com.google.gson.annotations.SerializedName

class Tokens(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("refreshToken")
    val refreshToken: String
)