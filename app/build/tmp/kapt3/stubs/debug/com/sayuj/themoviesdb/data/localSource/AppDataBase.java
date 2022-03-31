package com.sayuj.themoviesdb.data.localSource;

import java.lang.System;

@androidx.room.Database(entities = {com.sayuj.themoviesdb.domain.model.MovieDetail.class, com.sayuj.themoviesdb.domain.model.Genre.class}, version = 2)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/sayuj/themoviesdb/data/localSource/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "dao", "Lcom/sayuj/themoviesdb/data/TheMoviesDao;", "getDao", "()Lcom/sayuj/themoviesdb/data/TheMoviesDao;", "Companion", "app_debug"})
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.sayuj.themoviesdb.data.localSource.AppDataBase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATABASE_NAME = "THE_MOVIES_APP_DB";
    
    public AppDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.sayuj.themoviesdb.data.TheMoviesDao getDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/sayuj/themoviesdb/data/localSource/AppDataBase$Companion;", "", "()V", "DATABASE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}