package ru.iteco.fmhandroid.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lru/iteco/fmhandroid/api/RefreshTokensApi;", "", "refreshTokens", "Lretrofit2/Response;", "Lru/iteco/fmhandroid/dto/AuthState;", "refreshToken", "", "refreshRequest", "Lru/iteco/fmhandroid/dto/RefreshRequest;", "(Ljava/lang/String;Lru/iteco/fmhandroid/dto/RefreshRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RefreshTokensApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "authentication/refresh")
    public abstract java.lang.Object refreshTokens(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ru.iteco.fmhandroid.dto.RefreshRequest refreshRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.iteco.fmhandroid.dto.AuthState>> continuation);
}