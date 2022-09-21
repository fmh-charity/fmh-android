package ru.iteco.fmh.core

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

object Utils {

    fun fromLocalDateTimeToTimeStamp(date: LocalDateTime): Long {
        return date.toEpochSecond(
            ZoneId.systemDefault()
                .rules.getOffset(Instant.now())
        )
    }
}