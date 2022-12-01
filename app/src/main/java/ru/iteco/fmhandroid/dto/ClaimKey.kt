package ru.iteco.fmhandroid.dto

data class ClaimKey(
    val type: Status,
    val page: Int
) {
    enum class Status {
        AFTER, BEFORE
    }
}