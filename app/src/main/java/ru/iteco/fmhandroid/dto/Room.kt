package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Room(
    val id: Int,
    val name: String,
    val blockId: Int,
    val nurseStationId: Int,
    val maxOccupancy: Int,
    val comment: String
) : Parcelable
