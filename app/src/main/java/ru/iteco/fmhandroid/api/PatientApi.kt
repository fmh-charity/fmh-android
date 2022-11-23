package ru.iteco.fmhandroid.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.dto.Wish

interface PatientApi {
    @GET("patients")
    suspend fun getAllPatients(): Response<List<Patient>>

    @POST("patients")
    suspend fun savePatient(@Body patientItem: Patient): Response<Patient>

    @PUT("patients")
    suspend fun editPatient(@Body patientItem: Patient): Response<Patient>

    @GET("patients/{id}")
    suspend fun getPatientById(@Path("id") id: Int): Response<Patient>

    @GET("patients/{id}/wishes/open-in-progress")
    suspend fun getWishInOpenAndInProgressStatus(): Response<List<Patient>>

    @GET("patients/{id}/admission")
    suspend fun getAllAdmission(@Path("id") id: Int): Response<Unit>

    @GET("patients/{id}/wishes")
    suspend fun getAllWish(): Response<List<Wish>>
}
