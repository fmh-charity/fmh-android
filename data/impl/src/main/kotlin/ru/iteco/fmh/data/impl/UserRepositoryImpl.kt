package ru.iteco.fmh.data.impl

import retrofit2.Response
import ru.iteco.fmh.data.UserRepository
import ru.iteco.fmh.data.api.UserApi
import ru.iteco.fmh.data.impl.exception.AuthorizationException
import ru.iteco.fmh.data.impl.exception.UnknownException
import ru.iteco.fmh.data.impl.util.makeRequest
import ru.iteco.fmh.model.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor(
    private val userApi: UserApi
) : UserRepository {

    override var currentUser: User = EMPTY_USER
        private set

    override var userList: List<User> = emptyList()
        private set

    override suspend fun getUserInfo() {
        try {
            val response: Response<User> = userApi.getUserInfo()
            if (!response.isSuccessful && response.code() == 401) {
                throw AuthorizationException
            }
            currentUser = response.body() ?: throw UnknownException
        } catch (e: AuthorizationException) {
            throw AuthorizationException
        } catch (e: Exception) {
            throw UnknownException
        }
    }

    override suspend fun getAllUsers(): List<User> =
        makeRequest(
            request = { userApi.getAllUsers() },
            onSuccess = { body ->
                body.also {
                    userList = it
                }
            }
        )

    override fun userLogOut() {
        currentUser = EMPTY_USER
    }

    private companion object {
        private val EMPTY_USER = User(
            id = 0,
            admin = false,
            firstName = "",
            lastName = "",
            middleName = "",
        )
    }
}
