package ru.iteco.fmhandroid.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.iteco.fmhandroid.dto.NurseStation
import ru.iteco.fmhandroid.repository.nurseStationRepository.NurseStationRepository
import javax.inject.Inject


@HiltViewModel
class NurseStationViewModel @Inject constructor(
    private val nurseStationRepository: NurseStationRepository
) : ViewModel()  //TODO Нужно еще добавить адаптер
{

    suspend fun getAllNurseStation() {
        nurseStationRepository.getAllNurseStation()
    }

    suspend fun save(nurseStationItem: NurseStation) {
        nurseStationRepository.createNurseStation(nurseStationItem)
    }

    suspend fun edit(nurseStationItem: NurseStation) {
        nurseStationRepository.modificationOfExistingNurseStation(nurseStationItem)
    }

    suspend fun remove(id: Int) {
        nurseStationRepository.removeNurseStationItemById(id)
    }

    suspend fun getNurseStation(id: Int) {
        nurseStationRepository.getNurseStationById(id)
    }

}