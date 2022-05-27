package ru.iteco.fmhandroid.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u001f\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\u0014\u0010#\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012J\u0006\u0010%\u001a\u00020\bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00120\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lru/iteco/fmhandroid/viewmodel/ClaimViewModel;", "Landroidx/lifecycle/ViewModel;", "Lru/iteco/fmhandroid/adapter/OnClaimItemClickListener;", "claimRepository", "Lru/iteco/fmhandroid/repository/claimRepository/ClaimRepository;", "(Lru/iteco/fmhandroid/repository/claimRepository/ClaimRepository;)V", "claimCommentsLoadExceptionEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getClaimCommentsLoadExceptionEvent", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "claimCommentsLoadedEvent", "claimListUpdatedEvent", "getClaimListUpdatedEvent", "claimsLoadException", "getClaimsLoadException", "data", "Lkotlinx/coroutines/flow/Flow;", "", "Lru/iteco/fmhandroid/dto/FullClaim;", "getData$annotations", "()V", "getData", "()Lkotlinx/coroutines/flow/Flow;", "openClaimEvent", "getOpenClaimEvent", "statusesFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lru/iteco/fmhandroid/dto/Claim$Status;", "getStatusesFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "internalOnRefresh", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCard", "fullClaim", "onFilterClaimsMenuItemClicked", "statuses", "onRefresh", "app_debug"})
public final class ClaimViewModel extends androidx.lifecycle.ViewModel implements ru.iteco.fmhandroid.adapter.OnClaimItemClickListener {
    private final ru.iteco.fmhandroid.repository.claimRepository.ClaimRepository claimRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimListUpdatedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimsLoadException = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimCommentsLoadedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimCommentsLoadExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<ru.iteco.fmhandroid.dto.FullClaim> openClaimEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<ru.iteco.fmhandroid.dto.Claim.Status>> statusesFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.FullClaim>> data = null;
    
    @javax.inject.Inject()
    public ClaimViewModel(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.repository.claimRepository.ClaimRepository claimRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getClaimListUpdatedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getClaimsLoadException() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getClaimCommentsLoadExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<ru.iteco.fmhandroid.dto.FullClaim> getOpenClaimEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<ru.iteco.fmhandroid.dto.Claim.Status>> getStatusesFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.dto.FullClaim>> getData() {
        return null;
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Deprecated()
    public static void getData$annotations() {
    }
    
    public final void onFilterClaimsMenuItemClicked(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends ru.iteco.fmhandroid.dto.Claim.Status> statuses) {
    }
    
    public final void onRefresh() {
    }
    
    private final java.lang.Object internalOnRefresh(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void onCard(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.FullClaim fullClaim) {
    }
}