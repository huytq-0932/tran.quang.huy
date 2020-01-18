package vn.sun.asterisk.pixabaydemo.di

import org.koin.core.qualifier.named
import org.koin.dsl.module
import vn.sun.asterisk.pixabaydemo.BuildConfig

val appModule = module {
    single(named("tag_api_key")) {
        BuildConfig.PIXABAY_API_KEY
    }
}
