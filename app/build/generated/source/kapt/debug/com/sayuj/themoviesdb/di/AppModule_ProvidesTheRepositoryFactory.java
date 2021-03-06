// Generated by Dagger (https://dagger.dev).
package com.sayuj.themoviesdb.di;

import com.sayuj.themoviesdb.data.localSource.AppDataBase;
import com.sayuj.themoviesdb.data.remoteSource.TheMovieDatabaseAPI;
import com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesTheRepositoryFactory implements Factory<TheMovieDbRepository> {
  private final AppModule module;

  private final Provider<AppDataBase> appDataBaseProvider;

  private final Provider<TheMovieDatabaseAPI> apiProvider;

  public AppModule_ProvidesTheRepositoryFactory(AppModule module,
      Provider<AppDataBase> appDataBaseProvider, Provider<TheMovieDatabaseAPI> apiProvider) {
    this.module = module;
    this.appDataBaseProvider = appDataBaseProvider;
    this.apiProvider = apiProvider;
  }

  @Override
  public TheMovieDbRepository get() {
    return providesTheRepository(module, appDataBaseProvider.get(), apiProvider.get());
  }

  public static AppModule_ProvidesTheRepositoryFactory create(AppModule module,
      Provider<AppDataBase> appDataBaseProvider, Provider<TheMovieDatabaseAPI> apiProvider) {
    return new AppModule_ProvidesTheRepositoryFactory(module, appDataBaseProvider, apiProvider);
  }

  public static TheMovieDbRepository providesTheRepository(AppModule instance,
      AppDataBase appDataBase, TheMovieDatabaseAPI api) {
    return Preconditions.checkNotNullFromProvides(instance.providesTheRepository(appDataBase, api));
  }
}
