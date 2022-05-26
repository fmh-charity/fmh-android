package ru.iteco.fmhandroid.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u001a\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0011H\u0002J\u0018\u0010+\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006."}, d2 = {"Lru/iteco/fmhandroid/ui/OpenClaimFragment;", "Landroidx/fragment/app/Fragment;", "()V", "authViewModel", "Lru/iteco/fmhandroid/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lru/iteco/fmhandroid/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lru/iteco/fmhandroid/databinding/FragmentOpenClaimBinding;", "claimCardViewModel", "Lru/iteco/fmhandroid/viewmodel/ClaimCardViewModel;", "getClaimCardViewModel", "()Lru/iteco/fmhandroid/viewmodel/ClaimCardViewModel;", "claimCardViewModel$delegate", "claimId", "", "getClaimId", "()I", "claimId$delegate", "displayingStatusOfClaim", "", "claimStatus", "Lru/iteco/fmhandroid/dto/Claim$Status;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "view", "renderingContentOfClaim", "fullClaim", "Lru/iteco/fmhandroid/dto/FullClaim;", "showErrorToast", "text", "statusMenuVisibility", "statusProcessingMenu", "Landroid/widget/PopupMenu;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class OpenClaimFragment extends androidx.fragment.app.Fragment {
    private ru.iteco.fmhandroid.databinding.FragmentOpenClaimBinding binding;
    private final kotlin.Lazy claimCardViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy claimId$delegate = null;
    
    public OpenClaimFragment() {
        super();
    }
    
    private final ru.iteco.fmhandroid.viewmodel.ClaimCardViewModel getClaimCardViewModel() {
        return null;
    }
    
    private final ru.iteco.fmhandroid.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    public final int getClaimId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showErrorToast(int text) {
    }
    
    private final java.lang.String displayingStatusOfClaim(ru.iteco.fmhandroid.dto.Claim.Status claimStatus) {
        return null;
    }
    
    private final void statusMenuVisibility(ru.iteco.fmhandroid.dto.Claim.Status claimStatus, android.widget.PopupMenu statusProcessingMenu) {
    }
    
    private final void renderingContentOfClaim(ru.iteco.fmhandroid.dto.FullClaim fullClaim) {
    }
}