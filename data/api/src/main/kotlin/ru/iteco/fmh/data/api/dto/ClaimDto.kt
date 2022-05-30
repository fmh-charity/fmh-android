package ru.iteco.fmh.data.api.dto

import com.google.gson.annotations.SerializedName

class ClaimDto(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("creatorId")
    val creatorId: Int,
    @SerializedName("creatorName")
    val creatorName: String,
    @SerializedName("executorId")
    var executorId: Int? = null,
    @SerializedName("executorName")
    val executorName: String? = null,
    @SerializedName("createDate")
    val createDate: Long,
    @SerializedName("planExecuteDate")
    val planExecuteDate: Long,
    @SerializedName("factExecuteDate")
    val factExecuteDate: Long? = null,
    @SerializedName("status")
    var status: Status,
) {

    class Comment(
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("claimId")
        val claimId: Int,
        @SerializedName("description")
        val description: String,
        @SerializedName("creatorId")
        val creatorId: Int,
        @SerializedName("creatorName")
        val creatorName: String,
        @SerializedName("createDate")
        val createDate: Long,
    )

    enum class Status {
        @SerializedName("CANCELLED")
        CANCELLED,

        @SerializedName("EXECUTED")
        EXECUTED,

        @SerializedName("IN_PROGRESS")
        IN_PROGRESS,

        @SerializedName("OPEN")
        OPEN
    }
}
