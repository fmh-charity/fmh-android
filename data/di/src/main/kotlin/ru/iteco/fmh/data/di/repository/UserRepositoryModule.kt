package ru.iteco.fmh.data.di.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.iteco.fmh.data.UserRepository
import ru.iteco.fmh.data.impl.UserRepositoryImpl
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class UserRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindUserRepository(impl: UserRepositoryImpl): UserRepository
}
