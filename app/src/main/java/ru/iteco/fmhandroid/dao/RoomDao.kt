package ru.iteco.fmhandroid.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmhandroid.dto.Room
import ru.iteco.fmhandroid.entity.RoomEntity

@Dao
interface RoomDao {
    @Transaction
    @Query("SELECT * FROM RoomEntity")
    suspend fun getAllRooms(): List<Room>

    @Transaction
    @Query("SELECT * FROM RoomEntity WHERE id = :id")
    fun getRoomById(id: Int): Flow<Room>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRooms(rooms: List<RoomEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRoom(room: List<RoomEntity>)

    @Query("DELETE FROM RoomEntity WHERE id IN (:idList)")
    suspend fun removeRoomsItemsByIdList(idList: List<Int?>)
}