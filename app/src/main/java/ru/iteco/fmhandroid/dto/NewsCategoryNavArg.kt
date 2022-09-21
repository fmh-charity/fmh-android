package ru.iteco.fmhandroid.dto

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.TypeParceler
import ru.iteco.fmh.model.News

@Parcelize
class NewsCategoryNavArg(
    @TypeParceler<News.Category, Companion> val category: News.Category
) : Parcelable {

    private companion object : Parceler<News.Category> {

        override fun create(parcel: Parcel) = with(parcel) {
            News.Category(
                id = readInt(),
                name = requireNotNull(readString()) {
                    "`News.Category.name should be not null`"
                },
                deleted = readInt() != FALSE_INT
            )
        }

        override fun News.Category.write(parcel: Parcel, flags: Int) = with(parcel) {
            writeInt(id)
            writeString(name)
            writeInt(if (deleted) 1 else FALSE_INT)
        }

        private const val FALSE_INT = 0
    }
}