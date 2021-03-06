package vn.sun.asterisk.remote.datasource

import vn.sun.asterisk.data.datasource.PhotoDataSource
import vn.sun.asterisk.data.entity.PhotoEntity
import vn.sun.asterisk.remote.PixabayApi
import vn.sun.asterisk.remote.response.PhotosResponse

class PhotoRemoteDataSourceImpl(
    private val pixabayApi: PixabayApi
) : PhotoDataSource {

    override suspend fun getPhotos(key: String): List<PhotoEntity> =
        pixabayApi.getPhotos(keyword = key).hits.map(PhotosResponse.Hit::map).also{
            println("photos = $it")
        }
}
