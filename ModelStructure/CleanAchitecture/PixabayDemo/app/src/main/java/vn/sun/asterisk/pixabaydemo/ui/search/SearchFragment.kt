package vn.sun.asterisk.pixabaydemo.ui.search

import kotlinx.android.synthetic.main.search_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel
import vn.sun.asterisk.pixabaydemo.R
import vn.sun.asterisk.pixabaydemo.ui.base.BaseFragment

internal class SearchFragment private constructor() : BaseFragment<SearchViewModel>() {

    override val layoutResource: Int get() = R.layout.search_fragment

    override val viewModel: SearchViewModel by viewModel()

    private val adapter = PhotoAdapter()

    override fun initComponents() {
        recyclerPhotos.adapter = adapter
    }

    companion object {
        fun newInstance() = SearchFragment()
    }
}
