package ru.iteco.fmhandroid.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import ru.iteco.fmhandroid.dto.FullWish
import ru.iteco.fmhandroid.dto.Wish
import ru.iteco.fmhandroid.entity.WishEntity

@Dao
interface WishDao {
    @Transaction
    @Query("SELECT * FROM WishEntity")
    suspend fun getAllWishes(): List<FullWish>

    @Transaction
    @Query(
        """
       SELECT * FROM WishEntity
       WHERE (status IN (:listStatuses))
       ORDER BY planExecuteDate ASC, createDate DESC
    """
    )
    fun getWishByStatus(
        listStatuses: List<Wish.Status>
    ): Flow<List<FullWish>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWish(wish: WishEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWish(wish: List<WishEntity>)

    @Transaction
    @Query("SELECT * FROM WishEntity WHERE id = :id")
    fun getWishById(id: Int): Flow<FullWish>

    @Query("DELETE FROM WishEntity WHERE id IN (:idList)")
    suspend fun removeWishItemsByIdList(idList: List<Int?>)
}

//class WishWishStatusConverter {
//    @TypeConverter
//    fun toWishStatus(status: String): Wish.Status = Wish.Status.valueOf(status)
//
//    @TypeConverter
//    fun fromWishStatus(status: Wish.Status) = status.name
//}