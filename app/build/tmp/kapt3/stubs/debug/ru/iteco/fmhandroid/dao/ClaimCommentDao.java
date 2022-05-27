package ru.iteco.fmhandroid.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lru/iteco/fmhandroid/dao/ClaimCommentDao;", "", "getClaimComments", "Lkotlinx/coroutines/flow/Flow;", "", "Lru/iteco/fmhandroid/dto/ClaimComment;", "claimId", "", "insertComment", "", "comment", "Lru/iteco/fmhandroid/entity/ClaimCommentEntity;", "(Lru/iteco/fmhandroid/entity/ClaimCommentEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertComments", "comments", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ClaimCommentDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ClaimCommentEntity WHERE claimId = :claimId")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.ClaimComment>> getClaimComments(int claimId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertComments(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.iteco.fmhandroid.entity.ClaimCommentEntity> comments, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertComment(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.entity.ClaimCommentEntity comment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}