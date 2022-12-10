package ru.iteco.fmhandroid.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.iteco.fmhandroid.entity.NewsKeyEntity

@Dao
interface NewsKeyDao {
    @Query("SELECT MAX(page) FROM NewsKeyEntity")
    suspend fun max(): Int?

    @Query("SELECT MIN(page) FROM NewsKeyEntity")
    suspend fun min(): Int?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(key: NewsKeyEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(keys: List<NewsKeyEntity>)

    @Query("DELETE FROM NewsKeyEntity")
    suspend fun removeAll()
}