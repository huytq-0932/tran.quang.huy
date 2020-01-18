package vn.sun.asterisk.domain.repository

import vn.sun.asterisk.domain.model.Photo

interface PhotoRepository : Repository {
    fun getImages(key: String): List<Photo>
}