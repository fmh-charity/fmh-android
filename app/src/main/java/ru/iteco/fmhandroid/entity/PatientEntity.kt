package ru.iteco.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.iteco.fmhandroid.dto.Patient

@Entity(tableName = "PatientEntity")
data class PatientEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int?,
    @ColumnInfo(name = "firstName")
    val firstName: String,
    @ColumnInfo(name = "lastName")
    val lastName: String,
    @ColumnInfo(name = "middleName")
    val middleName: String,
    @ColumnInfo(name = "birthDate")
    val birthDate: String,
    @ColumnInfo(name = "dateIn")
    val dateIn: String,
    @ColumnInfo(name = "dateOut")
    val dateOut: String,
    @ColumnInfo(name = "dateInBoolean")
    val dateInBoolean: Boolean,
    @ColumnInfo(name = "dateOutBoolean")
    val dateOutBoolean: Boolean,
    @ColumnInfo(name = "status")
    val status: String,
    @ColumnInfo(name = "room")
    val room: Int //RoomDtoRs
)

fun List<Patient>.toEntity(): List<PatientEntity> = map(Patient::toEntity)
fun Patient.toEntity() = PatientEntity(
    id = id,
    firstName = firstName,
    lastName = lastName,
    middleName = middleName,
    birthDate = birthDate,
    dateIn = dateIn,
    dateOut = dateOut,
    dateInBoolean = dateInBoolean,
    dateOutBoolean = dateOutBoolean,
    status = status,
    room = room
)