package ru.iteco.fmhandroid.dao;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\r"}, d2 = {"Lru/iteco/fmhandroid/dao/DaoModule;", "", "()V", "provideClaimCommentDao", "Lru/iteco/fmhandroid/dao/ClaimCommentDao;", "db", "Lru/iteco/fmhandroid/db/AppDb;", "provideClaimDao", "Lru/iteco/fmhandroid/dao/ClaimDao;", "provideNewsCategoryDao", "Lru/iteco/fmhandroid/dao/NewsCategoryDao;", "provideNewsDao", "Lru/iteco/fmhandroid/dao/NewsDao;", "app_debug"})
@dagger.Module()
public final class DaoModule {
    @org.jetbrains.annotations.NotNull()
    public static final ru.iteco.fmhandroid.dao.DaoModule INSTANCE = null;
    
    private DaoModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.iteco.fmhandroid.dao.ClaimDao provideClaimDao(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.db.AppDb db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.iteco.fmhandroid.dao.NewsDao provideNewsDao(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.db.AppDb db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.iteco.fmhandroid.dao.NewsCategoryDao provideNewsCategoryDao(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.db.AppDb db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.iteco.fmhandroid.dao.ClaimCommentDao provideClaimCommentDao(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.db.AppDb db) {
        return null;
    }
}