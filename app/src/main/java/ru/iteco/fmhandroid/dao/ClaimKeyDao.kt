package ru.iteco.fmhandroid.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.iteco.fmhandroid.entity.ClaimKeyEntity
import ru.iteco.fmhandroid.entity.NewsKeyEntity

@Dao
interface ClaimKeyDao {
    @Query("SELECT MAX(page) FROM ClaimKeyEntity")
    suspend fun max(): Int?

    @Query("SELECT MIN(page) FROM ClaimKeyEntity")
    suspend fun min(): Int?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(key: ClaimKeyEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(keys: List<ClaimKeyEntity>)

    @Query("DELETE FROM ClaimKeyEntity")
    suspend fun removeAll()
}