package ru.iteco.fmh.data.impl.converter

import ru.iteco.fmh.data.db.entity.ClaimEntity
import ru.iteco.fmh.model.Claim

internal fun Claim.Status.toEntity() = when (this) {
    Claim.Status.CANCELLED -> ClaimEntity.Status.CANCELLED
    Claim.Status.EXECUTED -> ClaimEntity.Status.EXECUTED
    Claim.Status.IN_PROGRESS -> ClaimEntity.Status.IN_PROGRESS
    Claim.Status.OPEN -> ClaimEntity.Status.OPEN
}

internal fun List<Claim.Status>.toEntity() = map { it.toEntity() }

internal fun ClaimEntity.Status.toModel() = when (this) {
    ClaimEntity.Status.CANCELLED -> Claim.Status.CANCELLED
    ClaimEntity.Status.EXECUTED -> Claim.Status.EXECUTED
    ClaimEntity.Status.IN_PROGRESS -> Claim.Status.IN_PROGRESS
    ClaimEntity.Status.OPEN -> Claim.Status.OPEN
}