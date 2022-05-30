package ru.iteco.fmh.data.api.dto


class NewsDto(
    val id: Int? = null,
    val newsCategoryId: Int,
    val title: String = "",
    val description: String = "",
    val creatorId: Int = 1,
    val creatorName: String,
    val createDate: Long,
    val publishDate: Long,
    val publishEnabled: Boolean = false,
    val isOpen: Boolean = false
)

