package ru.iteco.fmh.data.di.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.iteco.fmh.data.AuthRepository
import ru.iteco.fmh.data.impl.AuthRepositoryImpl

@InstallIn(SingletonComponent::class)
@Module
abstract class AuthRepositoryModule {
    @Binds
    abstract fun bindAuthRepository(impl: AuthRepositoryImpl): AuthRepository
}