package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import ru.iteco.fmhandroid.dto.ClaimComment

public data class CreateEditClaimCommentFragmentArgs(
  public val argComment: ClaimComment? = null,
  public val argClaimId: Int
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ClaimComment::class.java)) {
      result.putParcelable("argComment", this.argComment as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(ClaimComment::class.java)) {
      result.putSerializable("argComment", this.argComment as Serializable?)
    }
    result.putInt("argClaimId", this.argClaimId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CreateEditClaimCommentFragmentArgs {
      bundle.setClassLoader(CreateEditClaimCommentFragmentArgs::class.java.classLoader)
      val __argComment : ClaimComment?
      if (bundle.containsKey("argComment")) {
        if (Parcelable::class.java.isAssignableFrom(ClaimComment::class.java) ||
            Serializable::class.java.isAssignableFrom(ClaimComment::class.java)) {
          __argComment = bundle.get("argComment") as ClaimComment?
        } else {
          throw UnsupportedOperationException(ClaimComment::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __argComment = null
      }
      val __argClaimId : Int
      if (bundle.containsKey("argClaimId")) {
        __argClaimId = bundle.getInt("argClaimId")
      } else {
        throw IllegalArgumentException("Required argument \"argClaimId\" is missing and does not have an android:defaultValue")
      }
      return CreateEditClaimCommentFragmentArgs(__argComment, __argClaimId)
    }
  }
}
