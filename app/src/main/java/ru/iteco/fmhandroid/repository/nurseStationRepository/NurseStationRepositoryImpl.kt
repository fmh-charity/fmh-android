package ru.iteco.fmhandroid.repository.nurseStationRepository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import ru.iteco.fmhandroid.api.NurseStationApi
import ru.iteco.fmhandroid.dao.NurseStationDao
import ru.iteco.fmhandroid.dto.NurseStation
import ru.iteco.fmhandroid.entity.toEntity
import ru.iteco.fmhandroid.utils.Utils
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class NurseStationRepositoryImpl @Inject constructor(
    private val nurseStationApi: NurseStationApi,
    private val nurseStationDao: NurseStationDao
) : NurseStationRepository {

    override fun getAllNurseStation(): Flow<List<NurseStation>> =
        nurseStationDao.getAllNurseStation().flowOn(Dispatchers.Default)

    override suspend fun createNurseStation(nurseStationItem: NurseStation): NurseStation =
        Utils.makeRequest(
            request = { nurseStationApi.saveNurseStation(nurseStationItem) },
            onSuccess = { body ->
                nurseStationDao.insertNurseStation(body.toEntity())
                body
            }
        )

    override suspend fun modificationOfExistingNurseStation(nurseStationItem: NurseStation): NurseStation =
        Utils.makeRequest(
            request = { nurseStationApi.updateNurseStation(nurseStationItem.id, nurseStationItem) },
            onSuccess = { body ->
                nurseStationDao.insertNurseStation(body.toEntity())
                body
            }
        )

    override suspend fun removeNurseStationItemById(id: Int) =
        Utils.makeRequest(
            request = { nurseStationApi.deleteNurseStation(id) },
            onSuccess = {
                nurseStationDao.removeNurseStationById(id)
            }
        )

    override suspend fun getNurseStationById(id: Int) = nurseStationDao.getNurseStationById(id)

}