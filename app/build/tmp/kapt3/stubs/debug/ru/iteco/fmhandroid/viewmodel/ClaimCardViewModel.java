package ru.iteco.fmhandroid.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J-\u00109\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u00142\u0006\u0010=\u001a\u000201\u00a2\u0006\u0002\u0010>J\u000e\u0010?\u001a\u00020\n2\u0006\u0010=\u001a\u000201J\u000e\u0010@\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010A\u001a\u00020\n2\u0006\u0010=\u001a\u000201H\u0016J\u000e\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020DJ\u000e\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020DJ\u000e\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u000201R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\fR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R!\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\fR\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\fR\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020&068F\u00a2\u0006\u0006\u001a\u0004\b7\u00108R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lru/iteco/fmhandroid/viewmodel/ClaimCardViewModel;", "Landroidx/lifecycle/ViewModel;", "Lru/iteco/fmhandroid/adapter/OnClaimCommentItemClickListener;", "claimRepository", "Lru/iteco/fmhandroid/repository/claimRepository/ClaimRepository;", "userRepository", "Lru/iteco/fmhandroid/repository/userRepository/UserRepository;", "(Lru/iteco/fmhandroid/repository/claimRepository/ClaimRepository;Lru/iteco/fmhandroid/repository/userRepository/UserRepository;)V", "claimCommentCreateExceptionEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getClaimCommentCreateExceptionEvent", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "claimCommentCreatedEvent", "getClaimCommentCreatedEvent", "claimCommentUpdatedEvent", "getClaimCommentUpdatedEvent", "claimCreatedEvent", "getClaimCreatedEvent", "<set-?>", "", "claimId", "getClaimId", "()I", "setClaimId", "(I)V", "claimId$delegate", "Lkotlin/properties/ReadWriteProperty;", "claimStatusChangeExceptionEvent", "getClaimStatusChangeExceptionEvent", "claimStatusChangedEvent", "claimUpdateExceptionEvent", "getClaimUpdateExceptionEvent", "claimUpdatedEvent", "getClaimUpdatedEvent", "createClaimExceptionEvent", "getCreateClaimExceptionEvent", "currentUser", "Lru/iteco/fmhandroid/dto/User;", "getCurrentUser", "()Lru/iteco/fmhandroid/dto/User;", "dataFullClaim", "Lkotlinx/coroutines/flow/Flow;", "Lru/iteco/fmhandroid/dto/FullClaim;", "getDataFullClaim", "()Lkotlinx/coroutines/flow/Flow;", "dataFullClaim$delegate", "Lkotlin/Lazy;", "openClaimCommentEvent", "Lru/iteco/fmhandroid/dto/ClaimComment;", "getOpenClaimCommentEvent", "updateClaimCommentExceptionEvent", "getUpdateClaimCommentExceptionEvent", "userList", "", "getUserList", "()Ljava/util/List;", "changeClaimStatus", "newClaimStatus", "Lru/iteco/fmhandroid/dto/Claim$Status;", "executorId", "claimComment", "(ILru/iteco/fmhandroid/dto/Claim$Status;Ljava/lang/Integer;Lru/iteco/fmhandroid/dto/ClaimComment;)V", "createClaimComment", "init", "onCard", "save", "claim", "Lru/iteco/fmhandroid/dto/Claim;", "updateClaim", "updatedClaim", "updateClaimComment", "comment", "app_debug"})
public final class ClaimCardViewModel extends androidx.lifecycle.ViewModel implements ru.iteco.fmhandroid.adapter.OnClaimCommentItemClickListener {
    private final ru.iteco.fmhandroid.repository.claimRepository.ClaimRepository claimRepository = null;
    private final ru.iteco.fmhandroid.repository.userRepository.UserRepository userRepository = null;
    private final kotlin.properties.ReadWriteProperty claimId$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dataFullClaim$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<ru.iteco.fmhandroid.dto.ClaimComment> openClaimCommentEvent = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimStatusChangedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimStatusChangeExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimUpdateExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimUpdatedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimCreatedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> createClaimExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimCommentCreatedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimCommentUpdatedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> claimCommentCreateExceptionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> updateClaimCommentExceptionEvent = null;
    
    @javax.inject.Inject()
    public ClaimCardViewModel(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.repository.claimRepository.ClaimRepository claimRepository, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.repository.userRepository.UserRepository userRepository) {
        super();
    }
    
    private final int getClaimId() {
        return 0;
    }
    
    private final void setClaimId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<ru.iteco.fmhandroid.dto.FullClaim> getDataFullClaim() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.dto.User getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.iteco.fmhandroid.dto.User> getUserList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<ru.iteco.fmhandroid.dto.ClaimComment> getOpenClaimCommentEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getClaimStatusChangeExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getClaimUpdateExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getClaimUpdatedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getClaimCreatedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getCreateClaimExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getClaimCommentCreatedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getClaimCommentUpdatedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getClaimCommentCreateExceptionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getUpdateClaimCommentExceptionEvent() {
        return null;
    }
    
    public final void createClaimComment(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.ClaimComment claimComment) {
    }
    
    public final void updateClaimComment(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.ClaimComment comment) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim claim) {
    }
    
    public final void updateClaim(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim updatedClaim) {
    }
    
    public final void changeClaimStatus(int claimId, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.Claim.Status newClaimStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Integer executorId, @org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.ClaimComment claimComment) {
    }
    
    public final void init(int claimId) {
    }
    
    @java.lang.Override()
    public void onCard(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.dto.ClaimComment claimComment) {
    }
}