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
    fun provideNewsKeyDao(db: AppDb): NewsKeyDao = db.newsKeyDao()

    @Provides
    fun provideClaimKeyDao(db: AppDb): ClaimKeyDao = db.claimKeyDao()

    @Provides
    fun provideNewsCategoryDao(db: AppDb): NewsCategoryDao = db.getNewsCategoryDao()

    @Provides
    fun provideClaimCommentDao(db: AppDb): ClaimCommentDao = db.getClaimCommentDao()

    @Provides
    fun provideWishCommentDao(db: AppDb): WishCommentDao = db.getWishCommentDao()

    @Provides
    fun provideWishDao(db: AppDb): WishDao = db.getWishDao()
   }
