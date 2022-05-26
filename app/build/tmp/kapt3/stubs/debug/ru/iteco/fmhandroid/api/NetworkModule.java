package ru.iteco.fmhandroid.api;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0004H\u0007J\u0012\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0004H\u0007J\u0012\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0004H\u0007J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u0014"}, d2 = {"Lru/iteco/fmhandroid/api/NetworkModule;", "", "()V", "authorizedOkhttp", "Lokhttp3/OkHttpClient;", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "appAuth", "Lru/iteco/fmhandroid/auth/AppAuth;", "authRepositoryProvider", "Ljavax/inject/Provider;", "Lru/iteco/fmhandroid/repository/authRepository/AuthRepository;", "loggingInterceptor", "nonAuthorizedOkhttp", "provideAuthorizedRetrofit", "Lretrofit2/Retrofit;", "client", "provideNonAuthorizedRetrofit", "provideRefreshRetrofit", "refreshOkhttp", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final ru.iteco.fmhandroid.api.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor loggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.NonAuthorized()
    @dagger.Provides()
    public final retrofit2.Retrofit provideNonAuthorizedRetrofit(@org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.NonAuthorized()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.Authorized()
    @dagger.Provides()
    public final retrofit2.Retrofit provideAuthorizedRetrofit(@org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.Authorized()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.Authorized()
    @dagger.Provides()
    public final okhttp3.OkHttpClient authorizedOkhttp(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor interceptor, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.auth.AppAuth appAuth, @org.jetbrains.annotations.NotNull()
    javax.inject.Provider<ru.iteco.fmhandroid.repository.authRepository.AuthRepository> authRepositoryProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.NonAuthorized()
    @dagger.Provides()
    public final okhttp3.OkHttpClient nonAuthorizedOkhttp(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor interceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.Refresh()
    @dagger.Provides()
    public final okhttp3.OkHttpClient refreshOkhttp(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor interceptor, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.auth.AppAuth appAuth) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.Refresh()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRefreshRetrofit(@org.jetbrains.annotations.NotNull()
    @ru.iteco.fmhandroid.api.qualifier.Refresh()
    okhttp3.OkHttpClient client) {
        return null;
    }
}