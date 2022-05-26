package ru.iteco.fmhandroid.repository.authRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lru/iteco/fmhandroid/repository/authRepository/AuthRepositoryImpl;", "Lru/iteco/fmhandroid/repository/authRepository/AuthRepository;", "authApi", "Lru/iteco/fmhandroid/api/AuthApi;", "refreshTokensApi", "Lru/iteco/fmhandroid/api/RefreshTokensApi;", "appAuth", "Lru/iteco/fmhandroid/auth/AppAuth;", "(Lru/iteco/fmhandroid/api/AuthApi;Lru/iteco/fmhandroid/api/RefreshTokensApi;Lru/iteco/fmhandroid/auth/AppAuth;)V", "login", "", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTokens", "Lru/iteco/fmhandroid/dto/AuthState;", "refreshToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class AuthRepositoryImpl implements ru.iteco.fmhandroid.repository.authRepository.AuthRepository {
    private final ru.iteco.fmhandroid.api.AuthApi authApi = null;
    private final ru.iteco.fmhandroid.api.RefreshTokensApi refreshTokensApi = null;
    private final ru.iteco.fmhandroid.auth.AppAuth appAuth = null;
    
    @javax.inject.Inject()
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.api.AuthApi authApi, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.api.RefreshTokensApi refreshTokensApi, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.auth.AppAuth appAuth) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateTokens(@org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.iteco.fmhandroid.dto.AuthState> continuation) {
        return null;
    }
}