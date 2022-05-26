package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.dto.FullClaim

public class CreateEditClaimFragmentDirections private constructor() {
  private data class ActionCreateEditClaimFragmentToOpenClaimFragment(
    public val argClaim: FullClaim
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_createEditClaimFragment_to_openClaimFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionCreateEditClaimFragmentToOpenClaimFragment(argClaim: FullClaim): NavDirections
        = ActionCreateEditClaimFragmentToOpenClaimFragment(argClaim)
  }
}
