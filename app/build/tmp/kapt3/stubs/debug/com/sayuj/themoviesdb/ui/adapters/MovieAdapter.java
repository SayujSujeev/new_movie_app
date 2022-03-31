package com.sayuj.themoviesdb.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/sayuj/themoviesdb/ui/adapters/MovieAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "Lcom/sayuj/themoviesdb/ui/adapters/MovieAdapter$MovieViewHolder;", "selectedMovie", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MovieViewHolder", "app_debug"})
public final class MovieAdapter extends androidx.paging.PagingDataAdapter<com.sayuj.themoviesdb.domain.model.Movie, com.sayuj.themoviesdb.ui.adapters.MovieAdapter.MovieViewHolder> {
    private final kotlin.jvm.functions.Function1<com.sayuj.themoviesdb.domain.model.Movie, kotlin.Unit> selectedMovie = null;
    @org.jetbrains.annotations.NotNull
    public static final com.sayuj.themoviesdb.ui.adapters.MovieAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.sayuj.themoviesdb.domain.model.Movie> MOVIE_COMPARATOR = null;
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.sayuj.themoviesdb.domain.model.Movie, kotlin.Unit> selectedMovie) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.sayuj.themoviesdb.ui.adapters.MovieAdapter.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.ui.adapters.MovieAdapter.MovieViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/sayuj/themoviesdb/ui/adapters/MovieAdapter$MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sayuj/themoviesdb/databinding/ItemMovieBinding;", "(Lcom/sayuj/themoviesdb/databinding/ItemMovieBinding;)V", "getBinding", "()Lcom/sayuj/themoviesdb/databinding/ItemMovieBinding;", "bind", "", "movie", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "showMovieData", "app_debug"})
    public static final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.sayuj.themoviesdb.databinding.ItemMovieBinding binding = null;
        
        public MovieViewHolder(@org.jetbrains.annotations.NotNull
        com.sayuj.themoviesdb.databinding.ItemMovieBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.sayuj.themoviesdb.databinding.ItemMovieBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable
        com.sayuj.themoviesdb.domain.model.Movie movie) {
        }
        
        private final void showMovieData(com.sayuj.themoviesdb.domain.model.Movie movie) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/sayuj/themoviesdb/ui/adapters/MovieAdapter$Companion;", "", "()V", "MOVIE_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}