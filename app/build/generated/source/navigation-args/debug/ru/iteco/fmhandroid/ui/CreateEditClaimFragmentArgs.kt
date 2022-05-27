package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import ru.iteco.fmhandroid.dto.FullClaim

public data class CreateEditClaimFragmentArgs(
  public val argClaim: FullClaim? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(FullClaim::class.java)) {
      result.putParcelable("argClaim", this.argClaim as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(FullClaim::class.java)) {
      result.putSerializable("argClaim", this.argClaim as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CreateEditClaimFragmentArgs {
      bundle.setClassLoader(CreateEditClaimFragmentArgs::class.java.classLoader)
      val __argClaim : FullClaim?
      if (bundle.containsKey("argClaim")) {
        if (Parcelable::class.java.isAssignableFrom(FullClaim::class.java) ||
            Serializable::class.java.isAssignableFrom(FullClaim::class.java)) {
          __argClaim = bundle.get("argClaim") as FullClaim?
        } else {
          throw UnsupportedOperationException(FullClaim::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __argClaim = null
      }
      return CreateEditClaimFragmentArgs(__argClaim)
    }
  }
}
