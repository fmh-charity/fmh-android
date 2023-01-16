package ru.iteco.fmhandroid.repository.patientRepository

import ru.iteco.fmhandroid.api.PatientApi
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.dto.Wish
import ru.iteco.fmhandroid.utils.Utils
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PatientRepositoryImpl @Inject constructor(private val patientApi: PatientApi
) : PatientRepository {


    /**для получения списка всех пациентов*/
    override var patientList: List<Patient> = emptyList()
        private set

    /**временная переменная для получения пациента по Id*/


    override var currentPatient: Patient = Utils.Empty.emptyPatient
        private set

    val test = patientList

    /** создание пациента **/
    override suspend fun createNewPatient(patient: Patient): Patient = Utils.makeRequest(
        request = { patientApi.createNewPatient(patient) },
        onSuccess = { body ->
            body.also {
                //TODO нужно ли сохранять локально?
                //patientList = listOf(it)
            }
            body
        }
    )

    /** редактирование пациента **/
    override suspend fun editPatient(patient: Patient): Patient = Utils.makeRequest(
        request = { patientApi.editPatient(patient) },
        onSuccess = { body ->
           //TODO
            body
        }
    )

    /**Реестр всех пациентов*/
    override suspend fun getAllPatients(): List<Patient> =  Utils.makeRequest(
    request = { patientApi.getAllPatients() },
    onSuccess = { body ->
        body.also {
            patientList = it.toList()
        }
        body
    }
    )

    /**Возвращает общую информацию по пациенту*/
    override suspend fun getPatientById(id: Int):Patient = Utils.makeRequest(
    request = { patientApi.getPatientById(id) },
    onSuccess = { body ->
        //TODO делать заглушку?
        body
    }
    )

    /**Возврорщает ифнормацию по всем просьбам пациента*/
    override suspend fun getAllWishForPatient(id: Int): List<Wish> = Utils.makeRequest(
        request = { patientApi.getAllWishForPatient(id)},
        onSuccess = { body ->
            //TODO сохраняю в список? Как передавать и очищать? Сделать companion object в фрагменте и там очищать?
            body
        }
    )

    /**Возвращает информацию по всем просьбам пациента  со статусом open/in progress*/
    override suspend fun getWishInOpenAndInProgressStatus(id: Int): List<Wish> = Utils.makeRequest(
        request = { patientApi.getWishInOpenAndInProgressStatus(id)},
        onSuccess = { body ->
            //TODO сохраняю в список? Как передавать и очищать? Сделать companion object в фрагменте и там очищать?
            body
        }
    )

    /**Удаление пациента*/
    override suspend fun deletePatient(id: Int): Patient = Utils.makeRequest(
    request = { patientApi.deletePatient(id)},
    onSuccess = { body ->
        //TODO только запрос с id на сервер?
        body
    }
    )
}


