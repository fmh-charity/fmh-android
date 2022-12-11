package ru.iteco.fmhandroid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.adapter.OnClaimItemClickListener
import ru.iteco.fmhandroid.dto.Claim
import ru.iteco.fmhandroid.dto.FullClaim
import ru.iteco.fmhandroid.repository.claimRepository.ClaimRepository
import javax.inject.Inject

@HiltViewModel
class ClaimViewModel @Inject constructor(
    private val claimRepository: ClaimRepository
) : ViewModel(), OnClaimItemClickListener {

    val claimListUpdatedEvent = MutableSharedFlow<Unit>()
    val claimsLoadException = MutableSharedFlow<Unit>()
    private val claimCommentsLoadedEvent = MutableSharedFlow<Unit>()
    val claimCommentsLoadExceptionEvent = MutableSharedFlow<Unit>()
    val openClaimEvent = MutableSharedFlow<FullClaim>()

    val statusesFlow = MutableStateFlow(
        listOf(
            Claim.Status.OPEN,
            Claim.Status.IN_PROGRESS
        )
    )

    @ExperimentalCoroutinesApi
    val data: Flow<PagingData<Claim>> = statusesFlow.flatMapLatest { statuses ->
        claimRepository.getClaimsByStatus(
            viewModelScope,
            statuses
        )
    }

    fun onFilterClaimsMenuItemClicked(statuses: List<Claim.Status>) {
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
            claimRepository.refreshClaims()
            claimListUpdatedEvent.emit(Unit)
        } catch (e: Exception) {
            e.printStackTrace()
            claimsLoadException.emit(Unit)
        }
    }

    override fun onCard(claim: Claim) {
        viewModelScope.launch {
            try {
                claim.id?.let { claimRepository.getAllCommentsForClaim(it) }
                claimCommentsLoadedEvent.emit(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                claimCommentsLoadExceptionEvent.emit(Unit)
            }
            val fullClaim = claim.id?.let { claimRepository.getClaimById(it) }


            openClaimEvent.emit(fullClaim.collect())
        }
    }
}
