package vn.sun.asterisk.pixabaydemo.ui.main

import org.koin.android.viewmodel.ext.android.viewModel
import vn.sun.asterisk.pixabaydemo.R
import vn.sun.asterisk.pixabaydemo.ui.base.BaseActivity
import vn.sun.asterisk.pixabaydemo.ui.search.SearchFragment

internal class MainActivity : BaseActivity<MainViewModel>() {

    override val layoutResource: Int get() = R.layout.activity_main

    override val viewModel: MainViewModel by viewModel()

    override fun initComponents() {
        replaceFragment(R.id.frameMain, SearchFragment.newInstance(), true)
    }

    override fun observeData() {

    }
}
