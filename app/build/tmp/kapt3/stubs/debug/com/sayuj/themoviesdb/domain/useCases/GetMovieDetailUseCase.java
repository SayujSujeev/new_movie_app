package com.sayuj.themoviesdb.domain.useCases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/sayuj/themoviesdb/domain/useCases/GetMovieDetailUseCase;", "", "repository", "Lcom/sayuj/themoviesdb/domain/repository/TheMovieDbRepository;", "(Lcom/sayuj/themoviesdb/domain/repository/TheMovieDbRepository;)V", "getRepository", "()Lcom/sayuj/themoviesdb/domain/repository/TheMovieDbRepository;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/sayuj/themoviesdb/common/Resource;", "Lcom/sayuj/themoviesdb/domain/model/MovieDetail;", "movieId", "", "app_debug"})
public final class GetMovieDetailUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository repository = null;
    
    public GetMovieDetailUseCase(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.sayuj.themoviesdb.common.Resource<com.sayuj.themoviesdb.domain.model.MovieDetail>> invoke(int movieId) {
        return null;
    }
}