package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Wish(
    val id: Int? = null,
    val patientId: Int,
    val title: String,
    val description: String,
    val creatorId: Int,
    val executorId: Int?,
    val createDate: Long,
    val planExecuteDate: Long,
    val factExecuteDate: Long,
    val status: Status
) : Parcelable {

    enum class Status {
        OPEN,
        AT_WORK,
        CLOSED,
        EXECUTED
    }
}