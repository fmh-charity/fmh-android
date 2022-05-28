package ru.iteco.fmh.data.db.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmh.data.db.entity.ClaimEntity
import ru.iteco.fmh.model.Claim
import ru.iteco.fmh.model.FullClaim

@Dao
interface ClaimDao {
    @Transaction
    @Query("SELECT * FROM ClaimEntity")
    suspend fun getAllClaims(): List<FullClaim>

    @Transaction
    @Query(
        """
       SELECT * FROM ClaimEntity
       WHERE (status IN (:listStatuses))
       ORDER BY planExecuteDate ASC, createDate DESC
    """
    )
    fun getClaimsByStatus(
        listStatuses: List<Claim.Status>
    ): Flow<List<FullClaim>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClaim(claim: ClaimEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClaim(claims: List<ClaimEntity>)

    @Transaction
    @Query("SELECT * FROM ClaimEntity WHERE id = :id")
    fun getClaimById(id: Int): Flow<FullClaim>

    @Query("DELETE FROM ClaimEntity WHERE id IN (:idList)")
    suspend fun removeClaimsItemsByIdList(idList: List<Int?>)
}

