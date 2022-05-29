package ru.iteco.fmh.viewmodel.ourMission


/**
 * Модель представления элемента раздела "Наша миссия" в списке
 */
data class OurMissionItemViewData(
    val id: Int,
    val title: String,
    val titleBackgroundColor: Int,
    val description: String,
    val isOpen: Boolean
)