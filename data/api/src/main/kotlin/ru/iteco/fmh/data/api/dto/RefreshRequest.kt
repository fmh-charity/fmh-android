package ru.iteco.fmh.data.api.dto

import com.google.gson.annotations.SerializedName

class RefreshRequest(
    @SerializedName("refreshToken")
    val refreshToken: String
)
