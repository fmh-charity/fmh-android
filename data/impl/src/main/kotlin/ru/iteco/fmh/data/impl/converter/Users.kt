package ru.iteco.fmh.data.impl.converter

import ru.iteco.fmh.data.api.dto.UserDto
import ru.iteco.fmh.model.User

internal fun UserDto.toModel() = User(
    id = id,
    admin = admin,
    firstName = firstName,
    lastName = lastName,
    middleName = middleName,
)