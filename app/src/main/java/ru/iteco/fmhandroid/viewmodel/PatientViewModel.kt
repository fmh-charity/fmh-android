package ru.iteco.fmhandroid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.adapter.OnPatientItemClickListener
import ru.iteco.fmhandroid.dto.FullPatient
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.repository.patientRepository.PatientRepository
import javax.inject.Inject

@HiltViewModel
class PatientViewModel @Inject constructor(private val patientRepository: PatientRepository
) : ViewModel(), OnPatientItemClickListener {

    /** -- создание пациента -- **/
    val patientCreatedEvent = MutableSharedFlow<Unit>()
    /** -- ошибка создание пациента -- **/
    val patientCreateExceptionEvent = MutableSharedFlow<Unit>()
    /** -- редактирование пациента -- **/
    val patientEditEvent = MutableSharedFlow<Unit>()
    /** -- ошибка редактирования пациента -- **/
    val patientEditExceptionEvent = MutableSharedFlow<Unit>()

    /** создание пациента **/
    fun createNewPatient(patient: Patient) {
        viewModelScope.launch {
            try {
                patientCreatedEvent.emit(Unit)
                patientRepository.createNewPatient(patient)

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

    /** **/
   override fun onCard(patient: Patient) {
        TODO("Not yet implemented")
    }
}

