package ru.iteco.fmhandroid.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.Claim
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.dto.Wish

/**Информация по пациенту*/
interface PatientApi {

    /**Удаление пациента*/
    @DELETE("patients/{id}")
    suspend fun deletePatient(@Path("id") id: Int): Response<Patient>

    /**Возвращает общую информацию по пациенту*/
    @GET("patients/{id}")
    suspend fun getPatientById(@Path("id") id: Int): Response<Patient>

    /**Реестр всех пациентов*/
    @GET("patients")
    suspend fun getAllPatients(
        @Query("statuses") statuses: Array<Patient.Status> = arrayOf(
            Patient.Status.ACTIVE,
            Patient.Status.EXPECTED,
            Patient.Status.DISCHARGED
        )
    ): Response<List<Patient>>

    /**Возврорщает ифнормацию по всем просьбам пациента*/
    @GET("patients/{id}/wishes")
    suspend fun getAllWishForPatient(@Path("id") id: Int): Response<List<Wish>>

    /**Возвращает информацию по всем просьбам пациента  со статусом open/in progress*/
    @GET("patients/{id}/wishes/open-in-progress")
    suspend fun getWishInOpenAndInProgressStatus(@Path("id") id: Int): Response<List<Wish>>

    /**Создание пациента*/
    @POST("patients")
    suspend fun createNewPatient(@Body patientItem: Patient): Response<Patient>

    /**Изменение пациента*/
    @PUT("patients/{id}")
    suspend fun editPatient(@Body patientItem: Patient): Response<Patient>
}
