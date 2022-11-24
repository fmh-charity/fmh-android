package ru.iteco.fmhandroid.dto

data class NewsResponseDto(
    val newsList: List<News>,
    val page: Int
)
