package ru.iteco.fmhandroid.repository.wishRepository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import org.w3c.dom.Comment
import ru.iteco.fmhandroid.api.WishApi
import ru.iteco.fmhandroid.dao.WishCommentDao
import ru.iteco.fmhandroid.dao.WishDao
import ru.iteco.fmhandroid.dto.Wish
import ru.iteco.fmhandroid.dto.WishComment
import ru.iteco.fmhandroid.entity.toEntity
import ru.iteco.fmhandroid.utils.Utils.makeRequest
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WishRepositoryImpl @Inject constructor(
    private val wishDao: WishDao,
    private val wishApi: WishApi,
    private val wishCommentDao: WishCommentDao,
    override var wishList: List<Wish>
) : WishRepository {

    override suspend fun getAllWish() = makeRequest(
            request = { wishApi.getAllWish() },
            onSuccess = { body ->
                body.also {
                    wishList = it
                }
            }
        )

    override suspend fun createNewWish(wish: Wish): Wish =  makeRequest(
    request = { wishApi.createWishItem(wish) },
    onSuccess = { body ->
        wishDao.insertWish(body.toEntity())
        body
    }
    )

    override suspend fun refreshWish() = makeRequest(
        request = { wishApi.getAllWish() },
        onSuccess = { body ->
            val apiId = body
                .map { it.id }
            val databaseId = wishDao.getAllWish()
                .map { it.wish.id }
                .toMutableList()
            databaseId.removeAll(apiId)
            wishDao.removeWishItemsByIdList(databaseId)
            wishDao.insertWish(body.toEntity())
        }
    )

    override fun getWishById(id: Int) = wishDao.getWishById(id)

    override suspend fun getAllCommentForWish(id: Int): List<WishComment> = makeRequest(
        request = { wishApi.getAllWishComments(id) },
        onSuccess = { body ->
            wishCommentDao.insertComments(body.toEntity())
            body
        }
        )


    override suspend fun saveWishComment(wishId: Int, comment: WishComment): WishComment =
        makeRequest(
            request = { wishApi.saveWishComment(wishId, comment) },
            onSuccess = { body ->
                wishCommentDao.insertComment(body.toEntity())
                body
            }
        )

    override suspend fun processingWishForStatusModel() {
        TODO("Not yet implemented")
    }

    override suspend fun updateInfoForComment(comment: Comment): Comment {
        TODO("Not yet implemented")
    }

    override suspend fun getFullInfoCommentForWish(id: Int): Comment {
        TODO("Not yet implemented")
    }

    override suspend fun getAllWishWithOpenAndInProgressStatus(): List<Wish> {
        return makeRequest(
            request = { wishApi.getWishInOpenAndInProgressStatus() },
            onSuccess = { body ->
                wishDao.insertWish(body.toEntity())
                body
            }
        )
    }

    override fun getWishByStatus(
        coroutineScope: CoroutineScope,
        listStatuses: List<Wish.Status>
    ) = wishDao.getWishByStatus(
        listStatuses
    ).flowOn(Dispatchers.Default)

    override suspend fun changeWishStatus(
        wishId: Int,
        newStatus: Wish.Status,
        executorId: Int?,
        wishComment: WishComment
    ): Wish {
        TODO("Not yet implemented")
    }
}

