package vn.sun.asterisk.remote

import retrofit2.http.GET
import retrofit2.http.Query
import vn.sun.asterisk.remote.response.PhotosResponse

interface PixabayApi {

    @GET("/")
    fun getPhotosAsync(
        @Query("key") apiKey: String = ApiConfig.apiKey,
        @Query("q") keyword: String
    ): PhotosResponse
}
