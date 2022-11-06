package ru.iteco.fmhandroid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.adapter.OnWishCommentItemClickListener
import ru.iteco.fmhandroid.dto.*
import ru.iteco.fmhandroid.repository.userRepository.UserRepository
import ru.iteco.fmhandroid.repository.wishRepository.WishRepository
import javax.inject.Inject
import kotlin.properties.Delegates

class WishCardViewModel  @Inject constructor(
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

    val openWishCommentEvent = MutableSharedFlow<WishComment>()
    private val wishStatusChangedEvent = MutableSharedFlow<Unit>()
    val wishStatusChangeExceptionEvent = MutableSharedFlow<Unit>()
    val wishUpdateExceptionEvent = MutableSharedFlow<Unit>()
    val wishUpdatedEvent = MutableSharedFlow<Unit>()
    val wishCreatedEvent = MutableSharedFlow<Unit>()
    val createWishExceptionEvent = MutableSharedFlow<Unit>()
    val wishCommentCreatedEvent = MutableSharedFlow<Unit>()
    val wishCommentUpdatedEvent = MutableSharedFlow<Unit>()
    val wishCommentCreateExceptionEvent = MutableSharedFlow<Unit>()
    val updateWishCommentExceptionEvent = MutableSharedFlow<Unit>()

    fun createWishComment(wishComment: WishComment) {
        viewModelScope.launch {
            try {
                wishRepository.saveWishComment(wishComment.wishId, wishComment)
                wishCommentCreatedEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                wishCommentCreateExceptionEvent.emit(Unit)
            }
        }
    }


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

    fun init(claimId: Int) {
        this.wishId = wishId
    }

    override fun onCard(wishComment: WishComment) {
        viewModelScope.launch {
            openWishCommentEvent.emit(wishComment)
        }
    }
    }
