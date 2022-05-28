package ru.iteco.fmh.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ru.iteco.fmh.data.db.converter.ClaimClaimStatusConverter
import ru.iteco.fmh.data.db.dao.*
import ru.iteco.fmh.data.db.entity.ClaimCommentEntity
import ru.iteco.fmh.data.db.entity.ClaimEntity
import ru.iteco.fmh.data.db.entity.NewsCategoryEntity
import ru.iteco.fmh.data.db.entity.NewsEntity

@Database(
    entities = [
        ClaimEntity::class,
        ClaimCommentEntity::class,
        NewsEntity::class,
        NewsCategoryEntity::class,
    ],
    version = 1,
    exportSchema = false
)

@TypeConverters(
    ClaimClaimStatusConverter::class
)
abstract class AppDb : RoomDatabase() {
    abstract fun getClaimDao(): ClaimDao
    abstract fun getClaimCommentDao(): ClaimCommentDao
    abstract fun getNewsDao(): NewsDao
    abstract fun getNewsCategoryDao(): NewsCategoryDao
}
