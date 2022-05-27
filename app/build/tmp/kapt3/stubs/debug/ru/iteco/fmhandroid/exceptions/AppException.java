package ru.iteco.fmhandroid.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0001\tB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lru/iteco/fmhandroid/exceptions/AppException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "code", "", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "Companion", "Lru/iteco/fmhandroid/exceptions/ApiException;", "Lru/iteco/fmhandroid/exceptions/AuthorizationException;", "Lru/iteco/fmhandroid/exceptions/ServerException;", "Lru/iteco/fmhandroid/exceptions/DbException;", "Lru/iteco/fmhandroid/exceptions/LostConnectException;", "Lru/iteco/fmhandroid/exceptions/UnknownException;", "app_debug"})
public abstract class AppException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String code;
    @org.jetbrains.annotations.NotNull()
    public static final ru.iteco.fmhandroid.exceptions.AppException.Companion Companion = null;
    
    private AppException(java.lang.String code) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/iteco/fmhandroid/exceptions/AppException$Companion;", "", "()V", "from", "Lru/iteco/fmhandroid/exceptions/AppException;", "e", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.iteco.fmhandroid.exceptions.AppException from(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            return null;
        }
    }
}