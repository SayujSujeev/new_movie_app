// Generated by Dagger (https://dagger.dev).
package com.sayuj.themoviesdb.ui.home.tabLayoutPages.Popular;

import com.sayuj.themoviesdb.domain.useCases.UseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PopularViewModel_Factory implements Factory<PopularViewModel> {
  private final Provider<UseCases> useCasesProvider;

  public PopularViewModel_Factory(Provider<UseCases> useCasesProvider) {
    this.useCasesProvider = useCasesProvider;
  }

  @Override
  public PopularViewModel get() {
    return newInstance(useCasesProvider.get());
  }

  public static PopularViewModel_Factory create(Provider<UseCases> useCasesProvider) {
    return new PopularViewModel_Factory(useCasesProvider);
  }

  public static PopularViewModel newInstance(UseCases useCases) {
    return new PopularViewModel(useCases);
  }
}
