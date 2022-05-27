package ru.iteco.fmhandroid.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001Ja\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\'\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00132\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lru/iteco/fmhandroid/dao/NewsDao;", "", "getAllNews", "Lkotlinx/coroutines/flow/Flow;", "", "Lru/iteco/fmhandroid/dto/NewsWithCategory;", "publishEnabled", "", "publishDateBefore", "", "newsCategoryId", "", "dateStart", "dateEnd", "status", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "getAllNewsList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "news", "Lru/iteco/fmhandroid/entity/NewsEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newsItem", "(Lru/iteco/fmhandroid/entity/NewsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeNewsItemById", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeNewsItemsByIdList", "idList", "app_debug"})
public abstract interface NewsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM NewsEntity\n            WHERE (:publishEnabled IS NULL OR :publishEnabled = publishEnabled)\n            AND (:publishDateBefore IS NULL OR publishDate <= :publishDateBefore)\n            AND (:newsCategoryId IS NULL OR :newsCategoryId = newsCategoryId)\n            AND (:dateStart IS NULL OR publishDate >= :dateStart)\n            AND (:dateEnd IS NULL OR publishDate <= :dateEnd)\n            AND (:status IS NULL OR :status = publishEnabled)\n            ORDER BY publishDate DESC\n        ")
    @androidx.room.Transaction()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.NewsWithCategory>> getAllNews(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean publishEnabled, @org.jetbrains.annotations.Nullable()
    java.lang.Long publishDateBefore, @org.jetbrains.annotations.Nullable()
    java.lang.Integer newsCategoryId, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateStart, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateEnd, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean status);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM NewsEntity")
    @androidx.room.Transaction()
    public abstract java.lang.Object getAllNewsList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.iteco.fmhandroid.dto.NewsWithCategory>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.entity.NewsEntity newsItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.iteco.fmhandroid.entity.NewsEntity> news, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM NewsEntity WHERE id = :id")
    public abstract java.lang.Object removeNewsItemById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM NewsEntity WHERE id IN (:idList)")
    public abstract java.lang.Object removeNewsItemsByIdList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}