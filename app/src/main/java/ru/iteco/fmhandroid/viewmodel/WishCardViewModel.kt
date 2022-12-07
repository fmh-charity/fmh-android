package ru.iteco.fmhandroid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.adapter.OnWishCommentItemClickListener
import ru.iteco.fmhandroid.dto.*
import ru.iteco.fmhandroid.repository.userRepository.UserRepository
import ru.iteco.fmhandroid.repository.wishRepository.WishRepository
import javax.inject.Inject
import kotlin.properties.Delegates

@HiltViewModel
class WishCardViewModel @Inject constructor(
    private val wishRepository: WishRepository,
    private val userRepository: UserRepository
) : ViewModel(), OnWishCommentItemClickListener {

    private var wishId by Delegates.notNull<Int>()

    val dataFullWish: Flow<FullWish> by lazy {
        wishRepository.getWishById(wishId)
    }

    val currentUser: User
        get() = userRepository.currentUser

    val userList: List<User>
        get() = userRepository.userList

    /** -----------------------------------------------------------------------------------------**/
    /** -для OpenWishFragment **/
    val openWishCommentEvent = MutableSharedFlow<WishComment>()
    /** -для изменения статуса в fun changeWishStatus  **/
    private val wishStatusChangedEvent = MutableSharedFlow<Unit>()
    /** -ошибка изменения статуса в fun changeWishStatus и для OpenWishFragment **/
    val wishStatusChangeExceptionEvent = MutableSharedFlow<Unit>()
    /** -ошибка изменения статуса в fun changeWishStatus и для OpenWishFragment **/
    val wishUpdateExceptionEvent = MutableSharedFlow<Unit>()
    /** -обновление просьбы для fun updateWish и СreateEditWishFragment**/
    val wishUpdatedEvent = MutableSharedFlow<Unit>()
    /** создание просьбы  для fun save и CreateEditWishFragment**/
    val wishCreatedEvent = MutableSharedFlow<Unit>()
    /** ошибка создания просьбы для fun save и CreateEditWishFragment **/
    val createWishExceptionEvent = MutableSharedFlow<Unit>()
    /**  создание коммента к просьбе для fun createWishComment и CreateEditWishCommentFragment  **/
    val wishCommentCreatedEvent = MutableSharedFlow<Unit>()
    /**  обновление коммента к просьбе если потребуется тут и CreateEditWishCommentFragment  **/
    val wishCommentUpdatedEvent = MutableSharedFlow<Unit>()
    /** ошибка создания коммента для fun createWishComment и CreateEditWishCommentFragment **/
    val wishCommentCreateExceptionEvent = MutableSharedFlow<Unit>()
    /** ошибка обновления комента для функции тут и CreateEditWishCommentFragment**/
    val updateWishCommentExceptionEvent = MutableSharedFlow<Unit>()

    val statusesFlow = MutableStateFlow(
        listOf(
            Wish.Status.OPEN,
            Wish.Status.AT_WORK,
            Wish.Status.CLOSED,
            Wish.Status.EXECUTED
        )
    )
    @ExperimentalCoroutinesApi
    val data: Flow<List<FullWish>> = statusesFlow.flatMapLatest { statuses ->
        wishRepository.getWishByStatus(
            viewModelScope,
            statuses
        )
    }

    /** ------------создание просьбы---------------------------------------------------------- **/
    fun save(wish: Wish) {
        viewModelScope.launch {
            try {
                wishRepository.createNewWish(wish)
                wishCreatedEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                createWishExceptionEvent.emit(Unit)
            }
        }
    }

    /** ------------обновление просьбы---------------------------------------------------------- **/
    fun updateWish(updatedWish: Wish) {
        viewModelScope.launch {
            try {
                wishRepository.createNewWish(updatedWish)
                wishUpdatedEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                //todo
            }
        }
    }

    /** ------------создание комментария к просьбе---------------------------------------------- **/
    fun createWishComment(wishComment: WishComment) {
        viewModelScope.launch {
            try {
                wishRepository.createCommentForWish(wishComment.wishId, wishComment)
                wishCommentCreatedEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                wishCommentCreateExceptionEvent.emit(Unit)
            }
        }
    }

    /** ------------изменение статуса к просьбе------------------------------------------------- **/
    fun changeWishStatus(
        wishId: Int,
        newWishStatus: Wish.Status,
        executorId: Int?,
        wishComment: WishComment
    ) {
        viewModelScope.launch {
            try {
                wishRepository.changeWishStatus(
                    wishId,
                    newWishStatus,
                    executorId,
                    wishComment
                )
                wishStatusChangedEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                wishStatusChangeExceptionEvent.emit(Unit)
            }
        }
    }

    fun init(wishId: Int) {
        this.wishId = wishId
    }

    override fun onCard(wishComment: WishComment) {
        viewModelScope.launch {
            openWishCommentEvent.emit(wishComment)
        }
    }
}
