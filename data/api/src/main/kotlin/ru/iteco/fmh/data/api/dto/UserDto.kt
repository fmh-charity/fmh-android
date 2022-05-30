package ru.iteco.fmh.data.api.dto

import com.google.gson.annotations.SerializedName

class UserDto(
    @SerializedName("id")
    var id: Int,
    @SerializedName("admin")
    val admin: Boolean,
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("middleName")
    val middleName: String,
)
