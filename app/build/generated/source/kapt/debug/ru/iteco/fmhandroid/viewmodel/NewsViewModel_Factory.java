// Generated by Dagger (https://dagger.dev).
package ru.iteco.fmhandroid.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import ru.iteco.fmhandroid.repository.newsRepository.NewsRepository;
import ru.iteco.fmhandroid.repository.userRepository.UserRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsViewModel_Factory implements Factory<NewsViewModel> {
  private final Provider<NewsRepository> newsRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public NewsViewModel_Factory(Provider<NewsRepository> newsRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.newsRepositoryProvider = newsRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public NewsViewModel get() {
    return newInstance(newsRepositoryProvider.get(), userRepositoryProvider.get());
  }

  public static NewsViewModel_Factory create(Provider<NewsRepository> newsRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new NewsViewModel_Factory(newsRepositoryProvider, userRepositoryProvider);
  }

  public static NewsViewModel newInstance(NewsRepository newsRepository,
      UserRepository userRepository) {
    return new NewsViewModel(newsRepository, userRepository);
  }
}
