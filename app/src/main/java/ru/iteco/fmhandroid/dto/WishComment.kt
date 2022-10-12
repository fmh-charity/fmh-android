package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WishComment(
    val id: Int? = null,
    val wish_id: Int,
    val description: String,
    val creator_id: Int,
    val create_date: Long
) : Parcelable {
}