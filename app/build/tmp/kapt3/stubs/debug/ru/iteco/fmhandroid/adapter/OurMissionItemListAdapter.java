package ru.iteco.fmhandroid.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lru/iteco/fmhandroid/adapter/OurMissionItemListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lru/iteco/fmhandroid/ui/viewdata/OurMissionItemViewData;", "Lru/iteco/fmhandroid/adapter/OurMissionItemListAdapter$OurMissionViewHolder;", "onOurMissionItemClickListener", "Lru/iteco/fmhandroid/adapter/OnOurMissionItemClickListener;", "viewModel", "Lru/iteco/fmhandroid/viewmodel/OurMissionViewModel;", "(Lru/iteco/fmhandroid/adapter/OnOurMissionItemClickListener;Lru/iteco/fmhandroid/viewmodel/OurMissionViewModel;)V", "getViewModel", "()Lru/iteco/fmhandroid/viewmodel/OurMissionViewModel;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OurMissionDiffCallback", "OurMissionViewHolder", "app_debug"})
public final class OurMissionItemListAdapter extends androidx.recyclerview.widget.ListAdapter<ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData, ru.iteco.fmhandroid.adapter.OurMissionItemListAdapter.OurMissionViewHolder> {
    private final ru.iteco.fmhandroid.adapter.OnOurMissionItemClickListener onOurMissionItemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.iteco.fmhandroid.viewmodel.OurMissionViewModel viewModel = null;
    
    public OurMissionItemListAdapter(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.adapter.OnOurMissionItemClickListener onOurMissionItemClickListener, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.viewmodel.OurMissionViewModel viewModel) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.viewmodel.OurMissionViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.iteco.fmhandroid.adapter.OurMissionItemListAdapter.OurMissionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.adapter.OurMissionItemListAdapter.OurMissionViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lru/iteco/fmhandroid/adapter/OurMissionItemListAdapter$OurMissionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lru/iteco/fmhandroid/databinding/ItemOurMissionBinding;", "onOurMissionItemClickListener", "Lru/iteco/fmhandroid/adapter/OnOurMissionItemClickListener;", "viewModel", "Lru/iteco/fmhandroid/viewmodel/OurMissionViewModel;", "(Lru/iteco/fmhandroid/databinding/ItemOurMissionBinding;Lru/iteco/fmhandroid/adapter/OnOurMissionItemClickListener;Lru/iteco/fmhandroid/viewmodel/OurMissionViewModel;)V", "getBinding", "()Lru/iteco/fmhandroid/databinding/ItemOurMissionBinding;", "getOnOurMissionItemClickListener", "()Lru/iteco/fmhandroid/adapter/OnOurMissionItemClickListener;", "getViewModel", "()Lru/iteco/fmhandroid/viewmodel/OurMissionViewModel;", "bind", "", "ourMissionItem", "Lru/iteco/fmhandroid/ui/viewdata/OurMissionItemViewData;", "app_debug"})
    public static final class OurMissionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ru.iteco.fmhandroid.databinding.ItemOurMissionBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final ru.iteco.fmhandroid.adapter.OnOurMissionItemClickListener onOurMissionItemClickListener = null;
        @org.jetbrains.annotations.NotNull()
        private final ru.iteco.fmhandroid.viewmodel.OurMissionViewModel viewModel = null;
        
        public OurMissionViewHolder(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.databinding.ItemOurMissionBinding binding, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.adapter.OnOurMissionItemClickListener onOurMissionItemClickListener, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.viewmodel.OurMissionViewModel viewModel) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.iteco.fmhandroid.databinding.ItemOurMissionBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.iteco.fmhandroid.adapter.OnOurMissionItemClickListener getOnOurMissionItemClickListener() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.iteco.fmhandroid.viewmodel.OurMissionViewModel getViewModel() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData ourMissionItem) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lru/iteco/fmhandroid/adapter/OurMissionItemListAdapter$OurMissionDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lru/iteco/fmhandroid/ui/viewdata/OurMissionItemViewData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class OurMissionDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData> {
        @org.jetbrains.annotations.NotNull()
        public static final ru.iteco.fmhandroid.adapter.OurMissionItemListAdapter.OurMissionDiffCallback INSTANCE = null;
        
        private OurMissionDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData oldItem, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData oldItem, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData newItem) {
            return false;
        }
    }
}