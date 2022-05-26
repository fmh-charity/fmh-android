package ru.iteco.fmhandroid.api;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lru/iteco/fmhandroid/api/AuthApiModule;", "", "()V", "provideAuthApi", "Lru/iteco/fmhandroid/api/AuthApi;", "retrofit", "Lretrofit2/Retrofit;", "app_debug"})
@dagger.Module(includes = {ru.iteco.fmhandroid.api.NetworkModule.class})
public final class AuthApiModule {
    @org.jetbrains.annotations.NotNull()
    public static final ru.iteco.fmhandroid.api.AuthApiModule INSTANCE = null;
    
    private AuthApiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.iteco.fmhandroid.api.AuthApi provideAuthApi(@org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.NonAuthorized()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}