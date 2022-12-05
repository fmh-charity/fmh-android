package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Relation

@kotlinx.parcelize.Parcelize
class FullPatient (
    @Embedded
    val patient: Patient,

    @Relation(
        entity = Patient::class,
        parentColumn = "id",
        entityColumn = "patientId"
    )
    val wish: List<Wish>?
    ) : Parcelable
