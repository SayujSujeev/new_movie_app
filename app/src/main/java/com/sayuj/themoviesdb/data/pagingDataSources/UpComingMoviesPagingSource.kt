package com.sayuj.themoviesdb.data.pagingDataSources

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.sayuj.themoviesdb.common.STARTING_PAGE_INDEX
import com.sayuj.themoviesdb.data.remoteSource.TheMovieDatabaseAPI
import com.sayuj.themoviesdb.domain.model.Movie
import retrofit2.HttpException
import java.io.IOException

class UpComingMoviesPagingSource(private val service: TheMovieDatabaseAPI) :
    PagingSource<Int, Movie>() {

    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        val position = params.key ?: STARTING_PAGE_INDEX
        return try {
            val response = service.getUpcomingMovies(position)
            val moviesDto = response.movieDtos
            val movies = moviesDto.map {
                it.toMovie()
            }
            val nextKey = if (movies.isEmpty()) {
                null
            } else {
                position + 1
            }
            LoadResult.Page(
                data = movies,
                prevKey = if (position == STARTING_PAGE_INDEX) null else position - 1,
                nextKey = nextKey
            )
        } catch (exception: IOException) {
            val error = IOException("Please check the internet connection")
            return LoadResult.Error(error)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }
}