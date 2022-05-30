package ru.iteco.fmhandroid.dto

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.TypeParceler
import ru.iteco.fmh.model.Claim

@Parcelize
class ClaimNavArg(
    @TypeParceler<Claim, Companion> val claim: Claim
) : Parcelable {

    private companion object : Parceler<Claim> {
        override fun create(parcel: Parcel) = with(parcel) {
            Claim(
                id = readInt(),
                title = requireNotNull(readString()) {
                    "`Claim.title` should not be null"
                },
                description = requireNotNull(readString()) {
                    "`Claim.description` should not be null"
                },
                creatorId = readInt(),
                creatorName = requireNotNull(readString()) {
                    "`Claim.creatorName` should not be null"
                },
                executorId = readInt(),
                executorName = readString(),
                createDate = readLong(),
                planExecuteDate = readLong(),
                factExecuteDate = readLong(),
                status = Claim.Status.values()[readInt()],
            )
        }

        override fun Claim.write(parcel: Parcel, flags: Int) = with(parcel) {
            writeInt(id ?: 0)
            writeString(title)
            writeString(description)
            writeInt(creatorId)
            writeString(creatorName)
            writeInt(executorId ?: 0)
            writeString(executorName)
            writeLong(createDate)
            writeLong(planExecuteDate)
            writeLong(factExecuteDate ?: 0L)
            writeInt(status.ordinal)
        }
    }
}
