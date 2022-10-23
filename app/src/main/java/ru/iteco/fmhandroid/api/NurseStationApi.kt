package ru.iteco.fmhandroid.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmhandroid.dto.NurseStation

interface NurseStationApi {

    @GET("nurse_stations")
    suspend fun getAllNurseStation(): Response<List<NurseStation>>

    @POST("nurse_stations")
    suspend fun saveNurseStation(@Body nurseStation: NurseStation): Response<NurseStation>

    @GET("nurse_stations/{id}")
    suspend fun getNurseStationById(@Path("id") id: Int): Response<NurseStation>

    @PUT("nurse_stations/{id}")
    suspend fun updateNurseStation(
        @Path("id") id: Int,
        @Body nurseStation: NurseStation
    ): Response<NurseStation>

    @DELETE("nurse_stations/{id}")
    suspend fun deleteNurseStation(@Path("id") id: Int)
}