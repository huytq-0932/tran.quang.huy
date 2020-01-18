package vn.sun.asterisk.pixabaydemo.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import vn.sun.asterisk.pixabaydemo.ui.main.MainViewModel
import vn.sun.asterisk.pixabaydemo.ui.search.SearchViewModel

val viewModelModule = module {

    viewModel {
        MainViewModel()
    }

    viewModel {
        SearchViewModel()
    }
}
