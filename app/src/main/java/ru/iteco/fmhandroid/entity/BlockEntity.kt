package ru.iteco.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.iteco.fmhandroid.dto.Block

@Entity(tableName = "BlockEntity")
data class BlockEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "comment")
    val comment: String
)

fun List<Block>.toEntity(): List<BlockEntity> = map(Block::toEntity)
fun Block.toEntity() = BlockEntity(
    id = id,
    name = name,
    comment = comment
)
