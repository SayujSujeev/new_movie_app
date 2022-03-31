package com.sayuj.themoviesdb.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/sayuj/themoviesdb/di/AppModule;", "", "()V", "providesAppDataBase", "Lcom/sayuj/themoviesdb/data/localSource/AppDataBase;", "app", "Landroid/app/Application;", "providesOkHttpClient", "Lcom/sayuj/themoviesdb/data/remoteSource/CustomOkHttpClient;", "providesTheMovieDatabaseAPI", "Lcom/sayuj/themoviesdb/data/remoteSource/TheMovieDatabaseAPI;", "customOkHttpClient", "providesTheRepository", "Lcom/sayuj/themoviesdb/domain/repository/TheMovieDbRepository;", "appDataBase", "api", "providesTheUseCases", "Lcom/sayuj/themoviesdb/domain/useCases/UseCases;", "repository", "app_debug"})
@dagger.Module
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.sayuj.themoviesdb.data.localSource.AppDataBase providesAppDataBase(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.sayuj.themoviesdb.data.remoteSource.CustomOkHttpClient providesOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.sayuj.themoviesdb.data.remoteSource.TheMovieDatabaseAPI providesTheMovieDatabaseAPI(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.data.remoteSource.CustomOkHttpClient customOkHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository providesTheRepository(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.data.localSource.AppDataBase appDataBase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.data.remoteSource.TheMovieDatabaseAPI api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.sayuj.themoviesdb.domain.useCases.UseCases providesTheUseCases(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository repository) {
        return null;
    }
}