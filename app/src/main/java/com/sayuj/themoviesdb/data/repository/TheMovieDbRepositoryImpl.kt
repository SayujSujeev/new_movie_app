package com.sayuj.themoviesdb.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.sayuj.themoviesdb.common.Resource
import com.sayuj.themoviesdb.data.TheMoviesDao
import com.sayuj.themoviesdb.data.pagingDataSources.*
import com.sayuj.themoviesdb.data.remoteSource.TheMovieDatabaseAPI
import com.sayuj.themoviesdb.domain.model.Movie
import com.sayuj.themoviesdb.domain.model.MovieDetail
import com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class TheMovieDbRepositoryImpl(
    private val theMovieDatabaseAPI: TheMovieDatabaseAPI,
    private val dao: TheMoviesDao
) :
    TheMovieDbRepository {

    companion object {
        const val PAGE_SIZE = 20
    }

    override suspend fun getGenreNameById(genreId: Int): String {
        var genre = dao.getGenreNameById(genreId)
        if (genre == null) {
            val loadedGenres = theMovieDatabaseAPI.getGenreList()
            dao.insertServerGenres(loadedGenres.genres)
            genre = dao.getGenreNameById(genreId)
        }
        return genre?.name.toString()
    }

    override fun getMoviesNowPlaying(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(
                pageSize = PAGE_SIZE,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { NowPlayingMoviesPagingSource(theMovieDatabaseAPI) }
        ).flow
    }

    override fun getMoviesPopular(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(
                pageSize = PAGE_SIZE,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { PopularMoviesPagingSource(theMovieDatabaseAPI) }
        ).flow
    }

    override fun getMoviesTopRated(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(
                pageSize = PAGE_SIZE,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { TopRatedMoviesPagingSource(theMovieDatabaseAPI) }
        ).flow
    }

    override fun getMoviesUpcoming(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(
                pageSize = PAGE_SIZE,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { UpComingMoviesPagingSource(theMovieDatabaseAPI) }
        ).flow
    }

    override fun getMoviesOfSearchQuery(searchQuery: String): LiveData<PagingData<Movie>> {
        Log.d("RepositoryImpl ", "New query: $searchQuery")
        return Pager(
            config = PagingConfig(pageSize = PAGE_SIZE, enablePlaceholders = false),
            pagingSourceFactory = {
                GetMoviesOfSearchQueryPagingSource(
                    theMovieDatabaseAPI,
                    searchQuery
                )
            }
        ).liveData
    }

    override fun getMovieDetail(movieId: Int): Flow<Resource<MovieDetail>> = flow {
        emit(Resource.Loading()) // to start show the progress bar
        try {
            val movieDetail = theMovieDatabaseAPI.getMovieDetail(movieId)

            val isAddInTheFavorites = movieDetail.id?.let { dao.getMovieDetail(it) }

            emit(Resource.Success(movieDetail.toMovieDetail().apply {
                isFavorites = isAddInTheFavorites != null
            }))

        } catch (e: HttpException) {
            emit(
                Resource.Error(
                    message = "Oops, something went wrong!",
                )
            )
        } catch (e: IOException) {
            emit(
                Resource.Error(
                    message = "Couldn't reach server, check your internet connection.",
                )
            )
        }

    }

    override suspend fun addMovieToFavorites(movieDetail: MovieDetail) {
        dao.insertMovieDetail(movieDetail)
    }

    override suspend fun getMovieFromFavorites(movieId: Int) {
        dao.getMovieDetail(movieId)
    }

    override suspend fun deleteMovieFromFavorites(movieDetail: MovieDetail) {
        dao.deleteMovieDetail(movieDetail)
    }

    override suspend fun getAllFavoritesMovies(): Flow<List<Movie>> = flow {
        val theSavedMovies = dao.getAllMovies()
        val theMovieList = theSavedMovies.map { it.toMovie() }
        emit(theMovieList)
    }

    override suspend fun deleteAllFavoritesMovies() {
        dao.deleteAllMoviesDetail()
    }


}