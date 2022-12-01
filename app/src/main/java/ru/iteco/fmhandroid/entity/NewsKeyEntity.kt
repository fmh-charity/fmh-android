package ru.iteco.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.iteco.fmhandroid.dto.NewsKey

@Entity
class NewsKeyEntity(
    @PrimaryKey
    @ColumnInfo(name = "type")
    val type: NewsKey.Status,
    @ColumnInfo(name = "page")
    val page: Int
)