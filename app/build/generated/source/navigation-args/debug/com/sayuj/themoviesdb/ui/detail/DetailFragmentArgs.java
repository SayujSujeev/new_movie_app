package com.sayuj.themoviesdb.ui.detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.sayuj.themoviesdb.domain.model.Movie;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("SelectedMovie")) {
      Movie SelectedMovie;
      if (Parcelable.class.isAssignableFrom(Movie.class) || Serializable.class.isAssignableFrom(Movie.class)) {
        SelectedMovie = (Movie) bundle.get("SelectedMovie");
      } else {
        throw new UnsupportedOperationException(Movie.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (SelectedMovie == null) {
        throw new IllegalArgumentException("Argument \"SelectedMovie\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("SelectedMovie", SelectedMovie);
    } else {
      throw new IllegalArgumentException("Required argument \"SelectedMovie\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    if (savedStateHandle.contains("SelectedMovie")) {
      Movie SelectedMovie;
      SelectedMovie = savedStateHandle.get("SelectedMovie");
      if (SelectedMovie == null) {
        throw new IllegalArgumentException("Argument \"SelectedMovie\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("SelectedMovie", SelectedMovie);
    } else {
      throw new IllegalArgumentException("Required argument \"SelectedMovie\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Movie getSelectedMovie() {
    return (Movie) arguments.get("SelectedMovie");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("SelectedMovie")) {
      Movie SelectedMovie = (Movie) arguments.get("SelectedMovie");
      if (Parcelable.class.isAssignableFrom(Movie.class) || SelectedMovie == null) {
        __result.putParcelable("SelectedMovie", Parcelable.class.cast(SelectedMovie));
      } else if (Serializable.class.isAssignableFrom(Movie.class)) {
        __result.putSerializable("SelectedMovie", Serializable.class.cast(SelectedMovie));
      } else {
        throw new UnsupportedOperationException(Movie.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("SelectedMovie")) {
      Movie SelectedMovie = (Movie) arguments.get("SelectedMovie");
      if (Parcelable.class.isAssignableFrom(Movie.class) || SelectedMovie == null) {
        __result.set("SelectedMovie", Parcelable.class.cast(SelectedMovie));
      } else if (Serializable.class.isAssignableFrom(Movie.class)) {
        __result.set("SelectedMovie", Serializable.class.cast(SelectedMovie));
      } else {
        throw new UnsupportedOperationException(Movie.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("SelectedMovie") != that.arguments.containsKey("SelectedMovie")) {
      return false;
    }
    if (getSelectedMovie() != null ? !getSelectedMovie().equals(that.getSelectedMovie()) : that.getSelectedMovie() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getSelectedMovie() != null ? getSelectedMovie().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "SelectedMovie=" + getSelectedMovie()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Movie SelectedMovie) {
      if (SelectedMovie == null) {
        throw new IllegalArgumentException("Argument \"SelectedMovie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SelectedMovie", SelectedMovie);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setSelectedMovie(@NonNull Movie SelectedMovie) {
      if (SelectedMovie == null) {
        throw new IllegalArgumentException("Argument \"SelectedMovie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SelectedMovie", SelectedMovie);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Movie getSelectedMovie() {
      return (Movie) arguments.get("SelectedMovie");
    }
  }
}
