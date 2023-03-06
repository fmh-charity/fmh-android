package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Patient(
    val id: Int?,
    val firstName: String,
    val lastName: String,
    val middleName: String,
    val birthDate: String,
    val dateIn: String,
    val dateOut: String,
    val dateInBoolean: Boolean,
    val dateOutBoolean: Boolean,
    var status: String,
    val room: Room? = null
) : Parcelable {

    enum class Status {
        DISCHARGED, ACTIVE, EXPECTED
    }
}
