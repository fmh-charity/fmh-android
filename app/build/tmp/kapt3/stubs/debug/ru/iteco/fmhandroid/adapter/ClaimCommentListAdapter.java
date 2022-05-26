package ru.iteco.fmhandroid.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lru/iteco/fmhandroid/adapter/ClaimCommentListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lru/iteco/fmhandroid/dto/ClaimComment;", "Lru/iteco/fmhandroid/adapter/ClaimCommentListAdapter$ClaimCommentViewHolder;", "onClaimCommentItemClickListener", "Lru/iteco/fmhandroid/adapter/OnClaimCommentItemClickListener;", "claimCardViewModel", "Lru/iteco/fmhandroid/viewmodel/ClaimCardViewModel;", "(Lru/iteco/fmhandroid/adapter/OnClaimCommentItemClickListener;Lru/iteco/fmhandroid/viewmodel/ClaimCardViewModel;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClaimCommentDiffCallback", "ClaimCommentViewHolder", "app_debug"})
public final class ClaimCommentListAdapter extends androidx.recyclerview.widget.ListAdapter<ru.iteco.fmhandroid.dto.ClaimComment, ru.iteco.fmhandroid.adapter.ClaimCommentListAdapter.ClaimCommentViewHolder> {
    private final ru.iteco.fmhandroid.adapter.OnClaimCommentItemClickListener onClaimCommentItemClickListener = null;
    private final ru.iteco.fmhandroid.viewmodel.ClaimCardViewModel claimCardViewModel = null;
    
    public ClaimCommentListAdapter(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.adapter.OnClaimCommentItemClickListener onClaimCommentItemClickListener, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.viewmodel.ClaimCardViewModel claimCardViewModel) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.iteco.fmhandroid.adapter.ClaimCommentListAdapter.ClaimCommentViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.adapter.ClaimCommentListAdapter.ClaimCommentViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lru/iteco/fmhandroid/adapter/ClaimCommentListAdapter$ClaimCommentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lru/iteco/fmhandroid/databinding/ItemCommentBinding;", "onClaimCommentItemClickListener", "Lru/iteco/fmhandroid/adapter/OnClaimCommentItemClickListener;", "claimCardViewModel", "Lru/iteco/fmhandroid/viewmodel/ClaimCardViewModel;", "(Lru/iteco/fmhandroid/databinding/ItemCommentBinding;Lru/iteco/fmhandroid/adapter/OnClaimCommentItemClickListener;Lru/iteco/fmhandroid/viewmodel/ClaimCardViewModel;)V", "bind", "", "claimComment", "Lru/iteco/fmhandroid/dto/ClaimComment;", "app_debug"})
    public static final class ClaimCommentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final ru.iteco.fmhandroid.databinding.ItemCommentBinding binding = null;
        private final ru.iteco.fmhandroid.adapter.OnClaimCommentItemClickListener onClaimCommentItemClickListener = null;
        private final ru.iteco.fmhandroid.viewmodel.ClaimCardViewModel claimCardViewModel = null;
        
        public ClaimCommentViewHolder(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.databinding.ItemCommentBinding binding, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.adapter.OnClaimCommentItemClickListener onClaimCommentItemClickListener, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.viewmodel.ClaimCardViewModel claimCardViewModel) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.ClaimComment claimComment) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lru/iteco/fmhandroid/adapter/ClaimCommentListAdapter$ClaimCommentDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lru/iteco/fmhandroid/dto/ClaimComment;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class ClaimCommentDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<ru.iteco.fmhandroid.dto.ClaimComment> {
        @org.jetbrains.annotations.NotNull()
        public static final ru.iteco.fmhandroid.adapter.ClaimCommentListAdapter.ClaimCommentDiffCallback INSTANCE = null;
        
        private ClaimCommentDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.ClaimComment oldItem, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.ClaimComment newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.ClaimComment oldItem, @org.jetbrains.annotations.NotNull()
        ru.iteco.fmhandroid.dto.ClaimComment newItem) {
            return false;
        }
    }
}