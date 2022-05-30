package ru.iteco.fmh.data.db.converter

import androidx.room.TypeConverter
import ru.iteco.fmh.data.db.entity.ClaimEntity

internal object ClaimStatusConverter {

    @TypeConverter
    fun toClaimStatus(status: String): ClaimEntity.Status = when (status) {
        CANCELLED_STATUS_KEY -> ClaimEntity.Status.CANCELLED
        EXECUTED_STATUS_KEY -> ClaimEntity.Status.EXECUTED
        IN_PROGRESS_STATUS_KEY -> ClaimEntity.Status.IN_PROGRESS
        OPEN_STATUS_KEY -> ClaimEntity.Status.OPEN
        else -> error("Unknown status '$status'")
    }

    @TypeConverter
    fun fromClaimStatus(status: ClaimEntity.Status) = when (status) {
        ClaimEntity.Status.CANCELLED -> CANCELLED_STATUS_KEY
        ClaimEntity.Status.EXECUTED -> EXECUTED_STATUS_KEY
        ClaimEntity.Status.IN_PROGRESS -> IN_PROGRESS_STATUS_KEY
        ClaimEntity.Status.OPEN -> OPEN_STATUS_KEY
    }

    private const val CANCELLED_STATUS_KEY = "CANCELLED"
    private const val EXECUTED_STATUS_KEY = "EXECUTED"
    private const val IN_PROGRESS_STATUS_KEY = "IN_PROGRESS"
    private const val OPEN_STATUS_KEY = "OPEN"
}