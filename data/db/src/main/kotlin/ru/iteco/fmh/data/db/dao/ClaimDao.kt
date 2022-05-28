package ru.iteco.fmh.data.db.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmh.data.db.entity.ClaimEntity

@Dao
interface ClaimDao {
    @Transaction
    @Query("SELECT * FROM ClaimEntity")
    suspend fun getAllClaims(): List<ClaimEntity.WithComments>

    @Transaction
    @Query(
        """
       SELECT * FROM ClaimEntity
       WHERE (status IN (:listStatuses))
       ORDER BY planExecuteDate ASC, createDate DESC
    """
    )
    fun getClaimsByStatus(
        listStatuses: List<ClaimEntity.Status>
    ): Flow<List<ClaimEntity.WithComments>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClaim(claim: ClaimEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClaim(claims: List<ClaimEntity>)

    @Transaction
    @Query("SELECT * FROM ClaimEntity WHERE id = :id")
    fun getClaimById(id: Int): Flow<ClaimEntity.WithComments>

    @Query("DELETE FROM ClaimEntity WHERE id IN (:idList)")
    suspend fun removeClaimsItemsByIdList(idList: List<Int?>)
}