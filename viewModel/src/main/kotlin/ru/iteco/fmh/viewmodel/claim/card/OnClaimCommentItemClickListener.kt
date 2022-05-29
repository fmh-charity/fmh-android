package ru.iteco.fmh.viewmodel.claim.card

import ru.iteco.fmh.model.Claim

interface OnClaimCommentItemClickListener {
    fun onCard(claimComment: Claim.Comment)
}