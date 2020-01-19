package vn.sun.asterisk.remote

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query
import vn.sun.asterisk.remote.response.PhotosResponse

interface PixabayApi {

    @GET("/")
    suspend fun getPhotosAsync(
        @Query("key") apiKey: String = ApiConfig.apiKey,
        @Query("q") keyword: String
    ): Deferred<PhotosResponse>
}
