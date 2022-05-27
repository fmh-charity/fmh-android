package ru.iteco.fmhandroid.ui;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CustomSplashScreen"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u001cH\u0002J\u001a\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006%"}, d2 = {"Lru/iteco/fmhandroid/ui/SplashScreenFragment;", "Landroidx/fragment/app/Fragment;", "()V", "auth", "Lru/iteco/fmhandroid/auth/AppAuth;", "getAuth", "()Lru/iteco/fmhandroid/auth/AppAuth;", "setAuth", "(Lru/iteco/fmhandroid/auth/AppAuth;)V", "authViewModel", "Lru/iteco/fmhandroid/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lru/iteco/fmhandroid/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lru/iteco/fmhandroid/databinding/FragmentSplashScreenBinding;", "splashscreenImage", "Lru/iteco/fmhandroid/dto/SplashScreenData;", "splashscreenImages", "", "userApi", "Lru/iteco/fmhandroid/api/UserApi;", "getUserApi", "()Lru/iteco/fmhandroid/api/UserApi;", "setUserApi", "(Lru/iteco/fmhandroid/api/UserApi;)V", "offFullScreen", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFullScreen", "onViewCreated", "view", "Landroid/view/View;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SplashScreenFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public ru.iteco.fmhandroid.auth.AppAuth auth;
    @javax.inject.Inject()
    public ru.iteco.fmhandroid.api.UserApi userApi;
    private final kotlin.Lazy authViewModel$delegate = null;
    private ru.iteco.fmhandroid.databinding.FragmentSplashScreenBinding binding;
    private final java.util.List<ru.iteco.fmhandroid.dto.SplashScreenData> splashscreenImages = null;
    private final ru.iteco.fmhandroid.dto.SplashScreenData splashscreenImage = null;
    
    public SplashScreenFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.auth.AppAuth getAuth() {
        return null;
    }
    
    public final void setAuth(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.auth.AppAuth p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.iteco.fmhandroid.api.UserApi getUserApi() {
        return null;
    }
    
    public final void setUserApi(@org.jetbrains.annotations.NotNull()
    ru.iteco.fmhandroid.api.UserApi p0) {
    }
    
    private final ru.iteco.fmhandroid.viewmodel.AuthViewModel getAuthViewModel() {
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void onFullScreen() {
    }
    
    private final void offFullScreen() {
    }
}