package ru.iteco.fmhandroid.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\b\u001a\u00020\tH\'J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\'J\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lru/iteco/fmhandroid/dao/ClaimDao;", "", "getAllClaims", "", "Lru/iteco/fmhandroid/dto/FullClaim;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClaimById", "Lkotlinx/coroutines/flow/Flow;", "id", "", "getClaimsByStatus", "listStatuses", "Lru/iteco/fmhandroid/dto/Claim$Status;", "insertClaim", "", "claims", "Lru/iteco/fmhandroid/entity/ClaimEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "claim", "(Lru/iteco/fmhandroid/entity/ClaimEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeClaimsItemsByIdList", "idList", "app_debug"})
public abstract interface ClaimDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ClaimEntity")
    @androidx.room.Transaction()
    public abstract java.lang.Object getAllClaims(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.iteco.fmhandroid.dto.FullClaim>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n       SELECT * FROM ClaimEntity\n       WHERE (status IN (:listStatuses))\n       ORDER BY planExecuteDate ASC, createDate DESC\n    ")
    @androidx.room.Transaction()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.FullClaim>> getClaimsByStatus(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends ru.iteco.fmhandroid.dto.Claim.Status> listStatuses);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertClaim(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.entity.ClaimEntity claim, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertClaim(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.iteco.fmhandroid.entity.ClaimEntity> claims, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ClaimEntity WHERE id = :id")
    @androidx.room.Transaction()
    public abstract kotlinx.coroutines.flow.Flow<ru.iteco.fmhandroid.dto.FullClaim> getClaimById(int id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM ClaimEntity WHERE id IN (:idList)")
    public abstract java.lang.Object removeClaimsItemsByIdList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}