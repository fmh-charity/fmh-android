package ru.iteco.fmhandroid.repository.wishRepository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import org.w3c.dom.Comment
import ru.iteco.fmhandroid.dto.*

interface WishRepository {

    suspend fun getAllWish(): List<Wish>
    suspend fun createNewWish(wish: Wish): Wish
    suspend fun refreshWish()
    fun getWishById(id: Int): Flow<FullWish>
    suspend fun getAllCommentForWish(id: Int): List<WishComment>
    suspend fun createCommentForWish(wishId: Int, comment: WishComment): WishComment
    suspend fun processingWishForStatusModel(id: Int, executorId: Int, status: Wish.Status)
    suspend fun updateInfoCommentForWish(wishId: Int, comment: WishComment): WishComment
    suspend fun getFullInfoCommentForWish(id: Int): WishComment




    suspend fun getAllWishWithOpenAndInProgressStatus(): List<Wish>
    fun getWishByStatus(
        coroutineScope: CoroutineScope,
        listStatuses: List<Wish.Status>
    ): Flow<List<FullWish>>

    suspend fun changeWishStatus(
        wishId: Int,
        newStatus: Wish.Status,
        executorId: Int?,
        wishComment: WishComment
    ): Wish
}