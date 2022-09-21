package ru.iteco.fmh.data.db.entity

import androidx.room.*
import ru.iteco.fmh.data.db.converter.ClaimStatusConverter

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
    @TypeConverters(ClaimStatusConverter::class)
    val status: Status,
) {

    enum class Status {
        CANCELLED,
        EXECUTED,
        IN_PROGRESS,
        OPEN
    }

    class WithComments(
        @Embedded
        val claim: ClaimEntity,

        @Relation(
            entity = ClaimCommentEntity::class,
            parentColumn = "id",
            entityColumn = "claimId"
        )
        val comments: List<ClaimCommentEntity>?
    )
}
