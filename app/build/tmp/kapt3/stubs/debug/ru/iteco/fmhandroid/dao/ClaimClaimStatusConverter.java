package ru.iteco.fmhandroid.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lru/iteco/fmhandroid/dao/ClaimClaimStatusConverter;", "", "()V", "fromClaimStatus", "", "status", "Lru/iteco/fmhandroid/dto/Claim$Status;", "toClaimStatus", "app_debug"})
public final class ClaimClaimStatusConverter {
    
    public ClaimClaimStatusConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final ru.iteco.fmhandroid.dto.Claim.Status toClaimStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromClaimStatus(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim.Status status) {
        return null;
    }
}