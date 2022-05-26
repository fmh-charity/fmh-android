package ru.iteco.fmhandroid.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00050\u0004\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u0004H\u0002R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lru/iteco/fmhandroid/viewmodel/OurMissionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "data", "Lkotlinx/coroutines/flow/Flow;", "", "Lru/iteco/fmhandroid/ui/viewdata/OurMissionItemViewData;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "setData", "(Lkotlinx/coroutines/flow/Flow;)V", "isOpenItemIds", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "ourMissionItemList", "onCard", "", "ourMissionItem", "toSingleListItem", "T", "app_debug"})
public final class OurMissionViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.Flow<ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData> ourMissionItemList = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<java.lang.Integer>> isOpenItemIds = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.Flow<? extends java.util.List<ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData>> data;
    
    public OurMissionViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData>> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends java.util.List<ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData>> p0) {
    }
    
    public final void onCard(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.ui.viewdata.OurMissionItemViewData ourMissionItem) {
    }
    
    private final <T extends java.lang.Object>kotlinx.coroutines.flow.Flow<java.util.List<T>> toSingleListItem(kotlinx.coroutines.flow.Flow<? extends T> $this$toSingleListItem) {
        return null;
    }
}