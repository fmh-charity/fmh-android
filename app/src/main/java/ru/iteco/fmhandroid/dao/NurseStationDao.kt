package ru.iteco.fmhandroid.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmhandroid.dto.NurseStation
import ru.iteco.fmhandroid.entity.NurseStationEntity

interface NurseStationDao {
    @Transaction
    @Query("SELECT * FROM NurseStationEntity")
    suspend fun getAllNurseStation(): List<NurseStation>

    @Transaction
    @Query("SELECT * FROM NurseStationEntity WHERE id = :id")
    fun getNurseStationById(id: Int): Flow<NurseStation>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNurseStations(nurseStations: List<NurseStationEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNurseStation(nurseStation: NurseStationEntity)

    @Query("DELETE FROM NurseStationEntity WHERE id IN (:idList)")
    suspend fun removeNurseStationsItemsByIdList(idList: List<Int?>)
}