// Generated by Dagger (https://dagger.dev).
package com.sayuj.themoviesdb.ui.home.tabLayoutPages.Popular;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PopularViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static PopularViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(PopularViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final PopularViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new PopularViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
