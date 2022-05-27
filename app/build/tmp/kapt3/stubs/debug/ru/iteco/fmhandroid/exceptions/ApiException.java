package ru.iteco.fmhandroid.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lru/iteco/fmhandroid/exceptions/ApiException;", "Lru/iteco/fmhandroid/exceptions/AppException;", "statusCode", "", "code", "", "(ILjava/lang/String;)V", "getStatusCode", "()I", "app_debug"})
public final class ApiException extends ru.iteco.fmhandroid.exceptions.AppException {
    private final int statusCode = 0;
    
    public ApiException(int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        super(null);
    }
    
    public final int getStatusCode() {
        return 0;
    }
}