package ru.iteco.fmh.viewmodel.news

import ru.iteco.fmh.viewmodel.news.NewsViewData

interface OnNewsItemClickListener {
    fun onCard(newsItem: NewsViewData)
}