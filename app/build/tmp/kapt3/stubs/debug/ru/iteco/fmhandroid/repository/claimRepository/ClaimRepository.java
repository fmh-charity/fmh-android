package ru.iteco.fmhandroid.repository.claimRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J3\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0016\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0016\u001a\u00020\tH&J*\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H&J\u0019\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010!\u001a\u00020\"H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J!\u0010#\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lru/iteco/fmhandroid/repository/claimRepository/ClaimRepository;", "", "changeClaimComment", "Lru/iteco/fmhandroid/dto/ClaimComment;", "comment", "(Lru/iteco/fmhandroid/dto/ClaimComment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeClaimStatus", "Lru/iteco/fmhandroid/dto/Claim;", "claimId", "", "newStatus", "Lru/iteco/fmhandroid/dto/Claim$Status;", "executorId", "claimComment", "(ILru/iteco/fmhandroid/dto/Claim$Status;Ljava/lang/Integer;Lru/iteco/fmhandroid/dto/ClaimComment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNewClaim", "claim", "(Lru/iteco/fmhandroid/dto/Claim;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllClaimsWithOpenAndInProgressStatus", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCommentsForClaim", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClaimById", "Lkotlinx/coroutines/flow/Flow;", "Lru/iteco/fmhandroid/dto/FullClaim;", "getClaimsByStatus", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "listStatuses", "modificationOfExistingClaim", "editedClaim", "refreshClaims", "", "saveClaimComment", "(ILru/iteco/fmhandroid/dto/ClaimComment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ClaimRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.FullClaim>> getClaimsByStatus(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends ru.iteco.fmhandroid.dto.Claim.Status> listStatuses);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refreshClaims(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object modificationOfExistingClaim(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim editedClaim, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.Claim> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createNewClaim(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim claim, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.Claim> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<ru.iteco.fmhandroid.dto.FullClaim> getClaimById(int id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllCommentsForClaim(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.iteco.fmhandroid.dto.ClaimComment>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveClaimComment(int claimId, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.ClaimComment comment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.ClaimComment> continuation);
    
    /**
     * При переводе заявки из статуса OPEN -> IN PROGRESS заявке назначается исполнитель
     * При переводе заявки из статуса IN PROGRESS -> OPEN с заявки снимается исполнитель
     * При действиях "Сбросить" и "Исполнить" исполнитель обязан оставить объясняющий комментарий
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object changeClaimStatus(int claimId, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim.Status newStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Integer executorId, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.ClaimComment claimComment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.Claim> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object changeClaimComment(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.ClaimComment comment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.ClaimComment> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllClaimsWithOpenAndInProgressStatus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.iteco.fmhandroid.dto.Claim>> continuation);
}