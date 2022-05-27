package ru.iteco.fmhandroid.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lru/iteco/fmhandroid/adapter/OnClaimItemClickListener;", "", "onCard", "", "fullClaim", "Lru/iteco/fmhandroid/dto/FullClaim;", "app_debug"})
public abstract interface OnClaimItemClickListener {
    
    public abstract void onCard(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.FullClaim fullClaim);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void onCard(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.adapter.OnClaimItemClickListener $this, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.FullClaim fullClaim) {
        }
    }
}