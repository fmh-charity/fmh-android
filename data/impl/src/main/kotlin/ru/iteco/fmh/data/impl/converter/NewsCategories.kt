package ru.iteco.fmh.data.impl.converter

import ru.iteco.fmh.data.db.entity.NewsCategoryEntity
import ru.iteco.fmh.model.News

internal fun News.Category.toEntity() = NewsCategoryEntity(
    id = id,
    name = name,
    deleted = deleted,
)

internal fun List<News.Category>.toEntity(): List<NewsCategoryEntity> =
    map(News.Category::toEntity)

internal fun NewsCategoryEntity.toModel() = News.Category(
    id = id,
    name = name,
    deleted = deleted,
)

internal fun List<NewsCategoryEntity>.toModel(): List<News.Category> =
    map(NewsCategoryEntity::toModel)
