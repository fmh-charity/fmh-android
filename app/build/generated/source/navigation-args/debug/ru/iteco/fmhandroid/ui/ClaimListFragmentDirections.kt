package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.dto.FullClaim
import ru.iteco.fmhandroid.dto.NewsFilterArgs

public class ClaimListFragmentDirections private constructor() {
  private data class ActionClaimListFragmentToOpenClaimFragment(
    public val argClaim: FullClaim
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_claimListFragment_to_openClaimFragment

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

  private data class ActionClaimListFragmentToCreateEditClaimFragment(
    public val argClaim: FullClaim? = null
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_claimListFragment_to_createEditClaimFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(FullClaim::class.java)) {
        result.putParcelable("argClaim", this.argClaim as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(FullClaim::class.java)) {
        result.putSerializable("argClaim", this.argClaim as Serializable?)
      }
      return result
    }
  }

  private data class ActionClaimListFragmentToNewsListFragment(
    public val newsFilterArgs: NewsFilterArgs?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_claimListFragment_to_newsListFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionClaimListFragmentToOpenClaimFragment(argClaim: FullClaim): NavDirections =
        ActionClaimListFragmentToOpenClaimFragment(argClaim)

    public fun actionClaimListFragmentToCreateEditClaimFragment(argClaim: FullClaim? = null):
        NavDirections = ActionClaimListFragmentToCreateEditClaimFragment(argClaim)

    public fun actionClaimListFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_claimListFragment_to_mainFragment)

    public fun actionClaimListFragmentToNewsListFragment(newsFilterArgs: NewsFilterArgs?):
        NavDirections = ActionClaimListFragmentToNewsListFragment(newsFilterArgs)

    public fun actionClaimListFragmentToAuthFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_claimListFragment_to_authFragment)

    public fun actionClaimListFragmentToAboutFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_claimListFragment_to_aboutFragment)

    public fun actionClaimListFragmentToOurMissionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_claimListFragment_to_our_mission_fragment)
  }
}
