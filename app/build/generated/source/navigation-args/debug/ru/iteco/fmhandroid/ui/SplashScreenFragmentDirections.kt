package ru.iteco.fmhandroid.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import ru.iteco.fmhandroid.R

public class SplashScreenFragmentDirections private constructor() {
  public companion object {
    public fun actionSplashScreenFragmentToAuthFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreenFragment_to_authFragment)

    public fun actionSplashScreenFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreenFragment_to_mainFragment)
  }
}
