package ru.iteco.fmhandroid.dao

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.iteco.fmhandroid.db.AppDb

@InstallIn(SingletonComponent::class)
@Module
object DaoModule {
    @Provides
    fun provideClaimDao(db: AppDb): ClaimDao = db.getClaimDao()

    @Provides
    fun provideNewsDao(db: AppDb): NewsDao = db.getNewsDao()

    @Provides
    fun provideNewsCategoryDao(db: AppDb): NewsCategoryDao = db.getNewsCategoryDao()

    @Provides
    fun provideClaimCommentDao(db: AppDb): ClaimCommentDao = db.getClaimCommentDao()

    @Provides
    fun provideRoomDao(db: AppDb): RoomDao = db.getRoomDao()

    @Provides
    fun provideBlockDao(db: AppDb): BlockDao = db.getBlockDao()

    @Provides
    fun provideNurseStationDao(db: AppDb): NurseStationDao = db.getNurseStationDao()
}