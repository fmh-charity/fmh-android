package ru.iteco.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.iteco.fmhandroid.dto.Room

@Entity(tableName = "RoomEntity")
data class RoomEntity (
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int?,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "blockId")
    val blockId: Int,
    @ColumnInfo(name = "nurseStationId")
    val nurseStationId: Int,
    @ColumnInfo(name = "maxOccupancy")
    val maxOccupancy: Int,
    @ColumnInfo(name = "comment")
    val comment: String
    )

fun List<Room>.toEntity(): List<RoomEntity> = map(Room::toEntity)
fun Room.toEntity() = RoomEntity(
    id = id,
    name = name,
    blockId = blockId,
    nurseStationId = nurseStationId,
    maxOccupancy = maxOccupancy,
    comment = comment
)