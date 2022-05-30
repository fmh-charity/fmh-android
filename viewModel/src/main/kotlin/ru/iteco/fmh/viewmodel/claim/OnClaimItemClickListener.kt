package ru.iteco.fmh.viewmodel.claim

import ru.iteco.fmh.model.FullClaim

interface OnClaimItemClickListener {
    fun onCard(fullClaim: FullClaim) {}
}