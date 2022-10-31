package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Relation
import ru.iteco.fmhandroid.entity.RoomEntity


@kotlinx.parcelize.Parcelize
data class FullNurseStation(
    @Embedded
    val nurseStation: NurseStation,

    @Relation(
        entity = RoomEntity::class,
        parentColumn = "id",
        entityColumn = "nurseStationId"
    )
    val rooms: List<ru.iteco.fmhandroid.dto.Room>
) : Parcelable
