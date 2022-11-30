package ru.iteco.fmhandroid.repository.claimRepository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import ru.iteco.fmhandroid.api.ClaimApi
import ru.iteco.fmhandroid.dto.Claim
import ru.iteco.fmhandroid.exceptions.ApiException

class ClaimPageSource(
    private val service: ClaimApi
) : PagingSource<Int, Claim>() {

    override fun getRefreshKey(state: PagingState<Int, Claim>): Int? {
        val anchorPosition = state.anchorPosition ?: return null
        val page = state.closestPageToPosition(anchorPosition) ?: return null
        return page.prevKey?.plus(1) ?: page.nextKey?.minus(1)
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Claim> {
        try {
            val page = params.key ?: 1
            val pageSize: Int = params.loadSize.coerceAtMost(20)
            val response = service.getAllClaims(true, page, pageSize)

            return if (response.isSuccessful) {
                val claim = response.body()!!.claimList
                val nextPageNumber = if (claim.isEmpty()) null else page + 1
                val prevPageNumber = if (page > 1) page - 1 else null
                LoadResult.Page(claim, nextPageNumber, prevPageNumber)

            } else {
                LoadResult.Error(ApiException(response.code(), response.message()))
            }
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }
}