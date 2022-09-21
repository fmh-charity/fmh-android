package ru.iteco.fmh.data.impl

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import ru.iteco.fmh.data.ClaimRepository
import ru.iteco.fmh.data.api.ClaimApi
import ru.iteco.fmh.data.db.dao.ClaimCommentDao
import ru.iteco.fmh.data.db.dao.ClaimDao
import ru.iteco.fmh.data.impl.converter.toDto
import ru.iteco.fmh.data.impl.converter.toEntity
import ru.iteco.fmh.data.impl.converter.toModel
import ru.iteco.fmh.data.impl.util.makeRequest
import ru.iteco.fmh.model.Claim
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ClaimRepositoryImpl @Inject constructor(
    private val claimApi: ClaimApi,
    private val claimDao: ClaimDao,
    private val claimCommentDao: ClaimCommentDao
) : ClaimRepository {

    override fun getClaimsByStatus(
        coroutineScope: CoroutineScope,
        listStatuses: List<Claim.Status>
    ) = claimDao.getClaimsByStatus(
        listStatuses.toEntity()
    ).flowOn(Dispatchers.Default).map {
        it.toModel()
    }

    override suspend fun refreshClaims() = makeRequest(
        request = { claimApi.getAllClaims() },
        onSuccess = { body ->
            val apiId = body
                .map { it.id }
            val databaseId = claimDao.getAllClaims()
                .map { it.claim.id }
                .toMutableList()
            databaseId.removeAll(apiId)
            claimDao.removeClaimsItemsByIdList(databaseId)
            claimDao.insertClaim(body.map { it.toEntity() })
        }
    )

    override suspend fun modificationOfExistingClaim(editedClaim: Claim): Claim = makeRequest(
        request = { claimApi.updateClaim(editedClaim.toDto()) },
        onSuccess = { body ->
            claimDao.insertClaim(body.toEntity())
            body.toModel()
        }
    )

    override suspend fun createNewClaim(claim: Claim): Claim = makeRequest(
        request = { claimApi.saveClaim(claim.toDto()) },
        onSuccess = { body ->
            claimDao.insertClaim(body.toEntity())
            body.toModel()
        }
    )

    override fun getClaimById(id: Int) = claimDao.getClaimById(id).map {
        it.toModel()
    }

    override suspend fun getAllCommentsForClaim(id: Int): List<Claim.Comment> = makeRequest(
        request = { claimApi.getAllClaimComments(id) },
        onSuccess = { body ->
            val entities = body.map { it.toEntity() }
            claimCommentDao.insertComments(entities)
            body.map { it.toModel() }
        }
    )

    override suspend fun saveClaimComment(claimId: Int, comment: Claim.Comment): Claim.Comment =
        makeRequest(
            request = { claimApi.saveClaimComment(claimId, comment.toDto()) },
            onSuccess = { body ->
                claimCommentDao.insertComment(body.toEntity())
                body.toModel()
            }
        )

    override suspend fun changeClaimStatus(
        claimId: Int,
        newStatus: Claim.Status,
        executorId: Int?,
        claimComment: Claim.Comment
    ): Claim = makeRequest(
        request = {
            claimApi.updateClaimStatus(
                claimId,
                newStatus.toDto(),
                executorId,
                claimComment.toDto()
            )
        },
        onSuccess = { body ->
            claimDao.insertClaim(body.toEntity())
            getAllCommentsForClaim(claimId)
            body.toModel()
        }
    )

    override suspend fun changeClaimComment(comment: Claim.Comment): Claim.Comment = makeRequest(
        request = { claimApi.updateClaimComment(comment.toDto()) },
        onSuccess = { body ->
            claimCommentDao.insertComment(body.toEntity())
            body.toModel()
        }
    )

    override suspend fun getAllClaimsWithOpenAndInProgressStatus(): List<Claim> {
        return makeRequest(
            request = { claimApi.getClaimsInOpenAndInProgressStatus() },
            onSuccess = { body ->
                claimDao.insertClaim(body.map { it.toEntity() })
                body.map { it.toModel() }
            }
        )
    }
}
