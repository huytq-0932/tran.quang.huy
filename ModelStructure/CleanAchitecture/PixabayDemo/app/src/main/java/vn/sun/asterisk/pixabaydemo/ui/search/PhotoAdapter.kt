package vn.sun.asterisk.pixabaydemo.ui.search

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_photo.view.*
import vn.sun.asterisk.domain.model.Photo
import vn.sun.asterisk.pixabaydemo.R
import vn.sun.asterisk.pixabaydemo.ui.base.BaseRecyclerAdapter
import vn.sun.asterisk.pixabaydemo.ui.base.BaseViewHolder

class PhotoAdapter :
    BaseRecyclerAdapter<Photo, PhotoAdapter.PhotoViewHolder>(PhotoDiffUtilCallback()) {

    override fun getItemLayoutResource(viewType: Int) = R.layout.item_photo

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PhotoViewHolder(
        itemView = getItemView(parent, viewType)
    )

    class PhotoViewHolder(itemView: View) : BaseViewHolder<Photo>(itemView) {

        override fun onBindData(itemData: Photo) {
            Glide.with(itemView).load(itemData.url).into(itemView.imageResult)
        }
    }

    class PhotoDiffUtilCallback : DiffUtil.ItemCallback<Photo>() {

        override fun areItemsTheSame(oldItem: Photo, newItem: Photo): Boolean = oldItem === newItem

        override fun areContentsTheSame(oldItem: Photo, newItem: Photo): Boolean =
            oldItem.id == newItem.id
    }
}
