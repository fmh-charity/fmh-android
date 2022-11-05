package ru.iteco.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.iteco.fmhandroid.dto.Wish

@Entity(tableName = "WishEntity")
data class WishEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int? = null,
    @ColumnInfo(name = "patientId")
    val patientId: Int,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "creatorId")
    val creatorId: Int,
    @ColumnInfo(name = "executorId")
    val executorId: Int,
    @ColumnInfo(name = "createDate")
    val createDate: Long,
    @ColumnInfo(name = "planExecuteDate")
    val planExecuteDate: Long,
    @ColumnInfo(name = "factExecuteDate")
    val factExecuteDate: Long,
    @ColumnInfo(name = "status")
    val status: Wish.Status
)

fun List<Wish>.toEntity(): List<WishEntity> = map(Wish::toEntity)
fun Wish.toEntity() = WishEntity(
    id = id,
    patientId = patientId,
    title = title,
    description = description,
    creatorId = creatorId,
    executorId = executorId,
    createDate = createDate,
    planExecuteDate = planExecuteDate,
    factExecuteDate = factExecuteDate,
    status = status
)