// Generated by Dagger (https://dagger.dev).
package com.sayuj.themoviesdb.ui.home.tabLayoutPages.nowPlaying;

import com.sayuj.themoviesdb.domain.useCases.UseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NowPlayingViewModel_Factory implements Factory<NowPlayingViewModel> {
  private final Provider<UseCases> useCasesProvider;

  public NowPlayingViewModel_Factory(Provider<UseCases> useCasesProvider) {
    this.useCasesProvider = useCasesProvider;
  }

  @Override
  public NowPlayingViewModel get() {
    return newInstance(useCasesProvider.get());
  }

  public static NowPlayingViewModel_Factory create(Provider<UseCases> useCasesProvider) {
    return new NowPlayingViewModel_Factory(useCasesProvider);
  }

  public static NowPlayingViewModel newInstance(UseCases useCases) {
    return new NowPlayingViewModel(useCases);
  }
}