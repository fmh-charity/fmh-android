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

public class NewsListFragmentDirections private constructor() {
  private data class ActionNewsListFragmentToNewsControlPanelFragment(
    public val newsFilterArgs: NewsFilterArgs?
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_newsListFragment_to_newsControlPanelFragment

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

  private data class ActionNewsListFragmentToFilterNewsFragment(
    public val fragmentName: FragmentsTags
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_newsListFragment_to_filterNewsFragment

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

  public companion object {
    public fun actionNewsListFragmentToNewsControlPanelFragment(newsFilterArgs: NewsFilterArgs?):
        NavDirections = ActionNewsListFragmentToNewsControlPanelFragment(newsFilterArgs)

    public fun actionNewsListFragmentToFilterNewsFragment(fragmentName: FragmentsTags):
        NavDirections = ActionNewsListFragmentToFilterNewsFragment(fragmentName)

    public fun actionNewsListFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsListFragment_to_mainFragment)

    public fun actionNewsListFragmentToClaimListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsListFragment_to_claimListFragment)

    public fun actionNewsListFragmentToAuthFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsListFragment_to_authFragment)

    public fun actionNewsListFragmentToAboutFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsListFragment_to_aboutFragment)

    public fun actionNewsListFragmentToOurMissionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsListFragment_to_our_mission_fragment)
  }
}
