package ru.iteco.fmhandroid.dto

import android.os.Parcelable

@kotlinx.parcelize.Parcelize
data class News(
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
) : Parcelable {
    @kotlinx.parcelize.Parcelize
    data class Category(
        val id: Int,
        val name: String,
        val deleted: Boolean
    ) : Parcelable {

        enum class Type {
            Advertisement, Salary, Union, Birthday, Holiday, Massage, Gratitude, Help, Unknown
        }
    }
}

