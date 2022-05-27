package ru.iteco.fmhandroid.dto;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lru/iteco/fmhandroid/dto/FullClaim;", "Landroid/os/Parcelable;", "claim", "Lru/iteco/fmhandroid/dto/Claim;", "comments", "", "Lru/iteco/fmhandroid/dto/ClaimComment;", "(Lru/iteco/fmhandroid/dto/Claim;Ljava/util/List;)V", "getClaim", "()Lru/iteco/fmhandroid/dto/Claim;", "getComments", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class FullClaim implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final ru.iteco.fmhandroid.dto.Claim claim = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Relation(entity = ru.iteco.fmhandroid.entity.ClaimCommentEntity.class, parentColumn = "id", entityColumn = "claimId")
    private final java.util.List<ru.iteco.fmhandroid.dto.ClaimComment> comments = null;
    public static final android.os.Parcelable.Creator<ru.iteco.fmhandroid.dto.FullClaim> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.FullClaim copy(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim claim, @org.jetbrains.annotations.Nullable()
    java.util.List<ru.iteco.fmhandroid.dto.ClaimComment> comments) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FullClaim(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim claim, @org.jetbrains.annotations.Nullable()
    java.util.List<ru.iteco.fmhandroid.dto.ClaimComment> comments) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.Claim component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.Claim getClaim() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ru.iteco.fmhandroid.dto.ClaimComment> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ru.iteco.fmhandroid.dto.ClaimComment> getComments() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<ru.iteco.fmhandroid.dto.FullClaim> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final ru.iteco.fmhandroid.dto.FullClaim createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final ru.iteco.fmhandroid.dto.FullClaim[] newArray(int size) {
            return null;
        }
    }
}