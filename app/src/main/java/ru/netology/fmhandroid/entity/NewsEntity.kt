package ru.netology.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.netology.fmhandroid.dto.News
import ru.netology.fmhandroid.utils.Utils
import java.sql.Timestamp
import java.time.LocalDateTime
import java.time.ZoneOffset

@Entity(tableName = "NewsEntity")
data class NewsEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int?,
    @ColumnInfo(name = "newsCategoryId")
    val newsCategoryId: Int? = null,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "creatorId")
    val creatorId: Int,
    @ColumnInfo(name = "createDate")
    val createDate: Long? = null,
    @ColumnInfo(name = "publishDate")
    val publishDate: Long? = null,
    @ColumnInfo(name = "publishEnabled")
    val publishEnabled: Boolean = false,
    @ColumnInfo(name = "deleted")
    val deleted: Boolean = false
) {
    fun toDto() = News(
        id = id,
        newsCategoryId,
        title = title,
        description = description,
        creatorId = creatorId,
        createDate = createDate,
        publishDate = publishDate,
        publishEnabled = publishEnabled,
        deleted = deleted,
    )
}

fun List<NewsEntity>.toDto(): List<News> = map(NewsEntity::toDto)
fun List<News>.toEntity(): List<NewsEntity> = map(News::toEntity)
fun News.toEntity() = NewsEntity(
    id = id,
    newsCategoryId = newsCategoryId,
    title = title,
    description = description,
    creatorId = creatorId,
    createDate = createDate,
    publishDate = publishDate,
    publishEnabled = publishEnabled,
    deleted = deleted,
)

@Entity(tableName = "NewsCategoryEntity")
data class NewsCategoryEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "deleted")
    val deleted: Boolean
) {
    fun toDto() = News.Category(
        id = id,
        name = name,
        deleted = deleted,
    )
}
fun List<NewsCategoryEntity>.toNewsCategoryDto(): List<News.Category> = map(NewsCategoryEntity::toDto)
fun List<News.Category>.toNewsCategoryEntity(): List<NewsCategoryEntity> = map(News.Category::toNewsCategoryEntity)
fun News.Category.toNewsCategoryEntity() = NewsCategoryEntity(
    id = id,
    name = name,
    deleted = deleted,
)