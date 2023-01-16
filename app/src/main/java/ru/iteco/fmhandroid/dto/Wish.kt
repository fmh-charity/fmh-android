package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Wish(
    val id: Int,
    val patientId: Int,//	PatientDtoIdFio
    val title: String,
    val description: String,
    val creatorId: Int,
    val executorId: Int,    //UserDtoIdFio
    val createDate: Int,
    val planExecuteDate: Int,
    val factExecuteDate: Int,
    val status: String,
    val room: Int, //	RoomDtoRs
    val wishVisibility: Int
) : Parcelable {

    enum class Status {
        IN_PROGRESS, CANCELLED, OPEN, EXECUTED
    }
}

