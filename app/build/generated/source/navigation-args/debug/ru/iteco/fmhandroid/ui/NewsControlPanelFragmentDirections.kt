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
import ru.iteco.fmhandroid.`enum`.FragmentsTags
import ru.iteco.fmhandroid.dto.NewsFilterArgs
import ru.iteco.fmhandroid.dto.NewsWithCategory

public class NewsControlPanelFragmentDirections private constructor() {
  private data class ActionNewsControlPanelFragmentToFilterNewsFragment(
    public val fragmentName: FragmentsTags
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_newsControlPanelFragment_to_filterNewsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(FragmentsTags::class.java)) {
        result.putParcelable("fragmentName", this.fragmentName as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(FragmentsTags::class.java)) {
        result.putSerializable("fragmentName", this.fragmentName as Serializable)
      } else {
        throw UnsupportedOperationException(FragmentsTags::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  private data class ActionNewsControlPanelFragmentToCreateEditNewsFragment(
    public val newsItemArg: NewsWithCategory? = null
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_newsControlPanelFragment_to_createEditNewsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(NewsWithCategory::class.java)) {
        result.putParcelable("newsItemArg", this.newsItemArg as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(NewsWithCategory::class.java)) {
        result.putSerializable("newsItemArg", this.newsItemArg as Serializable?)
      }
      return result
    }
  }

  private data class ActionNewsControlPanelFragmentToNewsListFragment(
    public val newsFilterArgs: NewsFilterArgs?
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_newsControlPanelFragment_to_newsListFragment

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
    public fun actionNewsControlPanelFragmentToFilterNewsFragment(fragmentName: FragmentsTags):
        NavDirections = ActionNewsControlPanelFragmentToFilterNewsFragment(fragmentName)

    public fun actionNewsControlPanelFragmentToCreateEditNewsFragment(newsItemArg: NewsWithCategory?
        = null): NavDirections = ActionNewsControlPanelFragmentToCreateEditNewsFragment(newsItemArg)

    public fun actionNewsControlPanelFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsControlPanelFragment_to_mainFragment)

    public fun actionNewsControlPanelFragmentToClaimListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsControlPanelFragment_to_claimListFragment)

    public fun actionNewsControlPanelFragmentToNewsListFragment(newsFilterArgs: NewsFilterArgs?):
        NavDirections = ActionNewsControlPanelFragmentToNewsListFragment(newsFilterArgs)

    public fun actionNewsControlPanelFragmentToAuthFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsControlPanelFragment_to_authFragment)

    public fun actionNewsControlPanelFragmentToAboutFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsControlPanelFragment_to_aboutFragment)

    public fun actionNewsControlPanelFragmentToOurMissionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsControlPanelFragment_to_our_mission_fragment)
  }
}
