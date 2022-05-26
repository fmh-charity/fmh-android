package ru.iteco.fmhandroid.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0017J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lru/iteco/fmhandroid/ui/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "authViewModel", "Lru/iteco/fmhandroid/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lru/iteco/fmhandroid/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lru/iteco/fmhandroid/databinding/FragmentMainBinding;", "claimViewModel", "Lru/iteco/fmhandroid/viewmodel/ClaimViewModel;", "getClaimViewModel", "()Lru/iteco/fmhandroid/viewmodel/ClaimViewModel;", "claimViewModel$delegate", "newsViewModel", "Lru/iteco/fmhandroid/viewmodel/NewsViewModel;", "getNewsViewModel", "()Lru/iteco/fmhandroid/viewmodel/NewsViewModel;", "newsViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "showErrorToast", "text", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainFragment extends androidx.fragment.app.Fragment {
    private ru.iteco.fmhandroid.databinding.FragmentMainBinding binding;
    private final kotlin.Lazy claimViewModel$delegate = null;
    private final kotlin.Lazy newsViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    
    public MainFragment() {
        super();
    }
    
    private final ru.iteco.fmhandroid.viewmodel.ClaimViewModel getClaimViewModel() {
        return null;
    }
    
    private final ru.iteco.fmhandroid.viewmodel.NewsViewModel getNewsViewModel() {
        return null;
    }
    
    private final ru.iteco.fmhandroid.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showErrorToast(int text) {
    }
}