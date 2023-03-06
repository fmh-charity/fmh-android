package ru.iteco.fmhandroid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.adapter.OnPatientItemClickListener
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.repository.patientRepository.PatientRepository
import javax.inject.Inject

@HiltViewModel
class PatientViewModel @Inject constructor(
    private val patientRepository: PatientRepository
) : ViewModel(), OnPatientItemClickListener {

    /** -- создание пациента -- **/
    val patientCreatedEvent = MutableSharedFlow<Unit>()
    /** -- ошибка создание пациента -- **/
    val patientCreateExceptionEvent = MutableSharedFlow<Unit>()
    /** -- редактирование пациента -- **/
    val patientEditEvent = MutableSharedFlow<Unit>()
    /** -- ошибка редактирования пациента -- **/
    val patientEditExceptionEvent = MutableSharedFlow<Unit>()
    /** -- обновление  пациента -- **/
    val patientListUpdatedEvent = MutableSharedFlow<Unit>()
    val patientListUpdatedExceptionEvent = MutableSharedFlow<Unit>()
    /** -- октрытие итема -- **/
    val openPatientEvent = MutableSharedFlow<Patient>()

    val data: List<Patient>
        get() = patientRepository.patientList

    fun refreshPatients() {
        viewModelScope.launch {
            try {
                patientRepository.getAllPatients()
                patientListUpdatedEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                patientListUpdatedExceptionEvent.emit(Unit)
            }
        }
    }

    /** создание пациента **/
    fun createNewPatient(patient: Patient) {
        viewModelScope.launch {
            try {
                patientRepository.createNewPatient(patient)
                patientCreatedEvent.emit(Unit)

            } catch (e: Exception) {
                e.printStackTrace()
                patientCreateExceptionEvent.emit(Unit)
            }
        }
    }

    /** изменение пациента **/
    fun edit(patient: Patient) {
        viewModelScope.launch {
            try {
                patientRepository.editPatient(patient)
                patientEditEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                patientEditExceptionEvent.emit(Unit)
            }
        }
    }

    /** загрузка статусов из enum class Status в dto Patient **/
    val statuses =
        listOf(
            Patient.Status.ACTIVE,
            Patient.Status.EXPECTED,
            Patient.Status.DISCHARGED
        )

    override fun onCard(patient: Patient) {
        viewModelScope.launch {
            try {
                openPatientEvent.emit(patient)
                patient.id?.let {
                    patientRepository.getPatientById(it) }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


    fun getPatientById(id: Int){
        viewModelScope.launch {
            try {
                patientRepository.getPatientById(id)

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    /** на будущее*/
    fun deletePatient(id: Int) {
        viewModelScope.launch {
            try {
                patientRepository.deletePatient(id)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}

