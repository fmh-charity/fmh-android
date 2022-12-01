package ru.iteco.fmhandroid.dto

data class NewsKey(
    val type: Status,
    val page: Int
) {
    enum class Status {
        AFTER, BEFORE
    }
}
