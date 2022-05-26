package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import ru.iteco.fmhandroid.dto.NewsFilterArgs

public data class NewsListFragmentArgs(
  public val newsFilterArgs: NewsFilterArgs?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(NewsFilterArgs::class.java)) {
      result.putParcelable("newsFilterArgs", this.newsFilterArgs as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(NewsFilterArgs::class.java)) {
      result.putSerializable("newsFilterArgs", this.newsFilterArgs as Serializable?)
    } else {
      throw UnsupportedOperationException(NewsFilterArgs::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): NewsListFragmentArgs {
      bundle.setClassLoader(NewsListFragmentArgs::class.java.classLoader)
      val __newsFilterArgs : NewsFilterArgs?
      if (bundle.containsKey("newsFilterArgs")) {
        if (Parcelable::class.java.isAssignableFrom(NewsFilterArgs::class.java) ||
            Serializable::class.java.isAssignableFrom(NewsFilterArgs::class.java)) {
          __newsFilterArgs = bundle.get("newsFilterArgs") as NewsFilterArgs?
        } else {
          throw UnsupportedOperationException(NewsFilterArgs::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"newsFilterArgs\" is missing and does not have an android:defaultValue")
      }
      return NewsListFragmentArgs(__newsFilterArgs)
    }
  }
}
