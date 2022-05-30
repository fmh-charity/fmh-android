package ru.iteco.fmh.data.di.api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import ru.iteco.fmh.data.api.RefreshTokensApi
import ru.iteco.fmh.data.di.qualifier.Refresh
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module(includes = [NetworkModule::class])
object RefreshApiModule {
    @Provides
    @Singleton
    fun provideRefreshTokensApi(@Refresh retrofit: Retrofit) =
        retrofit.create<RefreshTokensApi>()
}

