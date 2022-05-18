package ru.iteco.fmhandroid.dto

data class Room(
    val id: Int,
    val name: String,
    val blockId: Int,
    val nurseStationId: Int,
    val maxOccupancy: Int,
    val comment: String
)
