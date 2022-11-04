package ru.iteco.fmhandroid.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmhandroid.dto.FullNurseStation
import ru.iteco.fmhandroid.dto.NurseStation
import ru.iteco.fmhandroid.entity.NurseStationEntity

@Dao
interface NurseStationDao {
    @Transaction
    @Query("SELECT * FROM NurseStationEntity")
    fun getAllNurseStation(): Flow<List<NurseStation>>

    @Transaction
    @Query("SELECT * FROM NurseStationEntity WHERE id = :id")
    fun getNurseStationById(id: Int): Flow<FullNurseStation>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNurseStations(nurseStations: List<NurseStationEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNurseStation(nurseStation: NurseStationEntity)

    @Query("DELETE FROM NurseStationEntity WHERE id IN (:idList)")
    suspend fun removeNurseStationsItemsByIdList(idList: List<Int?>)

    @Query("DELETE FROM NurseStationEntity WHERE id = :id")
    suspend fun removeNurseStationById(id: Int)
}