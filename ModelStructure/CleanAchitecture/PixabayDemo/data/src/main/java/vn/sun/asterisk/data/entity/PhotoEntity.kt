package vn.sun.asterisk.data.entity

import vn.sun.asterisk.domain.model.MappableData
import vn.sun.asterisk.domain.model.Photo

data class PhotoEntity(
    private val id: Int,
    private val url: String
) : Entity(), MappableData<Photo> {

    override fun map() = Photo(id, url)
}
