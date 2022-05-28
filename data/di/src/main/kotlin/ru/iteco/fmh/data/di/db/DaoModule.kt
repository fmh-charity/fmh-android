package ru.iteco.fmh.data.di.db

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.iteco.fmh.data.db.AppDb

@InstallIn(SingletonComponent::class)
@Module
object DaoModule {
    @Provides
    fun provideClaimDao(db: AppDb) = db.getClaimDao()

    @Provides
    fun provideNewsDao(db: AppDb) = db.getNewsDao()

    @Provides
    fun provideNewsCategoryDao(db: AppDb) = db.getNewsCategoryDao()

    @Provides
    fun provideClaimCommentDao(db: AppDb) = db.getClaimCommentDao()
}
