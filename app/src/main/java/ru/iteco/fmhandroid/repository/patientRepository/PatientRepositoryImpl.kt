package ru.iteco.fmhandroid.repository.patientRepository

import ru.iteco.fmhandroid.api.PatientApi
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.dto.Wish
import ru.iteco.fmhandroid.utils.Utils
import ru.iteco.fmhandroid.utils.Utils.makeRequest
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PatientRepositoryImpl @Inject constructor(
    private val patientApi: PatientApi
) : PatientRepository {

    /**для получения списка всех пациентов*/
    override var patientList: List<Patient> = emptyList()
        private set

    override var currentPatient: Patient = Utils.Empty.emptyPatient
        private set


    override suspend fun createNewPatient(patient: Patient): Patient = makeRequest(
        request = { patientApi.createNewPatient(patient) },
        onSuccess = { body ->
            body.also {
                patientList = patientList.plus(it)
            }
            body
        }
    )


    override suspend fun editPatient(patient: Patient): Patient = makeRequest(
        request = { patientApi.editPatient(patient) },
        onSuccess = { body ->

            body
        }
    )

    /**Реестр всех пациентов*/
    override suspend fun getAllPatients(): List<Patient> = makeRequest(
        request = { patientApi.getAllPatients() },
        onSuccess = { body ->
            body.also {
                patientList = body
            }
            body
        }
    )

    /**Возвращает общую информацию по пациенту*/
    override suspend fun getPatientById(id: Int): Patient = makeRequest(
        request = { patientApi.getPatientById(id) },
        onSuccess = { body ->
            body.also {
                currentPatient = body
            }
            body
        }
    )

    /**Возврорщает ифнормацию по всем просьбам пациента*/
    override suspend fun getAllWishForPatient(id: Int): List<Wish> = makeRequest(
        request = { patientApi.getAllWishForPatient(id) },
        onSuccess = { body ->
            //TODO сохраняю в список? Как передавать и очищать? Сделать companion object в фрагменте и там очищать?
            body
        }
    )

    /**Возвращает информацию по всем просьбам пациента  со статусом open/in progress*/
    override suspend fun getWishInOpenAndInProgressStatus(id: Int): List<Wish> = makeRequest(
        request = { patientApi.getWishInOpenAndInProgressStatus(id) },
        onSuccess = { body ->
            //TODO сохраняю в список? Как передавать и очищать? Сделать companion object в фрагменте и там очищать?
            body
        }
    )

    /**Удаление пациента - оставил на будущее*/
    override suspend fun deletePatient(id: Int): Patient = makeRequest(
        request = { patientApi.deletePatient(id) },
        onSuccess = { body ->
            body
        }
    )


}


