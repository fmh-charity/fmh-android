package ru.iteco.fmhandroid.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lru/iteco/fmhandroid/adapter/NewsOnInteractionListener;", "", "onCard", "", "newsItem", "Lru/iteco/fmhandroid/dto/News;", "onEdit", "newItemWithCategory", "Lru/iteco/fmhandroid/dto/NewsWithCategory;", "onRemove", "app_debug"})
public abstract interface NewsOnInteractionListener {
    
    public abstract void onCard(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News newsItem);
    
    public abstract void onEdit(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.NewsWithCategory newItemWithCategory);
    
    public abstract void onRemove(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.NewsWithCategory newItemWithCategory);
}