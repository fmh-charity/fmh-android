package ru.iteco.fmhandroid.repository.nurseStationRepository

import ru.iteco.fmhandroid.api.NurseStationApi
import ru.iteco.fmhandroid.dao.NurseStationDao
import ru.iteco.fmhandroid.dto.NurseStation
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class NurseStationRepositoryImpl @Inject constructor(
    private val nurseStationApi: NurseStationApi,
    private val nurseStationDao: NurseStationDao
) : NurseStationRepository {
    override suspend fun getAllNurseStation() {
        TODO("Not yet implemented")
    }

    override suspend fun createNurseStation(nurseStationItem: NurseStation): NurseStation {
        TODO("Not yet implemented")
    }

    override suspend fun modificationOfExistingNurseStation(nurseStationItem: NurseStation): NurseStation {
        TODO("Not yet implemented")
    }

    override suspend fun removeNurseStationItemById(id: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun getNurseStationById(id: Int): NurseStation {
        TODO("Not yet implemented")
    }


}