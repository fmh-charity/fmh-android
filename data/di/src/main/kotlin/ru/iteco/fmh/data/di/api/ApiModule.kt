package ru.iteco.fmh.data.di.api

import ru.iteco.fmh.data.di.qualifier.Authorized
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import ru.iteco.fmh.data.api.ClaimApi
import ru.iteco.fmh.data.api.NewsApi
import ru.iteco.fmh.data.api.UserApi
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module(includes = [NetworkModule::class])
object ApiModule {
    @Provides
    @Singleton
    fun provideClaimApi(@Authorized retrofit: Retrofit) = retrofit.create<ClaimApi>()

    @Provides
    @Singleton
    fun provideUserApi(@Authorized retrofit: Retrofit) = retrofit.create<UserApi>()

    @Provides
    @Singleton
    fun provideNewsApi(@Authorized retrofit: Retrofit) = retrofit.create<NewsApi>()
}
