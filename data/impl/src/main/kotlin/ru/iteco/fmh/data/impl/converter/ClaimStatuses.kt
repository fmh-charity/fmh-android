package ru.iteco.fmh.data.impl.converter

import ru.iteco.fmh.data.api.dto.ClaimDto
import ru.iteco.fmh.data.db.entity.ClaimEntity
import ru.iteco.fmh.model.Claim

internal fun Claim.Status.toEntity() = when (this) {
    Claim.Status.CANCELLED -> ClaimEntity.Status.CANCELLED
    Claim.Status.EXECUTED -> ClaimEntity.Status.EXECUTED
    Claim.Status.IN_PROGRESS -> ClaimEntity.Status.IN_PROGRESS
    Claim.Status.OPEN -> ClaimEntity.Status.OPEN
}

internal fun ClaimDto.Status.toEntity() = when (this) {
    ClaimDto.Status.CANCELLED -> ClaimEntity.Status.CANCELLED
    ClaimDto.Status.EXECUTED -> ClaimEntity.Status.EXECUTED
    ClaimDto.Status.IN_PROGRESS -> ClaimEntity.Status.IN_PROGRESS
    ClaimDto.Status.OPEN -> ClaimEntity.Status.OPEN
}

internal fun List<Claim.Status>.toEntity() = map { it.toEntity() }

internal fun ClaimEntity.Status.toModel() = when (this) {
    ClaimEntity.Status.CANCELLED -> Claim.Status.CANCELLED
    ClaimEntity.Status.EXECUTED -> Claim.Status.EXECUTED
    ClaimEntity.Status.IN_PROGRESS -> Claim.Status.IN_PROGRESS
    ClaimEntity.Status.OPEN -> Claim.Status.OPEN
}

internal fun ClaimDto.Status.toModel() = when (this) {
    ClaimDto.Status.CANCELLED -> Claim.Status.CANCELLED
    ClaimDto.Status.EXECUTED -> Claim.Status.EXECUTED
    ClaimDto.Status.IN_PROGRESS -> Claim.Status.IN_PROGRESS
    ClaimDto.Status.OPEN -> Claim.Status.OPEN
}

internal fun Claim.Status.toDto() = when (this) {
    Claim.Status.CANCELLED -> ClaimDto.Status.CANCELLED
    Claim.Status.EXECUTED -> ClaimDto.Status.EXECUTED
    Claim.Status.IN_PROGRESS -> ClaimDto.Status.IN_PROGRESS
    Claim.Status.OPEN -> ClaimDto.Status.OPEN
}