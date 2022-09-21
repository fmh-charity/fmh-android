package ru.iteco.fmh.viewmodel.ourMission

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.*
import ru.iteco.fmh.viewmodel.R

class OurMissionViewModel : ViewModel(), OnOurMissionItemClickListener {

    private val _data = MutableStateFlow(
        List(MISSIONS_AMOUNT) { index ->
            OurMissionItemViewData(
                index = index,
                isOpen = false
            )
        }
    )
    val data: Flow<List<OurMissionItemViewData>> get() = _data

    override fun onCard(ourMissionItem: OurMissionItemViewData) {
        _data.value = _data.value.map {
            if (ourMissionItem.index == it.index) it.copy(isOpen = !it.isOpen) else it
        }
    }

    private companion object {
        private const val MISSIONS_AMOUNT = 8
    }
}