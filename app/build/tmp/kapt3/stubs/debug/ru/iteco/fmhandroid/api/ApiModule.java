package ru.iteco.fmhandroid.api;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lru/iteco/fmhandroid/api/ApiModule;", "", "()V", "provideClaimApi", "Lru/iteco/fmhandroid/api/ClaimApi;", "retrofit", "Lretrofit2/Retrofit;", "provideNewsApi", "Lru/iteco/fmhandroid/api/NewsApi;", "provideUserApi", "Lru/iteco/fmhandroid/api/UserApi;", "app_debug"})
@dagger.Module(includes = {ru.iteco.fmhandroid.api.NetworkModule.class})
public final class ApiModule {
    @org.jetbrains.annotations.NotNull()
    public static final ru.iteco.fmhandroid.api.ApiModule INSTANCE = null;
    
    private ApiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.iteco.fmhandroid.api.ClaimApi provideClaimApi(@org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.Authorized()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.iteco.fmhandroid.api.UserApi provideUserApi(@org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.Authorized()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.iteco.fmhandroid.api.NewsApi provideNewsApi(@org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.Authorized()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}