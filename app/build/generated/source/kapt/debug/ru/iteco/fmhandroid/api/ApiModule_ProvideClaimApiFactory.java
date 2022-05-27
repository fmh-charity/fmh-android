// Generated by Dagger (https://dagger.dev).
package ru.iteco.fmhandroid.api;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("ru.iteco.fmhandroid.api.qualifier.Authorized")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideClaimApiFactory implements Factory<ClaimApi> {
  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvideClaimApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ClaimApi get() {
    return provideClaimApi(retrofitProvider.get());
  }

  public static ApiModule_ProvideClaimApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvideClaimApiFactory(retrofitProvider);
  }

  public static ClaimApi provideClaimApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.provideClaimApi(retrofit));
  }
}
