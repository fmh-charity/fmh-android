package ru.iteco.fmh.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ClaimCommentEntity")
data class ClaimCommentEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int?,
    @ColumnInfo(name = "claimId")
    val claimId: Int,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "creatorId")
    val creatorId: Int,
    @ColumnInfo(name = "creatorName")
    val creatorName: String,
    @ColumnInfo(name = "createDate")
    val createDate: Long
)
