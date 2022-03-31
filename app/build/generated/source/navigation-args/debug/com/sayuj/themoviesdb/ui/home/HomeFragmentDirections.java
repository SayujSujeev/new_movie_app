package com.sayuj.themoviesdb.ui.home;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.sayuj.themoviesdb.R;
import com.sayuj.themoviesdb.domain.model.Movie;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToSearchFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_searchFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToFavoritesFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_favoritesFragment);
  }

  @NonNull
  public static ActionHomeFragmentToDetailFragment actionHomeFragmentToDetailFragment(
      @NonNull Movie SelectedMovie) {
    return new ActionHomeFragmentToDetailFragment(SelectedMovie);
  }

  public static class ActionHomeFragmentToDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToDetailFragment(@NonNull Movie SelectedMovie) {
      if (SelectedMovie == null) {
        throw new IllegalArgumentException("Argument \"SelectedMovie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SelectedMovie", SelectedMovie);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToDetailFragment setSelectedMovie(@NonNull Movie SelectedMovie) {
      if (SelectedMovie == null) {
        throw new IllegalArgumentException("Argument \"SelectedMovie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("SelectedMovie", SelectedMovie);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_detailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Movie getSelectedMovie() {
      return (Movie) arguments.get("SelectedMovie");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToDetailFragment that = (ActionHomeFragmentToDetailFragment) object;
      if (arguments.containsKey("SelectedMovie") != that.arguments.containsKey("SelectedMovie")) {
        return false;
      }
      if (getSelectedMovie() != null ? !getSelectedMovie().equals(that.getSelectedMovie()) : that.getSelectedMovie() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getSelectedMovie() != null ? getSelectedMovie().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToDetailFragment(actionId=" + getActionId() + "){"
          + "SelectedMovie=" + getSelectedMovie()
          + "}";
    }
  }
}
