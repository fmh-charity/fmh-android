package ru.iteco.fmhandroid.repository.userRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\n@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lru/iteco/fmhandroid/repository/userRepository/UserRepositoryImpl;", "Lru/iteco/fmhandroid/repository/userRepository/UserRepository;", "userApi", "Lru/iteco/fmhandroid/api/UserApi;", "(Lru/iteco/fmhandroid/api/UserApi;)V", "<set-?>", "Lru/iteco/fmhandroid/dto/User;", "currentUser", "getCurrentUser", "()Lru/iteco/fmhandroid/dto/User;", "", "userList", "getUserList", "()Ljava/util/List;", "getAllUsers", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfo", "", "userLogOut", "app_debug"})
@javax.inject.Singleton()
public final class UserRepositoryImpl implements ru.iteco.fmhandroid.repository.userRepository.UserRepository {
    private final ru.iteco.fmhandroid.api.UserApi userApi = null;
    @org.jetbrains.annotations.NotNull()
    private ru.iteco.fmhandroid.dto.User currentUser;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<ru.iteco.fmhandroid.dto.User> userList;
    
    @javax.inject.Inject()
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.api.UserApi userApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.iteco.fmhandroid.dto.User getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ru.iteco.fmhandroid.dto.User> getUserList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.iteco.fmhandroid.dto.User>> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void userLogOut() {
    }
}