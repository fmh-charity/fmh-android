package ru.iteco.fmhandroid.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\f\u0010!\u001a\u00020\u0017*\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lru/iteco/fmhandroid/ui/CreateEditClaimFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lru/iteco/fmhandroid/ui/CreateEditClaimFragmentArgs;", "getArgs", "()Lru/iteco/fmhandroid/ui/CreateEditClaimFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lru/iteco/fmhandroid/databinding/FragmentCreateEditClaimBinding;", "claimCardViewModel", "Lru/iteco/fmhandroid/viewmodel/ClaimCardViewModel;", "getClaimCardViewModel", "()Lru/iteco/fmhandroid/viewmodel/ClaimCardViewModel;", "claimCardViewModel$delegate", "Lkotlin/Lazy;", "executor", "Lru/iteco/fmhandroid/dto/User;", "vDatePicker", "Lcom/google/android/material/textfield/TextInputEditText;", "vTimePicker", "fillClaim", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "showErrorToast", "text", "", "emptyFieldWarning", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CreateEditClaimFragment extends androidx.fragment.app.Fragment {
    private com.google.android.material.textfield.TextInputEditText vDatePicker;
    private com.google.android.material.textfield.TextInputEditText vTimePicker;
    private ru.iteco.fmhandroid.databinding.FragmentCreateEditClaimBinding binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private ru.iteco.fmhandroid.dto.User executor;
    private final kotlin.Lazy claimCardViewModel$delegate = null;
    
    public CreateEditClaimFragment() {
        super();
    }
    
    private final ru.iteco.fmhandroid.ui.CreateEditClaimFragmentArgs getArgs() {
        return null;
    }
    
    private final ru.iteco.fmhandroid.viewmodel.ClaimCardViewModel getClaimCardViewModel() {
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
    
    private final void emptyFieldWarning(ru.iteco.fmhandroid.databinding.FragmentCreateEditClaimBinding $this$emptyFieldWarning) {
    }
    
    private final void fillClaim() {
    }
    
    private final void showErrorToast(int text) {
    }
}