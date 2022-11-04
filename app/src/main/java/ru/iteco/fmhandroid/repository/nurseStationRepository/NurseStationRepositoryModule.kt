package ru.iteco.fmhandroid.repository.nurseStationRepository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
abstract class NurseStationRepositoryModule {
    @Binds
    abstract fun bindNurseStationRepository(imp: NurseStationRepositoryImpl): NurseStationRepository
}