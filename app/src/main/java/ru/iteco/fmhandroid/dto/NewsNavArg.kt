package ru.iteco.fmhandroid.dto

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.TypeParceler
import ru.iteco.fmh.model.News

@Parcelize
class NewsNavArg(
    @TypeParceler<News, Companion> val news: News
) : Parcelable {

    private companion object : Parceler<News> {
        override fun create(parcel: Parcel) = with(parcel) {
            News(
                id = readInt(),
                newsCategoryId = readInt(),
                title = requireNotNull(readString()) {
                    "`News.title should be not null`"
                },
                description = requireNotNull(readString()) {
                    "`News.description should be not null`"
                },
                creatorId = readInt(),
                creatorName = requireNotNull(readString()) {
                    "`News.creatorName should be not null`"
                },
                createDate = readLong(),
                publishDate = readLong(),
                publishEnabled = readInt() != FALSE_INT,
                isOpen = readInt() != FALSE_INT,
            )
        }

        override fun News.write(parcel: Parcel, flags: Int) = with(parcel) {
            writeInt(id ?: 0)
            writeInt(newsCategoryId)
            writeString(title)
            writeString(description)
            writeInt(creatorId)
            writeString(creatorName)
            writeLong(createDate)
            writeLong(publishDate)
            writeInt(if (publishEnabled) 1 else FALSE_INT)
            writeInt(if (isOpen) 1 else FALSE_INT)
        }

        private const val FALSE_INT = 0
    }
}