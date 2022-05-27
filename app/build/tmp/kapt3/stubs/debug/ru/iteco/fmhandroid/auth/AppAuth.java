package ru.iteco.fmhandroid.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R/\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lru/iteco/fmhandroid/auth/AppAuth;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accessTokenKey", "", "<set-?>", "Lru/iteco/fmhandroid/dto/AuthState;", "authState", "getAuthState", "()Lru/iteco/fmhandroid/dto/AuthState;", "setAuthState", "(Lru/iteco/fmhandroid/dto/AuthState;)V", "authState$delegate", "Lkotlin/properties/ReadWriteProperty;", "prefs", "Landroid/content/SharedPreferences;", "refreshTokenKey", "createInitialAuthState", "app_debug"})
@javax.inject.Singleton()
public final class AppAuth {
    private final android.content.Context context = null;
    private final android.content.SharedPreferences prefs = null;
    private final java.lang.String accessTokenKey = "access";
    private final java.lang.String refreshTokenKey = "refresh";
    
    /**
     * Набор токенов. `null` если пользователь не авторизован
     */
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty authState$delegate = null;
    
    @javax.inject.Inject()
    public AppAuth(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    /**
     * Набор токенов. `null` если пользователь не авторизован
     */
    @org.jetbrains.annotations.Nullable()
    public final ru.iteco.fmhandroid.dto.AuthState getAuthState() {
        return null;
    }
    
    /**
     * Набор токенов. `null` если пользователь не авторизован
     */
    public final void setAuthState(@org.jetbrains.annotations.Nullable()
    ru.iteco.fmhandroid.dto.AuthState p0) {
    }
    
    private final ru.iteco.fmhandroid.dto.AuthState createInitialAuthState() {
        return null;
    }
}