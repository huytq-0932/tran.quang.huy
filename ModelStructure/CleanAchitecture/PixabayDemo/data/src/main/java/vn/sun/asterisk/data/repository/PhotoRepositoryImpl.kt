package vn.sun.asterisk.data.repository

import vn.sun.asterisk.data.datasource.PhotoDataSource
import vn.sun.asterisk.data.entity.PhotoEntity
import vn.sun.asterisk.domain.model.Photo
import vn.sun.asterisk.domain.repository.PhotoRepository

class PhotoRepositoryImpl(
    private val dataSource: PhotoDataSource
) : PhotoRepository {

    override suspend fun getImages(key: String): List<Photo> =
        dataSource.getPhotos(key).map(PhotoEntity::map)
}
