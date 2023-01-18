package ru.iteco.fmhandroid.dao

import androidx.room.*
import ru.iteco.fmhandroid.dto.FullPatient
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.entity.PatientEntity

@Dao
interface PatientDao {
    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPatient(patient: PatientEntity)

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPatient(patient: List<PatientEntity>)

    @Transaction
    @Query("SELECT * FROM PatientEntity")
    suspend fun getAllPatients(): List<FullPatient>

    @Transaction
    @Query("SELECT * FROM PatientEntity WHERE id = :id")
    fun getPatientById(id: Int): Patient


}