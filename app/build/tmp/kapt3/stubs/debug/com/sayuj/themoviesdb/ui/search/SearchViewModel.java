package com.sayuj.themoviesdb.ui.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/sayuj/themoviesdb/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/sayuj/themoviesdb/domain/useCases/UseCases;", "(Lcom/sayuj/themoviesdb/domain/useCases/UseCases;)V", "currentQuery", "Landroidx/lifecycle/MutableLiveData;", "", "result", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "getResult", "()Landroidx/lifecycle/LiveData;", "getMoviesOfSearchQuery", "", "searchQuery", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.sayuj.themoviesdb.domain.useCases.UseCases useCases = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> currentQuery = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> result = null;
    
    @javax.inject.Inject
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.UseCases useCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getResult() {
        return null;
    }
    
    public final void getMoviesOfSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
    }
}