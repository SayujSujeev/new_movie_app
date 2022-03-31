package com.sayuj.themoviesdb.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006("}, d2 = {"Lcom/sayuj/themoviesdb/ui/detail/DetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/sayuj/themoviesdb/databinding/FragmentDetailBinding;", "args", "Lcom/sayuj/themoviesdb/ui/detail/DetailFragmentArgs;", "getArgs", "()Lcom/sayuj/themoviesdb/ui/detail/DetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/sayuj/themoviesdb/databinding/FragmentDetailBinding;", "theMovieDetail", "Lcom/sayuj/themoviesdb/domain/model/MovieDetail;", "viewModel", "Lcom/sayuj/themoviesdb/ui/detail/DetailViewModel;", "getViewModel", "()Lcom/sayuj/themoviesdb/ui/detail/DetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fetchTheMovieDetail", "", "movieId", "", "(Ljava/lang/Integer;)V", "fillViewsFromMovie", "theMovie", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "fillViewsFromMovieDetail", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class DetailFragment extends androidx.fragment.app.Fragment {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.sayuj.themoviesdb.databinding.FragmentDetailBinding _binding;
    private com.sayuj.themoviesdb.domain.model.MovieDetail theMovieDetail;
    
    public DetailFragment() {
        super();
    }
    
    private final com.sayuj.themoviesdb.ui.detail.DetailFragmentArgs getArgs() {
        return null;
    }
    
    private final com.sayuj.themoviesdb.ui.detail.DetailViewModel getViewModel() {
        return null;
    }
    
    private final com.sayuj.themoviesdb.databinding.FragmentDetailBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void fetchTheMovieDetail(java.lang.Integer movieId) {
    }
    
    private final void fillViewsFromMovie(com.sayuj.themoviesdb.domain.model.Movie theMovie) {
    }
    
    private final void fillViewsFromMovieDetail(com.sayuj.themoviesdb.domain.model.MovieDetail theMovieDetail) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}