package ru.iteco.fmh.data.di.api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import ru.iteco.fmh.data.api.AuthApi
import ru.iteco.fmh.data.di.qualifier.NonAuthorized
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module(includes = [NetworkModule::class])
object AuthApiModule {

    @Provides
    @Singleton
    fun provideAuthApi(@NonAuthorized retrofit: Retrofit) = retrofit.create<AuthApi>()
}
