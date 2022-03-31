package com.sayuj.themoviesdb.data.localSource;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.sayuj.themoviesdb.data.TheMoviesDao;
import com.sayuj.themoviesdb.data.TheMoviesDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDataBase_Impl extends AppDataBase {
  private volatile TheMoviesDao _theMoviesDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `MovieDetail` (`id` INTEGER, `title` TEXT, `ratingCount` TEXT, `releaseDate` TEXT, `overview` TEXT, `genresString` TEXT, `posterImage` TEXT, `backdropImage` TEXT, `isFavorites` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Genre` (`id` INTEGER, `name` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd6b918293aa81dc57439edc6299e45cf')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `MovieDetail`");
        _db.execSQL("DROP TABLE IF EXISTS `Genre`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovieDetail = new HashMap<String, TableInfo.Column>(9);
        _columnsMovieDetail.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("ratingCount", new TableInfo.Column("ratingCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("genresString", new TableInfo.Column("genresString", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("posterImage", new TableInfo.Column("posterImage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("backdropImage", new TableInfo.Column("backdropImage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieDetail.put("isFavorites", new TableInfo.Column("isFavorites", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieDetail = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieDetail = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieDetail = new TableInfo("MovieDetail", _columnsMovieDetail, _foreignKeysMovieDetail, _indicesMovieDetail);
        final TableInfo _existingMovieDetail = TableInfo.read(_db, "MovieDetail");
        if (! _infoMovieDetail.equals(_existingMovieDetail)) {
          return new RoomOpenHelper.ValidationResult(false, "MovieDetail(com.sayuj.themoviesdb.domain.model.MovieDetail).\n"
                  + " Expected:\n" + _infoMovieDetail + "\n"
                  + " Found:\n" + _existingMovieDetail);
        }
        final HashMap<String, TableInfo.Column> _columnsGenre = new HashMap<String, TableInfo.Column>(2);
        _columnsGenre.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGenre.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGenre = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGenre = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGenre = new TableInfo("Genre", _columnsGenre, _foreignKeysGenre, _indicesGenre);
        final TableInfo _existingGenre = TableInfo.read(_db, "Genre");
        if (! _infoGenre.equals(_existingGenre)) {
          return new RoomOpenHelper.ValidationResult(false, "Genre(com.sayuj.themoviesdb.domain.model.Genre).\n"
                  + " Expected:\n" + _infoGenre + "\n"
                  + " Found:\n" + _existingGenre);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "d6b918293aa81dc57439edc6299e45cf", "1e79269fbbec6b2cc5a83b29473a7b18");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "MovieDetail","Genre");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `MovieDetail`");
      _db.execSQL("DELETE FROM `Genre`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TheMoviesDao.class, TheMoviesDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public TheMoviesDao getDao() {
    if (_theMoviesDao != null) {
      return _theMoviesDao;
    } else {
      synchronized(this) {
        if(_theMoviesDao == null) {
          _theMoviesDao = new TheMoviesDao_Impl(this);
        }
        return _theMoviesDao;
      }
    }
  }
}
