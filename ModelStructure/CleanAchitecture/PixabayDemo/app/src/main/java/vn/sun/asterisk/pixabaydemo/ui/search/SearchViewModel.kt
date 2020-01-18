package vn.sun.asterisk.pixabaydemo.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import vn.sun.asterisk.domain.UseCase
import vn.sun.asterisk.domain.model.Photo
import vn.sun.asterisk.pixabaydemo.ui.base.BaseViewModel

internal class SearchViewModel(
    private val useCase: UseCase<String, List<Photo>>
) : BaseViewModel() {

    private val _photos = MutableLiveData<List<Photo>>()
    val photos: LiveData<List<Photo>> get() = _photos

    fun getPhotos(keyword: String) = with(viewModelScope) {
        _photos.value = useCase.execute(keyword)
    }
}
