package ru.iteco.fmh.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmh.data.db.entity.NewsCategoryEntity

@Dao
interface NewsCategoryDao {
    @Query("SELECT * FROM NewsCategoryEntity ORDER BY id")
    fun getAllNewsCategories(): Flow<List<NewsCategoryEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(categories: List<NewsCategoryEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(category: NewsCategoryEntity)

    @Query("SELECT * FROM NewsCategoryEntity")
    fun getNewsCategoryList(): List<NewsCategoryEntity>
}