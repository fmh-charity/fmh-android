package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Patient(
    val id: Int? = null,
    val first_name: String,
    val last_name: String,
    val midle_name: String,
    val birth_day: Long,
    val status: Status,
    val fact_date_in: Long,
    val fact_date_out: Long,
    val room_id: Long,
    val wish: String,

) : Parcelable {

    enum class Status {
        NEW,
        IN_HOSPICE,
        DISCHARGED
    }
}