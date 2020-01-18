package vn.sun.asterisk.data.datasource

import vn.sun.asterisk.data.entity.PhotoEntity

interface PhotoDataSource : DataSource {

    fun getPhotos(key: String): List<PhotoEntity>
}
