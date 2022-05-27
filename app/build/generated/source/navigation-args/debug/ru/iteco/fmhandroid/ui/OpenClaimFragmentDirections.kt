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
import ru.iteco.fmhandroid.dto.ClaimComment
import ru.iteco.fmhandroid.dto.FullClaim
import ru.iteco.fmhandroid.dto.NewsFilterArgs

public class OpenClaimFragmentDirections private constructor() {
  private data class ActionOpenClaimFragmentToCreateEditClaimCommentFragment(
    public val argComment: ClaimComment? = null,
    public val argClaimId: Int
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_openClaimFragment_to_createEditClaimCommentFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(ClaimComment::class.java)) {
        result.putParcelable("argComment", this.argComment as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(ClaimComment::class.java)) {
        result.putSerializable("argComment", this.argComment as Serializable?)
      }
      result.putInt("argClaimId", this.argClaimId)
      return result
    }
  }

  private data class ActionOpenClaimFragmentToCreateEditClaimFragment(
    public val argClaim: FullClaim? = null
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_openClaimFragment_to_createEditClaimFragment

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

  private data class ActionOpenClaimFragmentToNewsListFragment(
    public val newsFilterArgs: NewsFilterArgs?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_openClaimFragment_to_newsListFragment

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
    public fun actionOpenClaimFragmentToCreateEditClaimCommentFragment(argComment: ClaimComment? =
        null, argClaimId: Int): NavDirections =
        ActionOpenClaimFragmentToCreateEditClaimCommentFragment(argComment, argClaimId)

    public fun actionOpenClaimFragmentToCreateEditClaimFragment(argClaim: FullClaim? = null):
        NavDirections = ActionOpenClaimFragmentToCreateEditClaimFragment(argClaim)

    public fun actionOpenClaimFragmentToAuthFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_openClaimFragment_to_authFragment)

    public fun actionOpenClaimFragmentToOurMissionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_openClaimFragment_to_our_mission_fragment)

    public fun actionOpenClaimFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_openClaimFragment_to_mainFragment)

    public fun actionOpenClaimFragmentToClaimListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_openClaimFragment_to_claimListFragment)

    public fun actionOpenClaimFragmentToNewsListFragment(newsFilterArgs: NewsFilterArgs?):
        NavDirections = ActionOpenClaimFragmentToNewsListFragment(newsFilterArgs)

    public fun actionOpenClaimFragmentToAboutFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_openClaimFragment_to_aboutFragment)
  }
}
