package ru.iteco.fmh.model


data class News(
    val id: Int? = null,
    val newsCategoryId: Int,
    val title: String = "",
    val description: String = "",
    val creatorId: Int = 1,
    val creatorName: String,
    val createDate: Long,
    val publishDate: Long,
    val publishEnabled: Boolean = false,
    val isOpen: Boolean = false
) {

    data class Category(
        val id: Int,
        val name: String,
        val deleted: Boolean
    ) {

        enum class Type {
            Advertisement, Salary, Union, Birthday, Holiday, Massage, Gratitude, Help, Unknown
        }
    }

    data class WithCategory(
        val newsItem: News,
        val category: Category
    )
}

