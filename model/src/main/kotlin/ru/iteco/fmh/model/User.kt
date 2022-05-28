package ru.iteco.fmh.model

data class User(
    var id: Int,
    val admin: Boolean,
    val firstName: String,
    val lastName: String,
    val middleName: String,
)
