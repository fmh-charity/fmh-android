package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Wish(
    val id: Int? = null,
    val patient_id: Int,
    val title: String,
    val description: String,
    val creator_id: Int,
    val executor_id: Int,
    val create_date: Long,
    val plan_execute_date: Long,
    val fact_execute_date: Long,
    val status: Status
) : Parcelable {

    enum class Status {
        OPEN,
        AT_WORK,
        CLOSED
    }
}