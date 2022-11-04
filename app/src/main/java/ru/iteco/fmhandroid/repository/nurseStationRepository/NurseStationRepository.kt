package ru.iteco.fmhandroid.repository.nurseStationRepository

import ru.iteco.fmhandroid.dto.FullNurseStation
import ru.iteco.fmhandroid.dto.NurseStation
import kotlinx.coroutines.flow.Flow

interface NurseStationRepository {
    fun getAllNurseStation(): Flow<List<NurseStation>>
    suspend fun createNurseStation(nurseStationItem: NurseStation): NurseStation
    suspend fun modificationOfExistingNurseStation(nurseStationItem: NurseStation): NurseStation
    suspend fun removeNurseStationItemById(id: Int)
    suspend fun getNurseStationById(id: Int): Flow<FullNurseStation>

}