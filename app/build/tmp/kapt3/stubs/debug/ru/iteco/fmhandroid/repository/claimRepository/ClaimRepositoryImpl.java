package ru.iteco.fmhandroid.repository.claimRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ3\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010\u001d\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J*\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001a0 2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0016J\u0019\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010(\u001a\u00020)H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ!\u0010*\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lru/iteco/fmhandroid/repository/claimRepository/ClaimRepositoryImpl;", "Lru/iteco/fmhandroid/repository/claimRepository/ClaimRepository;", "claimApi", "Lru/iteco/fmhandroid/api/ClaimApi;", "claimDao", "Lru/iteco/fmhandroid/dao/ClaimDao;", "claimCommentDao", "Lru/iteco/fmhandroid/dao/ClaimCommentDao;", "(Lru/iteco/fmhandroid/api/ClaimApi;Lru/iteco/fmhandroid/dao/ClaimDao;Lru/iteco/fmhandroid/dao/ClaimCommentDao;)V", "changeClaimComment", "Lru/iteco/fmhandroid/dto/ClaimComment;", "comment", "(Lru/iteco/fmhandroid/dto/ClaimComment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeClaimStatus", "Lru/iteco/fmhandroid/dto/Claim;", "claimId", "", "newStatus", "Lru/iteco/fmhandroid/dto/Claim$Status;", "executorId", "claimComment", "(ILru/iteco/fmhandroid/dto/Claim$Status;Ljava/lang/Integer;Lru/iteco/fmhandroid/dto/ClaimComment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNewClaim", "claim", "(Lru/iteco/fmhandroid/dto/Claim;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllClaimsWithOpenAndInProgressStatus", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCommentsForClaim", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClaimById", "Lkotlinx/coroutines/flow/Flow;", "Lru/iteco/fmhandroid/dto/FullClaim;", "getClaimsByStatus", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "listStatuses", "modificationOfExistingClaim", "editedClaim", "refreshClaims", "", "saveClaimComment", "(ILru/iteco/fmhandroid/dto/ClaimComment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class ClaimRepositoryImpl implements ru.iteco.fmhandroid.repository.claimRepository.ClaimRepository {
    private final ru.iteco.fmhandroid.api.ClaimApi claimApi = null;
    private final ru.iteco.fmhandroid.dao.ClaimDao claimDao = null;
    private final ru.iteco.fmhandroid.dao.ClaimCommentDao claimCommentDao = null;
    
    @javax.inject.Inject()
    public ClaimRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.api.ClaimApi claimApi, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dao.ClaimDao claimDao, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dao.ClaimCommentDao claimCommentDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.FullClaim>> getClaimsByStatus(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends ru.iteco.fmhandroid.dto.Claim.Status> listStatuses) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object refreshClaims(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object modificationOfExistingClaim(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim editedClaim, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.Claim> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createNewClaim(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim claim, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.Claim> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<ru.iteco.fmhandroid.dto.FullClaim> getClaimById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllCommentsForClaim(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.iteco.fmhandroid.dto.ClaimComment>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveClaimComment(int claimId, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.ClaimComment comment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.ClaimComment> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object changeClaimStatus(int claimId, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim.Status newStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Integer executorId, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.ClaimComment claimComment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.Claim> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object changeClaimComment(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.ClaimComment comment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.ClaimComment> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllClaimsWithOpenAndInProgressStatus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.iteco.fmhandroid.dto.Claim>> continuation) {
        return null;
    }
}