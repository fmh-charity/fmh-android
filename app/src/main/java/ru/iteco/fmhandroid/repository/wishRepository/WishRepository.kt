package ru.iteco.fmhandroid.repository.wishRepository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import org.w3c.dom.Comment
import ru.iteco.fmhandroid.dto.ClaimComment
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.dto.Wish
import ru.iteco.fmhandroid.dto.WishComment
import ru.iteco.fmhandroid.entity.WishEntity

interface WishRepository {

    fun getAllWish()
    suspend fun createNewWish(wish: Wish): Wish
    suspend fun refreshWish()
    fun getWishById(id: Int): Flow<WishEntity>
    suspend fun getAllCommentForWish(id: Int): List<WishComment>
    suspend fun saveWishComment(wishId: Int, comment: WishComment): WishComment
    suspend fun processingWishForStatusModel()
    suspend fun updateInfoForComment(comment: Comment): Comment
    suspend fun getFullInfoCommentForWish(id: Int): Comment
    suspend fun getAllWishWithOpenAndInProgressStatus(): List<Wish>
    fun getWishByStatus(
        coroutineScope: CoroutineScope,
        listStatuses: List<Wish.Status>
    ): Flow<List<Wish>>

    suspend fun changeWishStatus(
        wishId: Int,
        newStatus: Wish.Status,
        executorId: Int?,
        wishComment: WishComment
    ): Wish
}