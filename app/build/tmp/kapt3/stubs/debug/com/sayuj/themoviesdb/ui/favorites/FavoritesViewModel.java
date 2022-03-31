package com.sayuj.themoviesdb.ui.favorites;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/sayuj/themoviesdb/ui/favorites/FavoritesViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/sayuj/themoviesdb/domain/useCases/UseCases;", "(Lcom/sayuj/themoviesdb/domain/useCases/UseCases;)V", "resultFavorites", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "getResultFavorites", "()Landroidx/lifecycle/MutableLiveData;", "setResultFavorites", "(Landroidx/lifecycle/MutableLiveData;)V", "deleteAllFavoritesMovies", "", "getAllFavoritesMovies", "app_debug"})
public final class FavoritesViewModel extends androidx.lifecycle.ViewModel {
    private final com.sayuj.themoviesdb.domain.useCases.UseCases useCases = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.sayuj.themoviesdb.domain.model.Movie>> resultFavorites;
    
    @javax.inject.Inject
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.UseCases useCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.sayuj.themoviesdb.domain.model.Movie>> getResultFavorites() {
        return null;
    }
    
    public final void setResultFavorites(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.sayuj.themoviesdb.domain.model.Movie>> p0) {
    }
    
    public final void getAllFavoritesMovies() {
    }
    
    public final void deleteAllFavoritesMovies() {
    }
}