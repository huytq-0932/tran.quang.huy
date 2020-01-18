package vn.sun.asterisk.remote.response

import com.google.gson.annotations.SerializedName
import vn.sun.asterisk.domain.model.MappableData
import vn.sun.asterisk.data.entity.PhotoEntity

data class PhotosResponse(
    @SerializedName("hits")
    val hits: List<Hit>
) : DataResponse() {

    data class Hit(
        @SerializedName("id")
        private val id: Int,
        @SerializedName("previewURL")
        private val url: String
    ) : DataResponse(), MappableData<PhotoEntity> {

        override fun map() = PhotoEntity(id, url)
    }
}
