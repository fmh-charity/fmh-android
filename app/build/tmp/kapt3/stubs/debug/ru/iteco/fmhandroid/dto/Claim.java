package ru.iteco.fmhandroid.dto;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001BBm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010*\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\t\u0010+\u001a\u00020\u0010H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\fH\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\u0084\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0002\u00105J\t\u00106\u001a\u00020\u0003H\u00d6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u00d6\u0003J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001J\t\u0010<\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017\u00a8\u0006C"}, d2 = {"Lru/iteco/fmhandroid/dto/Claim;", "Landroid/os/Parcelable;", "id", "", "title", "", "description", "creatorId", "creatorName", "executorId", "executorName", "createDate", "", "planExecuteDate", "factExecuteDate", "status", "Lru/iteco/fmhandroid/dto/Claim$Status;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLjava/lang/Long;Lru/iteco/fmhandroid/dto/Claim$Status;)V", "getCreateDate", "()J", "getCreatorId", "()I", "getCreatorName", "()Ljava/lang/String;", "getDescription", "getExecutorId", "()Ljava/lang/Integer;", "setExecutorId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getExecutorName", "getFactExecuteDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getPlanExecuteDate", "getStatus", "()Lru/iteco/fmhandroid/dto/Claim$Status;", "setStatus", "(Lru/iteco/fmhandroid/dto/Claim$Status;)V", "getTitle", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLjava/lang/Long;Lru/iteco/fmhandroid/dto/Claim$Status;)Lru/iteco/fmhandroid/dto/Claim;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Status", "app_debug"})
public final class Claim implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private final int creatorId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String creatorName = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer executorId;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String executorName = null;
    private final long createDate = 0L;
    private final long planExecuteDate = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long factExecuteDate = null;
    @org.jetbrains.annotations.NotNull()
    private ru.iteco.fmhandroid.dto.Claim.Status status;
    public static final android.os.Parcelable.Creator<ru.iteco.fmhandroid.dto.Claim> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.Claim copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int creatorId, @org.jetbrains.annotations.NotNull()
    java.lang.String creatorName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer executorId, @org.jetbrains.annotations.Nullable()
    java.lang.String executorName, long createDate, long planExecuteDate, @org.jetbrains.annotations.Nullable()
    java.lang.Long factExecuteDate, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim.Status status) {
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
    
    public Claim(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int creatorId, @org.jetbrains.annotations.NotNull()
    java.lang.String creatorName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer executorId, @org.jetbrains.annotations.Nullable()
    java.lang.String executorName, long createDate, long planExecuteDate, @org.jetbrains.annotations.Nullable()
    java.lang.Long factExecuteDate, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim.Status status) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getCreatorId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatorName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExecutorId() {
        return null;
    }
    
    public final void setExecutorId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExecutorName() {
        return null;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long getCreateDate() {
        return 0L;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getPlanExecuteDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getFactExecuteDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.Claim.Status component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.Claim.Status getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim.Status p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<ru.iteco.fmhandroid.dto.Claim> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final ru.iteco.fmhandroid.dto.Claim createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final ru.iteco.fmhandroid.dto.Claim[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/iteco/fmhandroid/dto/Claim$Status;", "", "(Ljava/lang/String;I)V", "CANCELLED", "EXECUTED", "IN_PROGRESS", "OPEN", "app_debug"})
    public static enum Status {
        /*public static final*/ CANCELLED /* = new CANCELLED() */,
        /*public static final*/ EXECUTED /* = new EXECUTED() */,
        /*public static final*/ IN_PROGRESS /* = new IN_PROGRESS() */,
        /*public static final*/ OPEN /* = new OPEN() */;
        
        Status() {
        }
    }
}