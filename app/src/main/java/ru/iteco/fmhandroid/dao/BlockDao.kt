package ru.iteco.fmhandroid.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmhandroid.dto.Block
import ru.iteco.fmhandroid.entity.BlockEntity

interface BlockDao {
    @Transaction
    @Query("SELECT * FROM BlockEntity")
    suspend fun getAllBlocks(): List<Block>

    @Transaction
    @Query("SELECT * FROM BlockEntity WHERE id = :id")
    fun getBlockById(id: Int): Flow<Block>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBlocks(blocks: List<BlockEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBlock(block: BlockEntity)

    @Query("DELETE FROM BlockEntity WHERE id IN (:idList)")
    suspend fun removeBlocksItemsByIdList(idList: List<Int?>)
}