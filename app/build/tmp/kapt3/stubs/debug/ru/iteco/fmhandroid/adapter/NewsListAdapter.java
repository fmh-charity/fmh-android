package ru.iteco.fmhandroid.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/iteco/fmhandroid/adapter/NewsListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lru/iteco/fmhandroid/ui/viewdata/NewsViewData;", "Lru/iteco/fmhandroid/adapter/NewsListAdapter$NewsViewHolder;", "onNewsItemClickListener", "Lru/iteco/fmhandroid/adapter/OnNewsItemClickListener;", "(Lru/iteco/fmhandroid/adapter/OnNewsItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NewsViewHolder", "app_debug"})
public final class NewsListAdapter extends androidx.recyclerview.widget.ListAdapter<ru.iteco.fmhandroid.ui.viewdata.NewsViewData, ru.iteco.fmhandroid.adapter.NewsListAdapter.NewsViewHolder> {
    private final ru.iteco.fmhandroid.adapter.OnNewsItemClickListener onNewsItemClickListener = null;
    
    public NewsListAdapter(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.adapter.OnNewsItemClickListener onNewsItemClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.iteco.fmhandroid.adapter.NewsListAdapter.NewsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.adapter.NewsListAdapter.NewsViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lru/iteco/fmhandroid/adapter/NewsListAdapter$NewsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lru/iteco/fmhandroid/databinding/ItemNewsBinding;", "onNewsItemClickListener", "Lru/iteco/fmhandroid/adapter/OnNewsItemClickListener;", "(Lru/iteco/fmhandroid/databinding/ItemNewsBinding;Lru/iteco/fmhandroid/adapter/OnNewsItemClickListener;)V", "bind", "", "news", "Lru/iteco/fmhandroid/ui/viewdata/NewsViewData;", "setCategoryIcon", "app_debug"})
    public static final class NewsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final ru.iteco.fmhandroid.databinding.ItemNewsBinding binding = null;
        private final ru.iteco.fmhandroid.adapter.OnNewsItemClickListener onNewsItemClickListener = null;
        
        public NewsViewHolder(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.databinding.ItemNewsBinding binding, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.adapter.OnNewsItemClickListener onNewsItemClickListener) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.ui.viewdata.NewsViewData news) {
        }
        
        private final void setCategoryIcon(ru.iteco.fmhandroid.ui.viewdata.NewsViewData news) {
        }
    }
}