// Generated by Dagger (https://dagger.dev).
package ru.iteco.fmhandroid.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import ru.iteco.fmhandroid.repository.claimRepository.ClaimRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ClaimViewModel_Factory implements Factory<ClaimViewModel> {
  private final Provider<ClaimRepository> claimRepositoryProvider;

  public ClaimViewModel_Factory(Provider<ClaimRepository> claimRepositoryProvider) {
    this.claimRepositoryProvider = claimRepositoryProvider;
  }

  @Override
  public ClaimViewModel get() {
    return newInstance(claimRepositoryProvider.get());
  }

  public static ClaimViewModel_Factory create(Provider<ClaimRepository> claimRepositoryProvider) {
    return new ClaimViewModel_Factory(claimRepositoryProvider);
  }

  public static ClaimViewModel newInstance(ClaimRepository claimRepository) {
    return new ClaimViewModel(claimRepository);
  }
}
