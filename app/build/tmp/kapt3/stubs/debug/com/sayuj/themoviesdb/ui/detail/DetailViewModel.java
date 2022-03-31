package com.sayuj.themoviesdb.ui.detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/sayuj/themoviesdb/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/sayuj/themoviesdb/domain/useCases/UseCases;", "(Lcom/sayuj/themoviesdb/domain/useCases/UseCases;)V", "theMovieDetail", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sayuj/themoviesdb/common/Resource;", "Lcom/sayuj/themoviesdb/domain/model/MovieDetail;", "getTheMovieDetail", "()Landroidx/lifecycle/MutableLiveData;", "addMovieDetailToFavorites", "", "movieDetail", "deleteMovieDetailFromFavorites", "getMovieDetail", "movieId", "", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.sayuj.themoviesdb.domain.useCases.UseCases useCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.sayuj.themoviesdb.common.Resource<com.sayuj.themoviesdb.domain.model.MovieDetail>> theMovieDetail = null;
    
    @javax.inject.Inject
    public DetailViewModel(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.UseCases useCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.sayuj.themoviesdb.common.Resource<com.sayuj.themoviesdb.domain.model.MovieDetail>> getTheMovieDetail() {
        return null;
    }
    
    public final void getMovieDetail(int movieId) {
    }
    
    public final void addMovieDetailToFavorites(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.model.MovieDetail movieDetail) {
    }
    
    public final void deleteMovieDetailFromFavorites(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.model.MovieDetail movieDetail) {
    }
}