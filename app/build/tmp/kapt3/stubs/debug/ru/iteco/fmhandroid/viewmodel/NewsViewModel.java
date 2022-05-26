package ru.iteco.fmhandroid.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u000289B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020\u001c2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u0010J\u0011\u0010-\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0011H\u0016J)\u00100\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u00010%2\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000103\u00a2\u0006\u0002\u00105J\u0006\u00106\u001a\u00020\u001cJ\u0006\u00107\u001a\u00020\u001cR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR-\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f8FX\u0087\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006:"}, d2 = {"Lru/iteco/fmhandroid/viewmodel/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lru/iteco/fmhandroid/adapter/OnNewsItemClickListener;", "newsRepository", "Lru/iteco/fmhandroid/repository/newsRepository/NewsRepository;", "userRepository", "Lru/iteco/fmhandroid/repository/userRepository/UserRepository;", "(Lru/iteco/fmhandroid/repository/newsRepository/NewsRepository;Lru/iteco/fmhandroid/repository/userRepository/UserRepository;)V", "clearFilter", "Lru/iteco/fmhandroid/viewmodel/NewsViewModel$Filter;", "currentUser", "Lru/iteco/fmhandroid/dto/User;", "getCurrentUser", "()Lru/iteco/fmhandroid/dto/User;", "data", "Lkotlinx/coroutines/flow/Flow;", "", "Lru/iteco/fmhandroid/ui/viewdata/NewsViewData;", "getData$annotations", "()V", "getData", "()Lkotlinx/coroutines/flow/Flow;", "data$delegate", "Lkotlin/Lazy;", "filterFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "loadNewsCategoriesExceptionEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getLoadNewsCategoriesExceptionEvent", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "loadNewsExceptionEvent", "getLoadNewsExceptionEvent", "newsListUpdatedEvent", "getNewsListUpdatedEvent", "openNewsIds", "", "", "sortDirection", "Lru/iteco/fmhandroid/viewmodel/NewsViewModel$SortDirection;", "getAllNewsCategories", "Lru/iteco/fmhandroid/dto/News$Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializationListNewsCategories", "listNewsCategories", "internalOnRefresh", "onCard", "newsItem", "onFilterNewsClicked", "newsCategoryId", "dateStart", "", "dateEnd", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "onRefresh", "onSortDirectionButtonClicked", "Filter", "SortDirection", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel implements ru.iteco.fmhandroid.adapter.OnNewsItemClickListener {
    private final ru.iteco.fmhandroid.repository.newsRepository.NewsRepository newsRepository = null;
    private final ru.iteco.fmhandroid.repository.userRepository.UserRepository userRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<ru.iteco.fmhandroid.viewmodel.NewsViewModel.SortDirection> sortDirection = null;
    private final ru.iteco.fmhandroid.viewmodel.NewsViewModel.Filter clearFilter = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<ru.iteco.fmhandroid.viewmodel.NewsViewModel.Filter> filterFlow = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<java.lang.Integer>> openNewsIds = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> loadNewsExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> loadNewsCategoriesExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> newsListUpdatedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy data$delegate = null;
    
    @javax.inject.Inject()
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.repository.newsRepository.NewsRepository newsRepository, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.repository.userRepository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getLoadNewsExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getLoadNewsCategoriesExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getNewsListUpdatedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.User getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.ui.viewdata.NewsViewData>> getData() {
        return null;
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllNewsCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<ru.iteco.fmhandroid.dto.News.Category>>> continuation) {
        return null;
    }
    
    public final void onFilterNewsClicked(@org.jetbrains.annotations.Nullable()
    java.lang.Integer newsCategoryId, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateStart, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateEnd) {
    }
    
    public final void initializationListNewsCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.iteco.fmhandroid.dto.News.Category> listNewsCategories) {
    }
    
    @java.lang.Override()
    public void onCard(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.ui.viewdata.NewsViewData newsItem) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lru/iteco/fmhandroid/viewmodel/NewsViewModel$SortDirection;", "", "(Ljava/lang/String;I)V", "reverse", "ASC", "DESC", "app_debug"})
    public static enum SortDirection {
        /*public static final*/ ASC /* = new ASC() */,
        /*public static final*/ DESC /* = new DESC() */;
        
        SortDirection() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.iteco.fmhandroid.viewmodel.NewsViewModel.SortDirection reverse() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lru/iteco/fmhandroid/viewmodel/NewsViewModel$Filter;", "", "newsCategoryId", "", "dateStart", "", "dateEnd", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "getDateEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDateStart", "getNewsCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_debug"})
    static final class Filter {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer newsCategoryId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long dateStart = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long dateEnd = null;
        
        public Filter(@org.jetbrains.annotations.Nullable()
        java.lang.Integer newsCategoryId, @org.jetbrains.annotations.Nullable()
        java.lang.Long dateStart, @org.jetbrains.annotations.Nullable()
        java.lang.Long dateEnd) {
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
    }
}