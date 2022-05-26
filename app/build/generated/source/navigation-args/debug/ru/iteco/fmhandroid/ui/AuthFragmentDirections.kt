package ru.iteco.fmhandroid.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import ru.iteco.fmhandroid.R

public class AuthFragmentDirections private constructor() {
  public companion object {
    public fun actionAuthFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_authFragment_to_mainFragment)
  }
}
