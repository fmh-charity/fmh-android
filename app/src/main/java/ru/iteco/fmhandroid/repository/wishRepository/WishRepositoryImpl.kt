package ru.iteco.fmhandroid.repository.wishRepository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import org.w3c.dom.Comment
import ru.iteco.fmhandroid.api.WishApi
import ru.iteco.fmhandroid.dao.WishCommentDao
import ru.iteco.fmhandroid.dao.WishDao
import ru.iteco.fmhandroid.dto.FullWish
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

) : WishRepository {

    /** ------------реестр всех просьб----------------------------------------------------- **/
    override suspend fun getAllWish() = makeRequest(
            request = { wishApi.getAllWishes() },
            onSuccess = { body ->
                body.also {
                    wishDao.getAllWishes()
                }
            }
        )

    /** ------------создание новой просьбы------------------------------------------------------ **/
    override suspend fun createNewWish(wish: Wish): Wish =  makeRequest(
    request = { wishApi.createWish(wish) },
    onSuccess = { body ->
        //wishDao.insertWish(body.toEntity())
        body
    }
    )

    /** ------------обновление информации о просьбе--------------------------------------------- **/
    override suspend fun refreshWish() = makeRequest(
            request = { wishApi.getAllWishes() },
            onSuccess = { body ->
                val apiId = body
                    .map { it.id }
                val databaseId = wishDao.getAllWishes()
                    .map { it.wish.id }
                    .toMutableList()
                databaseId.removeAll(apiId)
                wishDao.removeWishItemsByIdList(databaseId)
                wishDao.insertWish(body.toEntity())
            }
        )


    /** ------------возвращает полную информацию по просьбе ----------------------------------- **/
    override fun getWishById(id: Int) = wishDao.getWishById(id)

    /** ------------реестр всех комментариев просьбы --------------------------------------------------- **/
    override suspend fun getAllCommentForWish(id: Int): List<WishComment> = makeRequest(
        request = { wishApi.getAllWishComments(id) },
        onSuccess = { body ->
            wishCommentDao.insertComments(body.toEntity())
            body
        }
        )

    /** ------------Создание нового комментария ------------------------------------------ **/
    override suspend fun createCommentForWish(wishId: Int, comment: WishComment): WishComment =
        makeRequest(
            request = { wishApi.createCommentForWish(wishId, comment) },
            onSuccess = { body ->
                wishCommentDao.insertComment(body.toEntity())
                body
            }
        )

    /** ------------обработка просьб по статусной модели--------------------------------------- **/
    override suspend fun processingWishForStatusModel(
        id: Int,
        executorId: Int,
        status: Wish.Status
    ) {
        TODO("Not yet implemented")
    }

    /** ------------обновление информации по комментарию--------------------------------------- **/

    override suspend fun updateInfoCommentForWish(wishId: Int, comment: WishComment): WishComment =
        makeRequest(
            request = { wishApi.updateInfoCommentForWish(wishId, comment) },
            onSuccess = { body ->
                wishCommentDao.insertComment(body.toEntity())
                body
            }
        )

    /** ------------возвращает полную информацию по комментарию просьбы------------------------ **/
    override suspend fun getFullInfoCommentForWish(id: Int): WishComment {
        TODO("Not yet implemented")
    }

    /** ------------получение пациента c открытым статусом....---------------------------------- **/
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
    ): Flow<List<FullWish>> {
        TODO("Not yet implemented")
    }

    /** ------------получение статуса для пациента---------------------------------------------- **/
//    override fun getWishByStatus(
//        coroutineScope: CoroutineScope,
//        listStatuses: List<Wish.Status>
//    ) = wishDao.getWishByStatus(
//        listStatuses
//    ).flowOn(Dispatchers.Default)

    /** ------------изменение статуса для пациента---------------------------------------------- **/
    override suspend fun changeWishStatus(
        wishId: Int,
        newStatus: Wish.Status,
        executorId: Int?,
        wishComment: WishComment
    ): Wish {
        TODO("Not yet implemented")
    }
}

