package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import ru.iteco.fmhandroid.dto.NewsWithCategory

public data class CreateEditNewsFragmentArgs(
  public val newsItemArg: NewsWithCategory? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(NewsWithCategory::class.java)) {
      result.putParcelable("newsItemArg", this.newsItemArg as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(NewsWithCategory::class.java)) {
      result.putSerializable("newsItemArg", this.newsItemArg as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CreateEditNewsFragmentArgs {
      bundle.setClassLoader(CreateEditNewsFragmentArgs::class.java.classLoader)
      val __newsItemArg : NewsWithCategory?
      if (bundle.containsKey("newsItemArg")) {
        if (Parcelable::class.java.isAssignableFrom(NewsWithCategory::class.java) ||
            Serializable::class.java.isAssignableFrom(NewsWithCategory::class.java)) {
          __newsItemArg = bundle.get("newsItemArg") as NewsWithCategory?
        } else {
          throw UnsupportedOperationException(NewsWithCategory::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __newsItemArg = null
      }
      return CreateEditNewsFragmentArgs(__newsItemArg)
    }
  }
}
