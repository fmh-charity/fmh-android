package ru.iteco.fmh.data.impl

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import ru.iteco.fmh.data.AppAuth
import ru.iteco.fmh.model.AuthState
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.properties.Delegates

@Singleton
class AppAuthImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : AppAuth {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("auth", Context.MODE_PRIVATE)

    override var authState by Delegates.observable(
        createInitialAuthState()
    ) { _, _, authState ->
        with(prefs.edit()) {
            putString(ACCESS_TOKEN_KEY, authState?.accessToken)
            putString(REFRESH_TOKEN_KEY, authState?.refreshToken)
            apply()
        }
    }

    private fun createInitialAuthState(): AuthState? {
        val accessToken = prefs.getString(ACCESS_TOKEN_KEY, null) ?: return null
        val refreshToken = prefs.getString(REFRESH_TOKEN_KEY, null)
        checkNotNull(refreshToken) { "accessToken и refreshToken должны быть не null" }

        return AuthState(
            accessToken = accessToken,
            refreshToken = refreshToken
        )
    }

    private companion object {
        private const val ACCESS_TOKEN_KEY = "access"
        private const val REFRESH_TOKEN_KEY = "refresh"
    }
}
