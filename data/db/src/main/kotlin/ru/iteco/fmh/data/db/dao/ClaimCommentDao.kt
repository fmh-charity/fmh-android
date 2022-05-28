package ru.iteco.fmh.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmh.data.db.entity.ClaimCommentEntity

@Dao
interface ClaimCommentDao {
    @Query("SELECT * FROM ClaimCommentEntity WHERE claimId = :claimId")
    fun getClaimComments(claimId: Int): Flow<List<ClaimCommentEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertComments(comments: List<ClaimCommentEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertComment(comment: ClaimCommentEntity)
}
