package vn.sun.asterisk.pixabaydemo.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

internal abstract class BaseActivity<VM : BaseViewModel> : AppCompatActivity() {

    @get:LayoutRes
    protected abstract val layoutResource: Int

    protected abstract val viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hideActionBar()
        setBindingVariables()
        initComponents()
        observeData()
    }
    private fun hideActionBar() = supportActionBar?.hide()

    protected open fun setBindingVariables(){
        viewModel.create()
    }

    protected abstract fun initComponents()

    protected abstract fun observeData()

    protected fun replaceFragment(id: Int, fragment: Fragment, addToBackStack: Boolean) =
        supportFragmentManager.beginTransaction().replace(id, fragment).apply {
            if (addToBackStack) addToBackStack(null)
        }.commit()
}