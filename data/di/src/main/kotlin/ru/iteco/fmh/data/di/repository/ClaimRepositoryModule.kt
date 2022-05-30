package ru.iteco.fmh.data.di.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.iteco.fmh.data.ClaimRepository
import ru.iteco.fmh.data.impl.ClaimRepositoryImpl

@InstallIn(SingletonComponent::class)
@Module
abstract class ClaimRepositoryModule {
    @Binds
    abstract fun bindClaimRepository(imp: ClaimRepositoryImpl): ClaimRepository
}
