package ru.iteco.fmhandroid.repository.patientRepository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import retrofit2.Response
import ru.iteco.fmhandroid.api.ClaimApi
import ru.iteco.fmhandroid.api.PatientApi
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.dto.User
import ru.iteco.fmhandroid.dto.Wish
import ru.iteco.fmhandroid.entity.toEntity
import ru.iteco.fmhandroid.exceptions.ApiException
import ru.iteco.fmhandroid.exceptions.AuthorizationException
import ru.iteco.fmhandroid.exceptions.ServerException
import ru.iteco.fmhandroid.exceptions.UnknownException
import ru.iteco.fmhandroid.utils.Utils
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class PatientRepositoryImpl @Inject constructor(
    private val patientApi: PatientApi
) : PatientRepository {

    override var currentPatient: Patient = Utils.Empty.emptyPatient
        private set

    override var patientList: List<Patient> = emptyList()
        private set

    /** ------------получение всех пациентов--------------------------------------------------- **/
    override suspend fun getAllPatients(): List<Patient> = Utils.makeRequest(
        request = { patientApi.getAllPatients() },
        onSuccess = { body ->
            body.also {
                patientList = it
            }
        }
    )


    /** ------------создание пациента---------------------------------------------------------- **/
    override suspend fun createNewPatient(patient: Patient): Patient = Utils.makeRequest(
        request = { patientApi.savePatient(patient) },
        onSuccess = { body ->
            body.also {
                patientList = listOf(it)
            }
            body
        }
    )

    /** ------------изменение пациента---------------------------------------------------------- **/
    override suspend fun editPatient(patient: Patient): Patient = Utils.makeRequest(
        request = { patientApi.editPatient(patient) },
        onSuccess = { body ->
           //TODO
            body
        }
    )

    /** ------------получение пациента по id---------------------------------------------------- **/
    override suspend fun getPatientById(id: Int): Patient = Utils.makeRequest(
        request = { patientApi.getPatientById(id) },
        onSuccess = { body ->
            body.also {
               it
            }
            body
        }
    )

    /** ------------получение пациента c открытым статусом....---------------------------------- **/
    override suspend fun getAllPatientWithOpenAndInProgressStatus() {
        //TODO
        try {
            val response: Response<List<Patient>> = patientApi.getWishInOpenAndInProgressStatus()
            if (!response.isSuccessful && response.code() == 401) {
                throw ServerException
            }
            currentPatient = (response.body() ?: throw UnknownException) as Patient
        } catch (e: Exception) {
            throw UnknownException
        }
    }


        /** ------------получение пациента c открытым статусом....---------------------------------- **/
    override suspend fun getAllAdmission(id: Int) = Utils.makeRequest(
        request = { patientApi.getAllAdmission(id) },
        onSuccess = { body ->
            //TODO
            body
        }
    )

    /** ------------получение всех просьб пациента---------------------------------------------- **/
    override suspend fun getAllWishForPatient(id: Int): List<Wish> = Utils.makeRequest(
        request = { patientApi.getAllWish() },
        onSuccess = { body ->
            //TODO
            body
        }
    )

    override suspend fun refreshPatient() {
        TODO("Not yet implemented")
    }

    /** ------------получение статуса для пациента---------------------------------------------- **/
//    override fun getPatientByStatus(
//        coroutineScope: CoroutineScope,
//        listStatuses: List<Patient.Status>
//    ): Flow<List<Patient>> {
//        TODO("Not yet implemented")
//    }

    /** ------------изменение статуса для пациента---------------------------------------------- **/
//    override suspend fun changePatientStatus(
//        patientId: Int,
//        patientStatus: Patient.Status
//    ): Patient {
//        TODO("Not yet implemented")
//    }


}