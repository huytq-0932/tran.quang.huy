package vn.sun.asterisk.remote.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import vn.sun.asterisk.data.entity.PhotoEntity
import vn.sun.asterisk.domain.model.MappableData

data class PhotosResponse(
    @SerializedName("hits")
    @Expose
    val hits: List<Hit>
) : DataResponse() {

    data class Hit(
        @SerializedName("id")
        @Expose
        val id: Int,
        @SerializedName("webformatURL")
        @Expose
        val url: String
    ) : DataResponse(), MappableData<PhotoEntity> {

        override fun map() = PhotoEntity(id, url)
    }
}
