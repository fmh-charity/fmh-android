package ru.iteco.fmhandroid.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.dto.Wish

interface PatientApi {

    @GET("patients")
    suspend fun getAllPatient(): Response<List<Patient>>

    @POST("patients")
    suspend fun savePatientItem(@Body patientItem: Patient): Response<Patient>

    @PUT("patients")
    suspend fun editPatientItem(@Body patientItem: Patient): Response<Patient>

    @GET("patients/{id}")
    suspend fun getPatientById(@Path("id") id: Long): Response<Patient>

    @GET("patients/{id}/admission")
    suspend fun getAllAdmission(@Path("id") id: Long): Response<Unit>

    @GET("patients/{id}/wishes")
    suspend fun getAllWish(): Response<List<Wish>>

    @GET("patients/{id}/wishes/open-in-progress")
    suspend fun getWishInOpenAndInProgressStatus(): Response<List<Wish>>
}
