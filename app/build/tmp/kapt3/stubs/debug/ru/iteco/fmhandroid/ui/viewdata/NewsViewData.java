package ru.iteco.fmhandroid.ui.viewdata;

import java.lang.System;

/**
 * Модель представления новости в списке
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\fH\u00c6\u0003J\t\u0010(\u001a\u00020\fH\u00c6\u0003J\t\u0010)\u001a\u00020\u000fH\u00c6\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010+\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\t\u0010.\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001cR\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019\u00a8\u0006/"}, d2 = {"Lru/iteco/fmhandroid/ui/viewdata/NewsViewData;", "", "id", "", "category", "Lru/iteco/fmhandroid/dto/News$Category;", "title", "", "description", "creatorId", "creatorName", "createDate", "", "publishDate", "publishEnabled", "", "isOpen", "(ILru/iteco/fmhandroid/dto/News$Category;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JJZZ)V", "getCategory", "()Lru/iteco/fmhandroid/dto/News$Category;", "getCreateDate", "()J", "getCreatorId", "()I", "getCreatorName", "()Ljava/lang/String;", "getDescription", "getId", "()Z", "getPublishDate", "getPublishEnabled", "getTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class NewsViewData {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final ru.iteco.fmhandroid.dto.News.Category category = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private final int creatorId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String creatorName = null;
    private final long createDate = 0L;
    private final long publishDate = 0L;
    private final boolean publishEnabled = false;
    private final boolean isOpen = false;
    
    /**
     * Модель представления новости в списке
     */
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.ui.viewdata.NewsViewData copy(int id, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News.Category category, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int creatorId, @org.jetbrains.annotations.NotNull()
    java.lang.String creatorName, long createDate, long publishDate, boolean publishEnabled, boolean isOpen) {
        return null;
    }
    
    /**
     * Модель представления новости в списке
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Модель представления новости в списке
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Модель представления новости в списке
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NewsViewData(int id, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News.Category category, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int creatorId, @org.jetbrains.annotations.NotNull()
    java.lang.String creatorName, long createDate, long publishDate, boolean publishEnabled, boolean isOpen) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.News.Category component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.News.Category getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getCreatorId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatorName() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long getCreateDate() {
        return 0L;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long getPublishDate() {
        return 0L;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getPublishEnabled() {
        return false;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean isOpen() {
        return false;
    }
}