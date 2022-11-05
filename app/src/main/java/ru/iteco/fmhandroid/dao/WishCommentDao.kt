package ru.iteco.fmhandroid.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmhandroid.dto.WishComment
import ru.iteco.fmhandroid.entity.WishCommentEntity

@Dao
interface WishCommentDao {
    @Query("SELECT * FROM WishCommentEntity WHERE wishId = :wishId")
    fun getWishComments(wishId: Int): Flow<List<WishComment>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertComments(comments: List<WishCommentEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertComment(comment: WishCommentEntity)
}