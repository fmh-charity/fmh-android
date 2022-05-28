package ru.iteco.fmh.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.iteco.fmh.model.Claim

@Entity(tableName = "ClaimEntity")
data class ClaimEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int?,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "creatorId")
    val creatorId: Int,
    @ColumnInfo(name = "creatorName")
    val creatorName: String,
    @ColumnInfo(name = "executorId")
    val executorId: Int?,
    @ColumnInfo(name = "executorName")
    val executorName: String?,
    @ColumnInfo(name = "createDate")
    val createDate: Long,
    @ColumnInfo(name = "planExecuteDate")
    val planExecuteDate: Long,
    @ColumnInfo(name = "factExecuteDate")
    val factExecuteDate: Long?,
    @ColumnInfo(name = "status")
    val status: Claim.Status,
)
