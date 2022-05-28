package ru.iteco.fmh.data.api

import retrofit2.Response
import retrofit2.http.*
import ru.iteco.fmh.model.Claim

interface ClaimApi {
    @GET("claims")
    suspend fun getAllClaims(): Response<List<Claim>>

    @GET("claims/open-in-progress")
    suspend fun getClaimsInOpenAndInProgressStatus(): Response<List<Claim>>

    @GET("claims/{id}/comments")
    suspend fun getAllClaimComments(@Path("id") id: Int): Response<List<Claim.Comment>>

    @POST("claims")
    suspend fun saveClaim(@Body claim: Claim): Response<Claim>

    @POST("claims/{id}/comments")
    suspend fun saveClaimComment(
        @Path("id") id: Int,
        @Body claimComment: Claim.Comment
    ): Response<Claim.Comment>

    @PUT("claims")
    suspend fun updateClaim(@Body claim: Claim): Response<Claim>

    @PUT("claims/{id}/status")
    suspend fun updateClaimStatus(
        @Path("id") id: Int,
        @Query("status") claimStatus: Claim.Status,
        @Query("executorId") executorId: Int?,
        @Body claimComment: Claim.Comment
    ): Response<Claim>

    @PUT("claims/comments")
    suspend fun updateClaimComment(@Body claimComment: Claim.Comment): Response<Claim.Comment>
}
