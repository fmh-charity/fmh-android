package ru.iteco.fmh.data

import ru.iteco.fmh.model.User

interface UserRepository {
    val currentUser: User
    val userList: List<User>
    suspend fun getAllUsers(): List<User>
    suspend fun getUserInfo()
    fun userLogOut()
}