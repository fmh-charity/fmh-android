package ru.iteco.fmhandroid.repository.userRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lru/iteco/fmhandroid/repository/userRepository/UserRepository;", "", "currentUser", "Lru/iteco/fmhandroid/dto/User;", "getCurrentUser", "()Lru/iteco/fmhandroid/dto/User;", "userList", "", "getUserList", "()Ljava/util/List;", "getAllUsers", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfo", "", "userLogOut", "app_debug"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.iteco.fmhandroid.dto.User getCurrentUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ru.iteco.fmhandroid.dto.User> getUserList();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.iteco.fmhandroid.dto.User>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    public abstract void userLogOut();
}