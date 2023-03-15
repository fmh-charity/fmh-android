package ru.iteco.fmhandroid.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.iteco.fmhandroid.entity.ClaimRemoteKeys

@Dao
interface ClaimKeyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(claimKey: List<ClaimRemoteKeys>)

    @Query("Select * From remote_key Where object_id = :id")
    suspend fun getRemoveKeyById(id: Int?): ClaimRemoteKeys?

    @Query("Delete From remote_key")
    suspend fun remoteKeys()

    @Query("Select created_at From remote_key Order By created_at DESC LIMIT 1")
    suspend fun getCreationTime(): Long?

}