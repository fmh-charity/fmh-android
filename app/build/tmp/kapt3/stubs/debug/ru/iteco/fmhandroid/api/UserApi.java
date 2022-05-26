package ru.iteco.fmhandroid.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lru/iteco/fmhandroid/api/UserApi;", "", "getAllUsers", "Lretrofit2/Response;", "", "Lru/iteco/fmhandroid/dto/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfo", "app_debug"})
public abstract interface UserApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getAllUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<ru.iteco.fmhandroid.dto.User>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "authentication/userInfo")
    public abstract java.lang.Object getUserInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.iteco.fmhandroid.dto.User>> continuation);
}