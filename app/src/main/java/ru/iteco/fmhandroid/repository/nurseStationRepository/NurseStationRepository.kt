package ru.iteco.fmhandroid.repository.nurseStationRepository

import ru.iteco.fmhandroid.dto.NurseStation

interface NurseStationRepository {
    suspend fun getAllNurseStation()
    suspend fun createNurseStation(nurseStationItem: NurseStation): NurseStation
    suspend fun modificationOfExistingNurseStation(nurseStationItem: NurseStation): NurseStation
    suspend fun removeNurseStationItemById(id: Int)
    suspend fun getNurseStationById(id: Int): NurseStation

}