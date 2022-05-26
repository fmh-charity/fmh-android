package ru.iteco.fmhandroid.application;

import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;
import ru.iteco.fmhandroid.api.ApiModule;
import ru.iteco.fmhandroid.api.AuthApiModule;
import ru.iteco.fmhandroid.api.NetworkModule;
import ru.iteco.fmhandroid.api.RefreshApiModule;
import ru.iteco.fmhandroid.dao.DaoModule;
import ru.iteco.fmhandroid.db.DbModule;
import ru.iteco.fmhandroid.repository.authRepository.AuthRepositoryModule;
import ru.iteco.fmhandroid.repository.claimRepository.ClaimRepositoryModule;
import ru.iteco.fmhandroid.repository.newsRepository.NewsRepositoryModule;
import ru.iteco.fmhandroid.repository.userRepository.UserRepositoryModule;
import ru.iteco.fmhandroid.ui.AppActivity_GeneratedInjector;
import ru.iteco.fmhandroid.ui.AuthFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.ClaimListFilteringDialogFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.ClaimListFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.CreateEditClaimCommentFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.CreateEditClaimFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.CreateEditNewsFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.FilterNewsListFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.MainFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.NewsControlPanelFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.NewsListFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.OpenClaimFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.OurMissionFragment_GeneratedInjector;
import ru.iteco.fmhandroid.ui.SplashScreenFragment_GeneratedInjector;
import ru.iteco.fmhandroid.viewmodel.AuthViewModel_HiltModules;
import ru.iteco.fmhandroid.viewmodel.ClaimCardViewModel_HiltModules;
import ru.iteco.fmhandroid.viewmodel.ClaimViewModel_HiltModules;
import ru.iteco.fmhandroid.viewmodel.NewsControlPanelViewModel_HiltModules;
import ru.iteco.fmhandroid.viewmodel.NewsViewModel_HiltModules;

public final class FhmApplication_HiltComponents {
  private FhmApplication_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ApiModule.class,
          ApplicationContextModule.class,
          AuthApiModule.class,
          AuthRepositoryModule.class,
          ClaimRepositoryModule.class,
          DaoModule.class,
          DbModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
          NetworkModule.class,
          NewsRepositoryModule.class,
          RefreshApiModule.class,
          UserRepositoryModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent,
      FhmApplication_GeneratedInjector {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AuthViewModel_HiltModules.KeyModule.class,
          ClaimCardViewModel_HiltModules.KeyModule.class,
          ClaimViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          NewsControlPanelViewModel_HiltModules.KeyModule.class,
          NewsViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent,
      AppActivity_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AuthViewModel_HiltModules.BindsModule.class,
          ClaimCardViewModel_HiltModules.BindsModule.class,
          ClaimViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          NewsControlPanelViewModel_HiltModules.BindsModule.class,
          NewsViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent,
      AuthFragment_GeneratedInjector,
      ClaimListFilteringDialogFragment_GeneratedInjector,
      ClaimListFragment_GeneratedInjector,
      CreateEditClaimCommentFragment_GeneratedInjector,
      CreateEditClaimFragment_GeneratedInjector,
      CreateEditNewsFragment_GeneratedInjector,
      FilterNewsListFragment_GeneratedInjector,
      MainFragment_GeneratedInjector,
      NewsControlPanelFragment_GeneratedInjector,
      NewsListFragment_GeneratedInjector,
      OpenClaimFragment_GeneratedInjector,
      OurMissionFragment_GeneratedInjector,
      SplashScreenFragment_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
