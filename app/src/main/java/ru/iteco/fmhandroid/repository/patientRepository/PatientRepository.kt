package ru.iteco.fmhandroid.repository.patientRepository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmhandroid.dto.*

interface PatientRepository {

    fun getAllPatient()
    suspend fun createNewPatient(patient: Patient): Patient
    suspend fun changePatient(patient: Patient): Patient
    fun getPatientById(id: Int): Flow<Patient>
    suspend fun admissionPatient()
    fun getAllWishForPatient(id: Int): List<Wish>
    fun getAllPatientWithOpenAndInProgressStatus(): List<Patient>
    fun getPatientByStatus(
        coroutineScope: CoroutineScope,
        listStatuses: List<Patient.Status>
    ): Flow<List<Patient>>
    suspend fun changePatientStatus(
        patientId: Int,
        patientStatus: Patient.Status,
    ): Patient

   }