package ru.iteco.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "remote_key")
data class ClaimRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "object_id")
    val objectId: Int?,
    val prevKey: Int?,
    val currentPage: Int,
    val nextKey: Int?,
    @ColumnInfo(name = "created_at")
    val createdAt: Long = System.currentTimeMillis()
)