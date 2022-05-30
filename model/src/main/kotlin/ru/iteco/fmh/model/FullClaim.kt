package ru.iteco.fmh.model

data class FullClaim(
    val claim: Claim,
    val comments: List<Claim.Comment>?
)
