package ru.iteco.fmh.data.impl.converter

import ru.iteco.fmh.data.db.entity.ClaimEntity
import ru.iteco.fmh.model.Claim
import ru.iteco.fmh.model.FullClaim

internal fun Claim.toEntity() = ClaimEntity(
    id = id,
    title = title,
    description = description,
    creatorId = creatorId,
    creatorName = creatorName,
    executorId = executorId,
    executorName = executorName,
    createDate = createDate,
    planExecuteDate = planExecuteDate,
    factExecuteDate = factExecuteDate,
    status = status.toEntity()
)

internal fun List<Claim>.toEntity(): List<ClaimEntity> = map(Claim::toEntity)

internal fun ClaimEntity.toModel() = Claim(
    id = id,
    title = title,
    description = description,
    creatorId = creatorId,
    creatorName = creatorName,
    executorId = executorId,
    executorName = executorName,
    createDate = createDate,
    planExecuteDate = planExecuteDate,
    factExecuteDate = factExecuteDate,
    status = status.toModel(),
)

internal fun ClaimEntity.WithComments.toModel() = FullClaim(
    claim = claim.toModel(),
    comments = comments?.toModel()
)

internal fun List<ClaimEntity.WithComments>.toModel() = map { it.toModel() }