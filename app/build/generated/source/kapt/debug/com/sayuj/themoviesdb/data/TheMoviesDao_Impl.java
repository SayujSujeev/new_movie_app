package com.sayuj.themoviesdb.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.sayuj.themoviesdb.domain.model.Genre;
import com.sayuj.themoviesdb.domain.model.MovieDetail;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TheMoviesDao_Impl implements TheMoviesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieDetail> __insertionAdapterOfMovieDetail;

  private final EntityInsertionAdapter<Genre> __insertionAdapterOfGenre;

  private final EntityDeletionOrUpdateAdapter<MovieDetail> __deletionAdapterOfMovieDetail;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllMoviesDetail;

  public TheMoviesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieDetail = new EntityInsertionAdapter<MovieDetail>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MovieDetail` (`id`,`title`,`ratingCount`,`releaseDate`,`overview`,`genresString`,`posterImage`,`backdropImage`,`isFavorites`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieDetail value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getRatingCount() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRatingCount());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getReleaseDate());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOverview());
        }
        if (value.getGenresString() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGenresString());
        }
        if (value.getPosterImage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPosterImage());
        }
        if (value.getBackdropImage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getBackdropImage());
        }
        final int _tmp = value.isFavorites() ? 1 : 0;
        stmt.bindLong(9, _tmp);
      }
    };
    this.__insertionAdapterOfGenre = new EntityInsertionAdapter<Genre>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Genre` (`id`,`name`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Genre value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__deletionAdapterOfMovieDetail = new EntityDeletionOrUpdateAdapter<MovieDetail>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `MovieDetail` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieDetail value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllMoviesDetail = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM MovieDetail";
        return _query;
      }
    };
  }

  @Override
  public Object insertMovieDetail(final MovieDetail movieDetail,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieDetail.insert(movieDetail);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertServerGenres(final List<Genre> genreList,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGenre.insert(genreList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteMovieDetail(final MovieDetail movieDetail,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMovieDetail.handle(movieDetail);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllMoviesDetail(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllMoviesDetail.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllMoviesDetail.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getMovieDetail(final int movieId,
      final Continuation<? super MovieDetail> continuation) {
    final String _sql = "SELECT * from MovieDetail WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, movieId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<MovieDetail>() {
      @Override
      public MovieDetail call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfRatingCount = CursorUtil.getColumnIndexOrThrow(_cursor, "ratingCount");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenresString = CursorUtil.getColumnIndexOrThrow(_cursor, "genresString");
          final int _cursorIndexOfPosterImage = CursorUtil.getColumnIndexOrThrow(_cursor, "posterImage");
          final int _cursorIndexOfBackdropImage = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropImage");
          final int _cursorIndexOfIsFavorites = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorites");
          final MovieDetail _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpRatingCount;
            if (_cursor.isNull(_cursorIndexOfRatingCount)) {
              _tmpRatingCount = null;
            } else {
              _tmpRatingCount = _cursor.getString(_cursorIndexOfRatingCount);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpGenresString;
            if (_cursor.isNull(_cursorIndexOfGenresString)) {
              _tmpGenresString = null;
            } else {
              _tmpGenresString = _cursor.getString(_cursorIndexOfGenresString);
            }
            final String _tmpPosterImage;
            if (_cursor.isNull(_cursorIndexOfPosterImage)) {
              _tmpPosterImage = null;
            } else {
              _tmpPosterImage = _cursor.getString(_cursorIndexOfPosterImage);
            }
            final String _tmpBackdropImage;
            if (_cursor.isNull(_cursorIndexOfBackdropImage)) {
              _tmpBackdropImage = null;
            } else {
              _tmpBackdropImage = _cursor.getString(_cursorIndexOfBackdropImage);
            }
            final boolean _tmpIsFavorites;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorites);
            _tmpIsFavorites = _tmp != 0;
            _result = new MovieDetail(_tmpId,_tmpTitle,_tmpRatingCount,_tmpReleaseDate,_tmpOverview,_tmpGenresString,_tmpPosterImage,_tmpBackdropImage,_tmpIsFavorites);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllMovies(final Continuation<? super List<MovieDetail>> continuation) {
    final String _sql = "SELECT * from MovieDetail";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<MovieDetail>>() {
      @Override
      public List<MovieDetail> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfRatingCount = CursorUtil.getColumnIndexOrThrow(_cursor, "ratingCount");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfGenresString = CursorUtil.getColumnIndexOrThrow(_cursor, "genresString");
          final int _cursorIndexOfPosterImage = CursorUtil.getColumnIndexOrThrow(_cursor, "posterImage");
          final int _cursorIndexOfBackdropImage = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropImage");
          final int _cursorIndexOfIsFavorites = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorites");
          final List<MovieDetail> _result = new ArrayList<MovieDetail>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieDetail _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpRatingCount;
            if (_cursor.isNull(_cursorIndexOfRatingCount)) {
              _tmpRatingCount = null;
            } else {
              _tmpRatingCount = _cursor.getString(_cursorIndexOfRatingCount);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpGenresString;
            if (_cursor.isNull(_cursorIndexOfGenresString)) {
              _tmpGenresString = null;
            } else {
              _tmpGenresString = _cursor.getString(_cursorIndexOfGenresString);
            }
            final String _tmpPosterImage;
            if (_cursor.isNull(_cursorIndexOfPosterImage)) {
              _tmpPosterImage = null;
            } else {
              _tmpPosterImage = _cursor.getString(_cursorIndexOfPosterImage);
            }
            final String _tmpBackdropImage;
            if (_cursor.isNull(_cursorIndexOfBackdropImage)) {
              _tmpBackdropImage = null;
            } else {
              _tmpBackdropImage = _cursor.getString(_cursorIndexOfBackdropImage);
            }
            final boolean _tmpIsFavorites;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorites);
            _tmpIsFavorites = _tmp != 0;
            _item = new MovieDetail(_tmpId,_tmpTitle,_tmpRatingCount,_tmpReleaseDate,_tmpOverview,_tmpGenresString,_tmpPosterImage,_tmpBackdropImage,_tmpIsFavorites);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getGenreNameById(final int genreId,
      final Continuation<? super Genre> continuation) {
    final String _sql = "SELECT * from Genre WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, genreId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Genre>() {
      @Override
      public Genre call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final Genre _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _result = new Genre(_tmpId,_tmpName);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
