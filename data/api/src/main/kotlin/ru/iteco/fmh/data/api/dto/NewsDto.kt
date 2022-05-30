package ru.iteco.fmh.data.api.dto

import com.google.gson.annotations.SerializedName


class NewsDto(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("newsCategoryId")
    val newsCategoryId: Int,
    @SerializedName("title")
    val title: String = "",
    @SerializedName("description")
    val description: String = "",
    @SerializedName("creatorId")
    val creatorId: Int = 1,
    @SerializedName("creatorName")
    val creatorName: String,
    @SerializedName("createDate")
    val createDate: Long,
    @SerializedName("publishDate")
    val publishDate: Long,
    @SerializedName("publishEnabled")
    val publishEnabled: Boolean = false,
    @SerializedName("isOpen")
    val isOpen: Boolean = false
)

