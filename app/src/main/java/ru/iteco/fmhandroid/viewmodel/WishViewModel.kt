package ru.iteco.fmhandroid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.adapter.OnWishItemClickListener
import ru.iteco.fmhandroid.dto.FullWish
import ru.iteco.fmhandroid.dto.Wish
import ru.iteco.fmhandroid.repository.wishRepository.WishRepository
import javax.inject.Inject

class WishViewModel @Inject constructor(
    private val wishRepository: WishRepository
) : ViewModel(), OnWishItemClickListener {

    val wishListUpdatedEvent = MutableSharedFlow<Unit>()
    val wishLoadException = MutableSharedFlow<Unit>()
    private val wishCommentsLoadedEvent = MutableSharedFlow<Unit>()
    val wishCommentsLoadExceptionEvent = MutableSharedFlow<Unit>()
    val openWishEvent = MutableSharedFlow<FullWish>()

    val statusesFlow = MutableStateFlow(
        listOf(
            Wish.Status.OPEN,
            Wish.Status.AT_WORK,
            Wish.Status.CLOSED,
            Wish.Status.EXECUTED
        )
    )

    @ExperimentalCoroutinesApi
    val data: Flow<List<Wish>> = statusesFlow.flatMapLatest { statuses ->
        wishRepository.getWishByStatus(
            viewModelScope,
            statuses
        )
    }

    fun onFilterClaimsMenuItemClicked(statuses: List<Wish.Status>) {
        viewModelScope.launch {
            statusesFlow.emit(statuses)
        }
    }

    fun onRefresh() {
        viewModelScope.launch {
            internalOnRefresh()
        }
    }

    private suspend fun internalOnRefresh() {
        try {
            wishRepository.refreshWish()
            wishListUpdatedEvent.emit(Unit)
        } catch (e: Exception) {
            e.printStackTrace()
            wishLoadException.emit(Unit)
        }
    }

    override fun onCard(fullWish: FullWish) {
        viewModelScope.launch {
            try {
                fullWish.wish.id?.let { wishRepository.getAllCommentForWish(it) }
               wishCommentsLoadedEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                wishCommentsLoadExceptionEvent.emit(Unit)
            }
            openWishEvent.emit(fullWish)
        }
    }
}
