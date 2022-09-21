package ru.iteco.fmh.data.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmh.data.api.dto.ClaimDto

interface ClaimApi {
    @GET("claims")
    suspend fun getAllClaims(): Response<List<ClaimDto>>

    @GET("claims/open-in-progress")
    suspend fun getClaimsInOpenAndInProgressStatus(): Response<List<ClaimDto>>

    @GET("claims/{id}/comments")
    suspend fun getAllClaimComments(@Path("id") id: Int): Response<List<ClaimDto.Comment>>

    @POST("claims")
    suspend fun saveClaim(@Body claim: ClaimDto): Response<ClaimDto>

    @POST("claims/{id}/comments")
    suspend fun saveClaimComment(
        @Path("id") id: Int,
        @Body claimComment: ClaimDto.Comment
    ): Response<ClaimDto.Comment>

    @PUT("claims")
    suspend fun updateClaim(@Body claim: ClaimDto): Response<ClaimDto>

    @PUT("claims/{id}/status")
    suspend fun updateClaimStatus(
        @Path("id") id: Int,
        @Query("status") claimStatus: ClaimDto.Status,
        @Query("executorId") executorId: Int?,
        @Body claimComment: ClaimDto.Comment
    ): Response<ClaimDto>

    @PUT("claims/comments")
    suspend fun updateClaimComment(@Body claimComment: ClaimDto.Comment): Response<ClaimDto.Comment>
}
