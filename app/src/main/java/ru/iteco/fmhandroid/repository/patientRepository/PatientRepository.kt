package ru.iteco.fmhandroid.repository.patientRepository

import retrofit2.Response
import retrofit2.http.Path
import ru.iteco.fmhandroid.dto.*

interface PatientRepository {
    val patientList: List<Patient>
    val currentPatient: Patient

    suspend fun createNewPatient(patient: Patient): Patient
    suspend fun editPatient(patient: Patient): Patient
    suspend fun getAllPatients(): List<Patient>
    suspend fun getPatientById(id: Int): Patient
    suspend fun getAllWishForPatient(id: Int): List<Wish>
    suspend fun getWishInOpenAndInProgressStatus(id: Int):List<Wish>
    suspend fun deletePatient(@Path("id") id: Int): Patient

}