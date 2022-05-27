package ru.iteco.fmhandroid.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lru/iteco/fmhandroid/ui/FilterNewsListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lru/iteco/fmhandroid/databinding/FragmentFilterNewsBinding;", "nameFragment", "Lru/iteco/fmhandroid/enum/FragmentsTags;", "getNameFragment", "()Lru/iteco/fmhandroid/enum/FragmentsTags;", "nameFragment$delegate", "Lkotlin/Lazy;", "newsListViewModel", "Lru/iteco/fmhandroid/viewmodel/NewsViewModel;", "getNewsListViewModel", "()Lru/iteco/fmhandroid/viewmodel/NewsViewModel;", "newsListViewModel$delegate", "vPublishDateEndPicker", "Lcom/google/android/material/textfield/TextInputEditText;", "vPublishDateStartPicker", "navigateUp", "", "category", "", "dates", "", "", "status", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FilterNewsListFragment extends androidx.fragment.app.Fragment {
    private ru.iteco.fmhandroid.databinding.FragmentFilterNewsBinding binding;
    private com.google.android.material.textfield.TextInputEditText vPublishDateStartPicker;
    private com.google.android.material.textfield.TextInputEditText vPublishDateEndPicker;
    private final kotlin.Lazy newsListViewModel$delegate = null;
    private final kotlin.Lazy nameFragment$delegate = null;
    
    public FilterNewsListFragment() {
        super();
    }
    
    private final ru.iteco.fmhandroid.viewmodel.NewsViewModel getNewsListViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void navigateUp(java.lang.String category, java.util.List<java.lang.Long> dates, java.lang.Boolean status) {
    }
}