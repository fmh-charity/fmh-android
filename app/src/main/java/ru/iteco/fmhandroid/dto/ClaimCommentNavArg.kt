package ru.iteco.fmhandroid.dto

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.TypeParceler
import ru.iteco.fmh.model.Claim

@Parcelize
class ClaimCommentNavArg(
    @TypeParceler<Claim.Comment, Companion> val comment: Claim.Comment
) : Parcelable {

    private companion object : Parceler<Claim.Comment> {

        override fun create(parcel: Parcel) = with(parcel) {
            Claim.Comment(
                id = readInt(),
                claimId = readInt(),
                description = requireNotNull(readString()) {
                    "Claim.Comment.description should be not null"
                },
                creatorId = readInt(),
                creatorName = requireNotNull(readString()) {
                    "Claim.Comment.creatorName should be not null"
                },
                createDate = readLong(),
            )
        }

        override fun Claim.Comment.write(parcel: Parcel, flags: Int) = with(parcel) {
            writeInt(id ?: 0)
            writeInt(claimId)
            writeString(description)
            writeInt(creatorId)
            writeString(creatorName)
            writeLong(createDate)
        }
    }
}