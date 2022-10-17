package ru.iteco.fmhandroid.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.Patient

interface PatientApi {
    @GET("patient")
    suspend fun getAllPatient(): Response<List<Patient>>

    @PUT("news")
    suspend fun editPatientItem(@Body patientItem: Patient): Response<Patient>

    @POST("news")
    suspend fun savePatientItem(@Body patientItem: Patient): Response<Patient>

    @DELETE("news/{id}")
    suspend fun removePatientItemById(@Path("id") id: Int): Response<Unit>
}
