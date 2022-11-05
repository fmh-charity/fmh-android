package ru.iteco.fmhandroid.dto

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Relation
import ru.iteco.fmhandroid.entity.WishCommentEntity


@kotlinx.parcelize.Parcelize
    data class FullWish(
        @Embedded
        val wish: Wish,

        @Relation(
            entity = WishCommentEntity::class,
            parentColumn = "id",
            entityColumn = "wishId"
        )
        val comments: List<WishComment>?
    ) : Parcelable
