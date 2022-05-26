package ru.iteco.fmhandroid.repository.newsRepository;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lru/iteco/fmhandroid/repository/newsRepository/NewsRepositoryModule;", "", "()V", "bindNewsRepository", "Lru/iteco/fmhandroid/repository/newsRepository/NewsRepository;", "impl", "Lru/iteco/fmhandroid/repository/newsRepository/NewsRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract class NewsRepositoryModule {
    
    public NewsRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract ru.iteco.fmhandroid.repository.newsRepository.NewsRepository bindNewsRepository(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.repository.newsRepository.NewsRepositoryImpl impl);
}