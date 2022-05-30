package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import ru.iteco.fmh.model.News

@Parcelize
class NewsWithCategoryNavArg private constructor(
    private val newsNavArg: NewsNavArg,
    private val categoryNavArg: NewsCategoryNavArg
) : Parcelable {

    val news get() = newsNavArg.news
    val category get() = categoryNavArg.category

    constructor(newsWithCategory: News.WithCategory) : this(
        newsNavArg = NewsNavArg(newsWithCategory.newsItem),
        categoryNavArg = NewsCategoryNavArg(newsWithCategory.category)
    )
}