package ru.iteco.fmh.model

data class Claim(
    val id: Int? = null,
    val title: String,
    val description: String,
    val creatorId: Int,
    val creatorName: String,
    var executorId: Int? = null,
    val executorName: String? = null,
    val createDate: Long,
    val planExecuteDate: Long,
    val factExecuteDate: Long? = null,
    var status: Status,
) {

    data class Comment(
        val id: Int? = null,
        val claimId: Int,
        val description: String,
        val creatorId: Int,
        val creatorName: String,
        val createDate: Long,
    )

    enum class Status {
        CANCELLED,
        EXECUTED,
        IN_PROGRESS,
        OPEN
    }
}
