package ru.iteco.fmhandroid.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {ru.iteco.fmhandroid.dao.ClaimClaimStatusConverter.class})
@androidx.room.Database(entities = {ru.iteco.fmhandroid.entity.ClaimEntity.class, ru.iteco.fmhandroid.entity.ClaimCommentEntity.class, ru.iteco.fmhandroid.entity.NewsEntity.class, ru.iteco.fmhandroid.entity.NewsCategoryEntity.class, ru.iteco.fmhandroid.entity.RoomEntity.class, ru.iteco.fmhandroid.entity.BlockEntity.class, ru.iteco.fmhandroid.entity.NurseStationEntity.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lru/iteco/fmhandroid/db/AppDb;", "Landroidx/room/RoomDatabase;", "()V", "getClaimCommentDao", "Lru/iteco/fmhandroid/dao/ClaimCommentDao;", "getClaimDao", "Lru/iteco/fmhandroid/dao/ClaimDao;", "getNewsCategoryDao", "Lru/iteco/fmhandroid/dao/NewsCategoryDao;", "getNewsDao", "Lru/iteco/fmhandroid/dao/NewsDao;", "app_debug"})
public abstract class AppDb extends androidx.room.RoomDatabase {
    
    public AppDb() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.iteco.fmhandroid.dao.ClaimDao getClaimDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.iteco.fmhandroid.dao.ClaimCommentDao getClaimCommentDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.iteco.fmhandroid.dao.NewsDao getNewsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.iteco.fmhandroid.dao.NewsCategoryDao getNewsCategoryDao();
}