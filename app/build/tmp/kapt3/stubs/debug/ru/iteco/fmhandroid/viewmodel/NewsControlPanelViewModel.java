package ru.iteco.fmhandroid.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001>B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*J\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u000f0\u000eJ\u0011\u0010-\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*J3\u00100\u001a\u00020\u00172\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u000107\u00a2\u0006\u0002\u00108J\u0006\u00109\u001a\u00020\u0017J\u0006\u0010:\u001a\u00020\u0017J\u000e\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u000202J\u000e\u0010=\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006?"}, d2 = {"Lru/iteco/fmhandroid/viewmodel/NewsControlPanelViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lru/iteco/fmhandroid/repository/newsRepository/NewsRepository;", "userRepository", "Lru/iteco/fmhandroid/repository/userRepository/UserRepository;", "(Lru/iteco/fmhandroid/repository/newsRepository/NewsRepository;Lru/iteco/fmhandroid/repository/userRepository/UserRepository;)V", "clearFilter", "Lru/iteco/fmhandroid/viewmodel/NewsControlPanelViewModel$Filter;", "currentUser", "Lru/iteco/fmhandroid/dto/User;", "getCurrentUser", "()Lru/iteco/fmhandroid/dto/User;", "data", "Lkotlinx/coroutines/flow/Flow;", "", "Lru/iteco/fmhandroid/dto/NewsWithCategory;", "getData$annotations", "()V", "getData", "()Lkotlinx/coroutines/flow/Flow;", "editNewsItemExceptionEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getEditNewsItemExceptionEvent", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "editNewsItemSavedEvent", "getEditNewsItemSavedEvent", "filterFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "loadNewsExceptionEvent", "getLoadNewsExceptionEvent", "newsItemCreatedEvent", "getNewsItemCreatedEvent", "removeNewsItemExceptionEvent", "getRemoveNewsItemExceptionEvent", "saveNewsItemExceptionEvent", "getSaveNewsItemExceptionEvent", "sortDirection", "Lru/iteco/fmhandroid/viewmodel/NewsViewModel$SortDirection;", "edit", "newsItem", "Lru/iteco/fmhandroid/dto/News;", "getAllNewsCategories", "Lru/iteco/fmhandroid/dto/News$Category;", "internalOnRefresh", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCard", "onFilterNewsClicked", "newsCategoryId", "", "dateStart", "", "dateEnd", "status", "", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "onRefresh", "onSortDirectionButtonClicked", "remove", "id", "save", "Filter", "app_debug"})
public final class NewsControlPanelViewModel extends androidx.lifecycle.ViewModel {
    private final ru.iteco.fmhandroid.repository.newsRepository.NewsRepository newsRepository = null;
    private final ru.iteco.fmhandroid.repository.userRepository.UserRepository userRepository = null;
    private final ru.iteco.fmhandroid.viewmodel.NewsControlPanelViewModel.Filter clearFilter = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<ru.iteco.fmhandroid.viewmodel.NewsViewModel.SortDirection> sortDirection = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<ru.iteco.fmhandroid.viewmodel.NewsControlPanelViewModel.Filter> filterFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> loadNewsExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> newsItemCreatedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> saveNewsItemExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> editNewsItemSavedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> editNewsItemExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> removeNewsItemExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.NewsWithCategory>> data = null;
    
    @javax.inject.Inject()
    public NewsControlPanelViewModel(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.repository.newsRepository.NewsRepository newsRepository, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.repository.userRepository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.User getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getLoadNewsExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getNewsItemCreatedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getSaveNewsItemExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getEditNewsItemSavedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getEditNewsItemExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getRemoveNewsItemExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.NewsWithCategory>> getData() {
        return null;
    }
    
    @kotlinx.coroutines.FlowPreview()
    @java.lang.Deprecated()
    public static void getData$annotations() {
    }
    
    public final void onRefresh() {
    }
    
    private final java.lang.Object internalOnRefresh(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void onSortDirectionButtonClicked() {
    }
    
    public final void onFilterNewsClicked(@org.jetbrains.annotations.Nullable()
    java.lang.Integer newsCategoryId, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateStart, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateEnd, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean status) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News newsItem) {
    }
    
    public final void edit(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News newsItem) {
    }
    
    public final void remove(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.News.Category>> getAllNewsCategories() {
        return null;
    }
    
    public final void onCard(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.News newsItem) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Lru/iteco/fmhandroid/viewmodel/NewsControlPanelViewModel$Filter;", "", "newsCategoryId", "", "dateStart", "", "dateEnd", "status", "", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getDateEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDateStart", "getNewsCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "app_debug"})
    static final class Filter {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer newsCategoryId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long dateStart = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long dateEnd = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean status = null;
        
        public Filter(@org.jetbrains.annotations.Nullable()
        java.lang.Integer newsCategoryId, @org.jetbrains.annotations.Nullable()
        java.lang.Long dateStart, @org.jetbrains.annotations.Nullable()
        java.lang.Long dateEnd, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean status) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getNewsCategoryId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getDateStart() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getDateEnd() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getStatus() {
            return null;
        }
    }
}