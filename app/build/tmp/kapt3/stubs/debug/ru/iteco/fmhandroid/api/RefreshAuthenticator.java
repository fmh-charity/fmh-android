package ru.iteco.fmhandroid.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lru/iteco/fmhandroid/api/RefreshAuthenticator;", "Lokhttp3/Authenticator;", "authRepositoryProvider", "Ljavax/inject/Provider;", "Lru/iteco/fmhandroid/repository/authRepository/AuthRepository;", "appAuth", "Lru/iteco/fmhandroid/auth/AppAuth;", "(Ljavax/inject/Provider;Lru/iteco/fmhandroid/auth/AppAuth;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "app_debug"})
public final class RefreshAuthenticator implements okhttp3.Authenticator {
    private final javax.inject.Provider<ru.iteco.fmhandroid.repository.authRepository.AuthRepository> authRepositoryProvider = null;
    private final ru.iteco.fmhandroid.auth.AppAuth appAuth = null;
    
    public RefreshAuthenticator(@org.jetbrains.annotations.NotNull()
    javax.inject.Provider<ru.iteco.fmhandroid.repository.authRepository.AuthRepository> authRepositoryProvider, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.auth.AppAuth appAuth) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable()
    okhttp3.Route route, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response) {
        return null;
    }
}