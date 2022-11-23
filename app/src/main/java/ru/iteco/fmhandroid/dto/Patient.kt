package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import android.text.Editable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Patient(
    val id: Int? = null,
    val firstName: String,
    val lastName: String,
    val middleName: String,
    val birthDate: Long,
    val status: Status,
    val factDateIn: Long,
    val factDateOut: Long,
    val roomId: Long,
    val wish: String

) : Parcelable {

    enum class Status  {
        NEW,
        IN_HOSPICE,
        DISCHARGED
    }
}