package ru.iteco.fmh.data.api.dto

import com.google.gson.annotations.SerializedName

class JwtResponse(
    @SerializedName("code")
    val code: String,
    @SerializedName("message")
    val message: String
)
