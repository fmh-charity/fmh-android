package ru.iteco.fmhandroid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.adapter.OnPatientItemClickListener
import ru.iteco.fmhandroid.dto.Claim
import ru.iteco.fmhandroid.dto.FullClaim
import ru.iteco.fmhandroid.dto.News
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.repository.patientRepository.PatientRepository
import javax.inject.Inject

@HiltViewModel
class PatientViewModel @Inject constructor(
    private val patientRepository: PatientRepository
) : ViewModel(), OnPatientItemClickListener {
    /** -- создание пациента -- **/
    val patientsItemCreatedEvent = MutableSharedFlow<Unit>()
    /** -- ошибка создание пациента -- **/
    val createPatientExceptionEvent = MutableSharedFlow<Unit>()
    /** -- редактирование пациента -- **/
    val editPatientsEvent = MutableSharedFlow<Unit>()
    /** -- ошибка редактирования пациента -- **/
    val editPatientsExceptionEvent = MutableSharedFlow<Unit>()
    /** -- ошибка сохранения пациента -- **/
    val patientLoadException = MutableSharedFlow<Unit>()
    /** -- ошибка сохранения пациента -- **/
    val savePatientsItemExceptionEvent = MutableSharedFlow<Unit>()

    val editPatientsItemSavedEvent = MutableSharedFlow<Unit>()



    /** ------------создание пациента---------------------------------------------------------- **/
    fun save(patient: Patient) {
        viewModelScope.launch {
            try {
                patientRepository.createNewPatient(patient)
                patientsItemCreatedEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                createPatientExceptionEvent.emit(Unit)
            }
        }
    }

    /** ------------изменение пациента---------------------------------------------------------- **/
    fun edit(patient: Patient) {
        viewModelScope.launch {
            try {
                patientRepository.editPatient(patient)
                editPatientsEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                editPatientsExceptionEvent.emit(Unit)
            }
        }
    }


    /** -------загрузка статусов из enum class Status в dto Patient---------------------------- **/
    val statuses =
        listOf(
            Patient.Status.NEW,
            Patient.Status.IN_HOSPICE,
            Patient.Status.DISCHARGED
        )

    /** -------отображение после сохранения пациента------------------------------------------- **/

//    fun onRefresh() {
//        viewModelScope.launch {
//            internalOnRefresh()
//        }
//    }
//
//    private suspend fun internalOnRefresh() {
//        try {
//            patientRepository.refreshPatient()
//            //patientListUpdatedEvent.emit(Unit)
//        } catch (e: Exception) {
//            e.printStackTrace()
//            patientLoadException.emit(Unit)
//        }
//    }
//    fun onFilterPatientMenuItemClicked(statuses: List<Patient.Status>) {
//        viewModelScope.launch {
//            statusesFlow.emit(statuses)
//        }
//    }

    override fun onCard(patient: Patient) {
        TODO("Not yet implemented")
    }

}

