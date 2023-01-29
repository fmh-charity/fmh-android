package ru.iteco.fmhandroid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.adapter.OnWishItemClickListener
import ru.iteco.fmhandroid.dto.FullWish
import ru.iteco.fmhandroid.repository.wishRepository.WishRepository
import javax.inject.Inject

@HiltViewModel
class WishViewModel @Inject constructor(
    private val wishRepository: WishRepository
) : ViewModel(), OnWishItemClickListener {

    /** -обновление в MainFragment**/
    val wishListUpdatedEvent = MutableSharedFlow<Unit>()
    /** -ошибка загрузки просьб в MainFragment и в WishListFragment**/
    val wishesLoadException = MutableSharedFlow<Unit>()
    /** -загрузка комментариев для просьб для функции onCard с комментариями**/
    private val wishCommentsLoadedEvent = MutableSharedFlow<Unit>()
    /** -для функции onCard с комментариями и WishListFragment**/
    val wishCommentsLoadExceptionEvent = MutableSharedFlow<Unit>()
    /** -для функции onCard с комментариями и WishListFragment**/
    val openWishEvent = MutableSharedFlow<FullWish>()


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
            wishesLoadException.emit(Unit)
        }
    }

    override fun onCard(fullWish: FullWish) {
        viewModelScope.launch {
            try {
                fullWish.wish.id.let { wishRepository.getAllCommentForWish(it) }
               wishCommentsLoadedEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                wishCommentsLoadExceptionEvent.emit(Unit)
            }
            openWishEvent.emit(fullWish)
        }
    }
}
