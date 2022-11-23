package ru.iteco.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.iteco.fmhandroid.dto.WishComment


@Entity(tableName = "WishCommentEntity")
data class WishCommentEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int?,
    @ColumnInfo(name = "wishId")
    val wishId: Int,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "creatorId")
    val creatorId: Int,
    @ColumnInfo(name = "createDate")
    val createDate: Long
)

fun List<WishComment>.toEntity(): List<WishCommentEntity> = map(WishComment::toEntity)
fun WishComment.toEntity() = WishCommentEntity(
    id = id,
    wishId = wishId,
    description = description,
    creatorId = creatorId,
    createDate = createDate
)