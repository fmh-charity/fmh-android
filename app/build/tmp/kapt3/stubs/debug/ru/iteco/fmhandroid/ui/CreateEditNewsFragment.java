package ru.iteco.fmhandroid.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\f\u0010\u001f\u001a\u00020\u0015*\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lru/iteco/fmhandroid/ui/CreateEditNewsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lru/iteco/fmhandroid/ui/CreateEditNewsFragmentArgs;", "getArgs", "()Lru/iteco/fmhandroid/ui/CreateEditNewsFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lru/iteco/fmhandroid/databinding/FragmentCreateEditNewsBinding;", "vPublishDatePicker", "Lcom/google/android/material/textfield/TextInputEditText;", "vPublishTimePicker", "viewModel", "Lru/iteco/fmhandroid/viewmodel/NewsControlPanelViewModel;", "getViewModel", "()Lru/iteco/fmhandroid/viewmodel/NewsControlPanelViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fillNewsItem", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "showErrorToast", "text", "", "emptyFieldWarning", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CreateEditNewsFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.google.android.material.textfield.TextInputEditText vPublishDatePicker;
    private com.google.android.material.textfield.TextInputEditText vPublishTimePicker;
    private ru.iteco.fmhandroid.databinding.FragmentCreateEditNewsBinding binding;
    
    public CreateEditNewsFragment() {
        super();
    }
    
    private final ru.iteco.fmhandroid.viewmodel.NewsControlPanelViewModel getViewModel() {
        return null;
    }
    
    private final ru.iteco.fmhandroid.ui.CreateEditNewsFragmentArgs getArgs() {
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
    
    private final void emptyFieldWarning(ru.iteco.fmhandroid.databinding.FragmentCreateEditNewsBinding $this$emptyFieldWarning) {
    }
    
    private final void showErrorToast(int text) {
    }
    
    private final void fillNewsItem() {
    }
}