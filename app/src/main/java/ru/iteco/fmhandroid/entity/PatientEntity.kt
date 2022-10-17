package ru.iteco.fmhandroid.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.iteco.fmhandroid.dto.Patient


@Entity(tableName = "PatientEntity")
class PatientEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int? = null,
    @ColumnInfo(name = "first_name")
    val first_name: String,
    @ColumnInfo(name = "last_name")
    val last_name: String,
    @ColumnInfo(name = "middle_name")
    val middle_name: String,
    @ColumnInfo(name = "birth_day")
    val birth_day: Long,
    @ColumnInfo(name = "status")
    val status: Patient.Status,
    @ColumnInfo(name = "fact_date_in")
    val fact_date_in: Long,
    @ColumnInfo(name = "fact_date_out")
    val fact_date_out: Long,
    @ColumnInfo(name = "room_id")
    val room_id: Long,
    @ColumnInfo(name = "wish")
    val wish: String
)

fun List<Patient>.toEntity(): List<PatientEntity> = map(Patient::toEntity)

fun Patient.toEntity() = PatientEntity(
    id = id,
    first_name = first_name,
    last_name = last_name,
    middle_name = middle_name,
    birth_day = birth_day,
    status = status,
    fact_date_in = fact_date_in,
    fact_date_out = fact_date_out,
    room_id = room_id,
    wish = wish
)
