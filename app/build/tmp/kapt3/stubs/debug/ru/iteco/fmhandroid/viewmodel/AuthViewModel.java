package ru.iteco.fmhandroid.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001c\u001a\u00020\u000bJ\u0011\u0010\u001d\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u000bJ\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lru/iteco/fmhandroid/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lru/iteco/fmhandroid/repository/userRepository/UserRepository;", "authRepository", "Lru/iteco/fmhandroid/repository/authRepository/AuthRepository;", "appAuth", "Lru/iteco/fmhandroid/auth/AppAuth;", "(Lru/iteco/fmhandroid/repository/userRepository/UserRepository;Lru/iteco/fmhandroid/repository/authRepository/AuthRepository;Lru/iteco/fmhandroid/auth/AppAuth;)V", "authorizationFailedExceptionEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getAuthorizationFailedExceptionEvent", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "authorizedEvent", "getAuthorizedEvent", "getUserListExceptionEvent", "getGetUserListExceptionEvent", "loginEvent", "getLoginEvent", "loginExceptionEvent", "getLoginExceptionEvent", "lostConnectionExceptionEvent", "getLostConnectionExceptionEvent", "nonAuthorizedEvent", "getNonAuthorizedEvent", "userListLoadedEvent", "getUserListLoadedEvent", "authorization", "loadUserList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "login", "", "password", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final ru.iteco.fmhandroid.repository.userRepository.UserRepository userRepository = null;
    private final ru.iteco.fmhandroid.repository.authRepository.AuthRepository authRepository = null;
    private final ru.iteco.fmhandroid.auth.AppAuth appAuth = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> nonAuthorizedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> authorizedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> loginExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> loginEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getUserListExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> userListLoadedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> authorizationFailedExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> lostConnectionExceptionEvent = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.repository.userRepository.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.repository.authRepository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.auth.AppAuth appAuth) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getNonAuthorizedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getAuthorizedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getLoginExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getLoginEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getGetUserListExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getUserListLoadedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getAuthorizationFailedExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getLostConnectionExceptionEvent() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void authorization() {
    }
    
    public final void logOut() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadUserList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}