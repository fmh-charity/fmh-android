package ru.iteco.fmh.data.db.converter

import androidx.room.TypeConverter
import ru.iteco.fmh.model.Claim

class ClaimClaimStatusConverter {

    @TypeConverter
    fun toClaimStatus(status: String): Claim.Status = Claim.Status.valueOf(status)

    @TypeConverter
    fun fromClaimStatus(status: Claim.Status) = status.name
}