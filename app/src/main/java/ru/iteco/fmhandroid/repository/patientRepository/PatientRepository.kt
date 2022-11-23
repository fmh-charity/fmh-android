package ru.iteco.fmhandroid.repository.patientRepository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Body
import ru.iteco.fmhandroid.dto.*

interface PatientRepository {
    val patientList: List<Patient>
    val currentPatient: Patient
    suspend fun getAllPatients(): List<Patient>
    suspend fun createNewPatient(patient: Patient): Patient
    suspend fun editPatient(patient: Patient): Patient
    suspend fun getPatientById(id: Int): Patient
    suspend fun getAllPatientWithOpenAndInProgressStatus()
    suspend fun getAllAdmission(id: Int)
    suspend fun getAllWishForPatient(id: Int): List<Wish>
    suspend fun refreshPatient()


//    fun getPatientByStatus(
//        coroutineScope: CoroutineScope,
//        listStatuses: List<Patient.Status>
//    ): Flow<List<Patient>>
//
//    suspend fun changePatientStatus(
//        patientId: Int,
//        patientStatus: Patient.Status,
//    ): Patient
}