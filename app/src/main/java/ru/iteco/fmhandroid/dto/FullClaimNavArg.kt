package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import ru.iteco.fmh.model.FullClaim


@Parcelize
class FullClaimNavArg private constructor(
    private val claimNavArg: ClaimNavArg,
    private val commentNavArgs: List<ClaimCommentNavArg>?
) : Parcelable {

    val claim get() = claimNavArg.claim
    val comments get() = commentNavArgs?.map { it.comment }

    constructor(fullClaim: FullClaim) : this(
        claimNavArg = ClaimNavArg(fullClaim.claim),
        commentNavArgs = fullClaim.comments?.map(::ClaimCommentNavArg)
    )
}
