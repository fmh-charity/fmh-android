package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import ru.iteco.fmhandroid.dto.FullClaim

public data class OpenClaimFragmentArgs(
  public val argClaim: FullClaim
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(FullClaim::class.java)) {
      result.putParcelable("argClaim", this.argClaim as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(FullClaim::class.java)) {
      result.putSerializable("argClaim", this.argClaim as Serializable)
    } else {
      throw UnsupportedOperationException(FullClaim::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): OpenClaimFragmentArgs {
      bundle.setClassLoader(OpenClaimFragmentArgs::class.java.classLoader)
      val __argClaim : FullClaim?
      if (bundle.containsKey("argClaim")) {
        if (Parcelable::class.java.isAssignableFrom(FullClaim::class.java) ||
            Serializable::class.java.isAssignableFrom(FullClaim::class.java)) {
          __argClaim = bundle.get("argClaim") as FullClaim?
        } else {
          throw UnsupportedOperationException(FullClaim::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__argClaim == null) {
          throw IllegalArgumentException("Argument \"argClaim\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"argClaim\" is missing and does not have an android:defaultValue")
      }
      return OpenClaimFragmentArgs(__argClaim)
    }
  }
}
