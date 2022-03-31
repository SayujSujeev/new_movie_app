package com.sayuj.themoviesdb.ui.home.tabLayoutPages.Popular;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/sayuj/themoviesdb/ui/home/tabLayoutPages/Popular/PopularViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/sayuj/themoviesdb/domain/useCases/UseCases;", "(Lcom/sayuj/themoviesdb/domain/useCases/UseCases;)V", "hasLoadingError", "", "getHasLoadingError", "()Z", "setHasLoadingError", "(Z)V", "resultPopular", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "getResultPopular", "()Lkotlinx/coroutines/flow/Flow;", "setResultPopular", "(Lkotlinx/coroutines/flow/Flow;)V", "app_debug"})
public final class PopularViewModel extends androidx.lifecycle.ViewModel {
    private final com.sayuj.themoviesdb.domain.useCases.UseCases useCases = null;
    private boolean hasLoadingError = false;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> resultPopular;
    
    @javax.inject.Inject
    public PopularViewModel(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.UseCases useCases) {
        super();
    }
    
    public final boolean getHasLoadingError() {
        return false;
    }
    
    public final void setHasLoadingError(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getResultPopular() {
        return null;
    }
    
    public final void setResultPopular(@org.jetbrains.annotations.Nullable
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> p0) {
    }
}