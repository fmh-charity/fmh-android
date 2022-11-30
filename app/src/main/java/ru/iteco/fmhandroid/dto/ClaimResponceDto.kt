package ru.iteco.fmhandroid.dto

data class ClaimResponseDto(
    val claimList: List<Claim>,
    val page: Int
)
