package ru.iteco.fmhandroid.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015JA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u00182\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lru/iteco/fmhandroid/api/ClaimApi;", "", "getAllClaimComments", "Lretrofit2/Response;", "", "Lru/iteco/fmhandroid/dto/ClaimComment;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllClaims", "Lru/iteco/fmhandroid/dto/Claim;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClaimsInOpenAndInProgressStatus", "saveClaim", "claim", "(Lru/iteco/fmhandroid/dto/Claim;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveClaimComment", "claimComment", "(ILru/iteco/fmhandroid/dto/ClaimComment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateClaim", "updateClaimComment", "(Lru/iteco/fmhandroid/dto/ClaimComment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateClaimStatus", "claimStatus", "Lru/iteco/fmhandroid/dto/Claim$Status;", "executorId", "(ILru/iteco/fmhandroid/dto/Claim$Status;Ljava/lang/Integer;Lru/iteco/fmhandroid/dto/ClaimComment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ClaimApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "claims")
    public abstract java.lang.Object getAllClaims(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<ru.iteco.fmhandroid.dto.Claim>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "claims/open-in-progress")
    public abstract java.lang.Object getClaimsInOpenAndInProgressStatus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<ru.iteco.fmhandroid.dto.Claim>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "claims/{id}/comments")
    public abstract java.lang.Object getAllClaimComments(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<ru.iteco.fmhandroid.dto.ClaimComment>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "claims")
    public abstract java.lang.Object saveClaim(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.iteco.fmhandroid.dto.Claim claim, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.iteco.fmhandroid.dto.Claim>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "claims/{id}/comments")
    public abstract java.lang.Object saveClaimComment(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.iteco.fmhandroid.dto.ClaimComment claimComment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.iteco.fmhandroid.dto.ClaimComment>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "claims")
    public abstract java.lang.Object updateClaim(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.iteco.fmhandroid.dto.Claim claim, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.iteco.fmhandroid.dto.Claim>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "claims/{id}/status")
    public abstract java.lang.Object updateClaimStatus(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "status")
    ru.iteco.fmhandroid.dto.Claim.Status claimStatus, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "executorId")
    java.lang.Integer executorId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.iteco.fmhandroid.dto.ClaimComment claimComment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.iteco.fmhandroid.dto.Claim>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "claims/comments")
    public abstract java.lang.Object updateClaimComment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.iteco.fmhandroid.dto.ClaimComment claimComment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.iteco.fmhandroid.dto.ClaimComment>> continuation);
}