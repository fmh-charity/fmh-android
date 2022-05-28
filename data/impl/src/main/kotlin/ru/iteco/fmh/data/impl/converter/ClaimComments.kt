package ru.iteco.fmh.data.impl.converter

import ru.iteco.fmh.data.db.entity.ClaimCommentEntity
import ru.iteco.fmh.model.Claim

internal fun List<Claim.Comment>.toEntity(): List<ClaimCommentEntity> = map(Claim.Comment::toEntity)

internal fun Claim.Comment.toEntity() = ClaimCommentEntity(
    id = id,
    claimId = claimId,
    description = description,
    creatorId = creatorId,
    creatorName = creatorName,
    createDate = createDate
)

internal fun ClaimCommentEntity.toModel() = Claim.Comment(
    id = id,
    claimId = claimId,
    description = description,
    creatorId = creatorId,
    creatorName = creatorName,
    createDate = createDate
)

internal fun List<ClaimCommentEntity>.toModel() = map { it.toModel() }
