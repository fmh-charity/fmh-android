package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WishComment(
    val id: Int? = null,
    val wishId: Int,
    val description: String,
    val creatorId: Int
) : Parcelable {
}