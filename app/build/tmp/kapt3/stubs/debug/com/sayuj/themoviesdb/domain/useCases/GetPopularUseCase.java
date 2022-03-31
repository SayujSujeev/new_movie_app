package com.sayuj.themoviesdb.domain.useCases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0015\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/sayuj/themoviesdb/domain/useCases/GetPopularUseCase;", "", "repository", "Lcom/sayuj/themoviesdb/domain/repository/TheMovieDbRepository;", "(Lcom/sayuj/themoviesdb/domain/repository/TheMovieDbRepository;)V", "component1", "copy", "equals", "", "other", "hashCode", "", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "toString", "", "app_debug"})
public final class GetPopularUseCase {
    private final com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository repository = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetPopularUseCase copy(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository repository) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public GetPopularUseCase(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository repository) {
        super();
    }
    
    private final com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> invoke() {
        return null;
    }
}