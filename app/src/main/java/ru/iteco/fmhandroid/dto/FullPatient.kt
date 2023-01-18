package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Relation
import ru.iteco.fmhandroid.entity.PatientEntity
import ru.iteco.fmhandroid.entity.WishEntity

@kotlinx.parcelize.Parcelize
class FullPatient(
    @Embedded
    val patient: Patient,

    @Relation(
        entity = WishEntity::class,
        parentColumn = "id",
        entityColumn = "patientId"
    )
    val wish: List<Wish>?
) : Parcelable
