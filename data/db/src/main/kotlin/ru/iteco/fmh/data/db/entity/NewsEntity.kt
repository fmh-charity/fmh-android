package ru.iteco.fmh.data.db.entity

import androidx.room.*

@Entity(tableName = "NewsEntity")
data class NewsEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int?,
    @ColumnInfo(name = "newsCategoryId")
    val newsCategoryId: Int,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "creatorId")
    val creatorId: Int,
    @ColumnInfo(name = "creatorName")
    val creatorName: String,
    @ColumnInfo(name = "createDate")
    val createDate: Long,
    @ColumnInfo(name = "publishDate")
    val publishDate: Long,
    @ColumnInfo(name = "publishEnabled")
    val publishEnabled: Boolean = false,
    @ColumnInfo(name = "isOpen")
    val isOpen: Boolean = false,
) {

    data class WithCategory(
        @Embedded
        val newsItem: NewsEntity,
        @Relation(
            entity = NewsCategoryEntity::class,
            parentColumn = "newsCategoryId",
            entityColumn = "id"
        )
        val category: NewsCategoryEntity
    )
}
