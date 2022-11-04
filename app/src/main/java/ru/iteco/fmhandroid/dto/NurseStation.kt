package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NurseStation(
    val id: Int,
    val name: String,
    val blockId: Int,
    val comment: String
): Parcelable
