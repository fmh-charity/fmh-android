package ru.iteco.fmh.data.impl.converter

import ru.iteco.fmh.data.api.dto.NewsDto
import ru.iteco.fmh.data.db.entity.NewsEntity
import ru.iteco.fmh.model.News

internal fun List<News>.toEntity(): List<NewsEntity> = map(News::toEntity)
internal fun News.toEntity() = NewsEntity(
    id = id,
    newsCategoryId = newsCategoryId,
    title = title,
    description = description,
    creatorId = creatorId,
    creatorName = creatorName,
    createDate = createDate,
    publishDate = publishDate,
    publishEnabled = publishEnabled,
    isOpen = isOpen,
)

internal fun NewsDto.toEntity() = NewsEntity(
    id = id,
    newsCategoryId = newsCategoryId,
    title = title,
    description = description,
    creatorId = creatorId,
    creatorName = creatorName,
    createDate = createDate,
    publishDate = publishDate,
    publishEnabled = publishEnabled,
    isOpen = isOpen,
)

internal fun NewsEntity.toModel() = News(
    id = id,
    newsCategoryId = newsCategoryId,
    title = title,
    description = description,
    creatorId = creatorId,
    creatorName = creatorName,
    createDate = createDate,
    publishDate = publishDate,
    publishEnabled = publishEnabled,
    isOpen = isOpen,
)
internal fun List<NewsEntity.WithCategory>.toModel() = map { it.toModel() }

internal fun NewsEntity.WithCategory.toModel() = News.WithCategory(
    newsItem = newsItem.toModel(),
    category = category.toModel()
)


internal fun NewsDto.toModel() = News(
    id = id,
    newsCategoryId = newsCategoryId,
    title = title,
    description = description,
    creatorId = creatorId,
    creatorName = creatorName,
    createDate = createDate,
    publishDate = publishDate,
    publishEnabled = publishEnabled,
    isOpen = isOpen,
)

internal fun News.toDto() = NewsDto(
    id = id,
    newsCategoryId = newsCategoryId,
    title = title,
    description = description,
    creatorId = creatorId,
    creatorName = creatorName,
    createDate = createDate,
    publishDate = publishDate,
    publishEnabled = publishEnabled,
    isOpen = isOpen,
)

