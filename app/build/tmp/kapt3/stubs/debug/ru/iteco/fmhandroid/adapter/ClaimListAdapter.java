package ru.iteco.fmhandroid.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lru/iteco/fmhandroid/adapter/ClaimListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lru/iteco/fmhandroid/dto/FullClaim;", "Lru/iteco/fmhandroid/adapter/ClaimListAdapter$ClaimViewHolder;", "onClaimItemClickListener", "Lru/iteco/fmhandroid/adapter/OnClaimItemClickListener;", "(Lru/iteco/fmhandroid/adapter/OnClaimItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClaimDiffCallback", "ClaimViewHolder", "app_debug"})
public final class ClaimListAdapter extends androidx.recyclerview.widget.ListAdapter<ru.iteco.fmhandroid.dto.FullClaim, ru.iteco.fmhandroid.adapter.ClaimListAdapter.ClaimViewHolder> {
    private final ru.iteco.fmhandroid.adapter.OnClaimItemClickListener onClaimItemClickListener = null;
    
    public ClaimListAdapter(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.adapter.OnClaimItemClickListener onClaimItemClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.iteco.fmhandroid.adapter.ClaimListAdapter.ClaimViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.adapter.ClaimListAdapter.ClaimViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lru/iteco/fmhandroid/adapter/ClaimListAdapter$ClaimViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lru/iteco/fmhandroid/databinding/ItemClaimBinding;", "onClaimItemClickListener", "Lru/iteco/fmhandroid/adapter/OnClaimItemClickListener;", "(Lru/iteco/fmhandroid/databinding/ItemClaimBinding;Lru/iteco/fmhandroid/adapter/OnClaimItemClickListener;)V", "bind", "", "fullClaim", "Lru/iteco/fmhandroid/dto/FullClaim;", "app_debug"})
    public static final class ClaimViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final ru.iteco.fmhandroid.databinding.ItemClaimBinding binding = null;
        private final ru.iteco.fmhandroid.adapter.OnClaimItemClickListener onClaimItemClickListener = null;
        
        public ClaimViewHolder(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.databinding.ItemClaimBinding binding, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.adapter.OnClaimItemClickListener onClaimItemClickListener) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.FullClaim fullClaim) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lru/iteco/fmhandroid/adapter/ClaimListAdapter$ClaimDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lru/iteco/fmhandroid/dto/FullClaim;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class ClaimDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<ru.iteco.fmhandroid.dto.FullClaim> {
        @org.jetbrains.annotations.NotNull()
        public static final ru.iteco.fmhandroid.adapter.ClaimListAdapter.ClaimDiffCallback INSTANCE = null;
        
        private ClaimDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.FullClaim oldItem, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.FullClaim newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.FullClaim oldItem, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.FullClaim newItem) {
            return false;
        }
    }
}