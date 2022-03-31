package com.sayuj.themoviesdb.data.localSource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sayuj.themoviesdb.data.TheMoviesDao
import com.sayuj.themoviesdb.domain.model.Genre
import com.sayuj.themoviesdb.domain.model.MovieDetail

@Database(
    entities = [MovieDetail::class, Genre::class],
    version = 2
)
abstract class AppDataBase : RoomDatabase() {
    abstract val dao: TheMoviesDao

    companion object {
        const val DATABASE_NAME = "THE_MOVIES_APP_DB"
    }
}