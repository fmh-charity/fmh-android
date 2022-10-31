package ru.iteco.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.iteco.fmhandroid.dto.NurseStation

@Entity(tableName = "NurseStationEntity")
data class NurseStationEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "blockId")
    val blockId: Int,
    @ColumnInfo(name = "comment")
    val comment: String
)

fun List<NurseStation>.toEntity(): List<NurseStationEntity> = map(NurseStation::toEntity)
fun NurseStation.toEntity() = NurseStationEntity(
    id = id,
    name = name,
    blockId = blockId,
    comment = comment
)
