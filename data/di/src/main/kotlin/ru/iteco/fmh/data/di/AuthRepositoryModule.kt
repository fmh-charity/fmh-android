package ru.iteco.fmh.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.iteco.fmh.data.AppAuth
import ru.iteco.fmh.data.impl.AppAuthImpl

@InstallIn(SingletonComponent::class)
@Module
interface AppAuthModule {

    @Binds
    fun bindAuthRepository(impl: AppAuthImpl): AppAuth
}