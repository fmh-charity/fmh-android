package ru.iteco.fmhandroid.repository.newsRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006Ji\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fH&\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n0\tH&J\u0019\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u001b\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lru/iteco/fmhandroid/repository/newsRepository/NewsRepository;", "", "changeIsOpen", "", "newsItem", "Lru/iteco/fmhandroid/dto/News;", "(Lru/iteco/fmhandroid/dto/News;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNews", "getAllNews", "Lkotlinx/coroutines/flow/Flow;", "", "Lru/iteco/fmhandroid/dto/NewsWithCategory;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "publishEnabled", "", "publishDateBefore", "", "newsCategoryId", "", "dateStart", "dateEnd", "status", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "getAllNewsCategories", "Lru/iteco/fmhandroid/dto/News$Category;", "modificationOfExistingNews", "refreshNews", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeNewsItemById", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveNewsCategories", "listNewsCategories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NewsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refreshNews(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object modificationOfExistingNews(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News newsItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.News> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createNews(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News newsItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.News> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeNewsItemById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.News.Category>> getAllNewsCategories();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveNewsCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.iteco.fmhandroid.dto.News.Category> listNewsCategories, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.NewsWithCategory>> getAllNews(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean publishEnabled, @org.jetbrains.annotations.Nullable()
    java.lang.Long publishDateBefore, @org.jetbrains.annotations.Nullable()
    java.lang.Integer newsCategoryId, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateStart, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateEnd, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean status);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object changeIsOpen(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News newsItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}