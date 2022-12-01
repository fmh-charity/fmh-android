package ru.iteco.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.iteco.fmhandroid.dto.ClaimKey

@Entity
class ClaimKeyEntity(
    @PrimaryKey
    @ColumnInfo(name = "type")
    val type: ClaimKey.Status,
    @ColumnInfo(name = "page")
    val page: Int
)