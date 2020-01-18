package vn.sun.asterisk.data.di

import org.koin.dsl.module
import vn.sun.asterisk.data.repository.PhotoRepositoryImpl
import vn.sun.asterisk.domain.repository.PhotoRepository

val dataModule = module {
    single<PhotoRepository> {
        PhotoRepositoryImpl(dataSource = get())
    }

}
