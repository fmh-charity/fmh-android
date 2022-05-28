package ru.iteco.fmhandroid.dto

import android.os.Parcelable

@kotlinx.parcelize.Parcelize
data class NewsFilterArgs(
    val category: String? = null,
    val dates: List<Long>? = null,
    val status: Boolean? = null
) : Parcelable