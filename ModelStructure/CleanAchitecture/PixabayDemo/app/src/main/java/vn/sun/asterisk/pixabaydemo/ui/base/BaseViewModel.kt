package vn.sun.asterisk.pixabaydemo.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.core.KoinComponent
import kotlin.coroutines.CoroutineContext

internal abstract class BaseViewModel : ViewModel(), CoroutineScope, KoinComponent {

    private val _messageToast = MutableLiveData<String>()

    val messageToast: LiveData<String> get() = _messageToast

    override val coroutineContext: CoroutineContext get() = Dispatchers.Main

    open fun create() {
    }
}
