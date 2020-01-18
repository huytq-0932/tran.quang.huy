package vn.sun.asterisk.domain.di

import org.koin.dsl.module
import vn.sun.asterisk.domain.UseCase
import vn.sun.asterisk.domain.model.Photo
import vn.sun.asterisk.domain.use.case.GetPhotosUseCase

val domainModule = module {
    single<UseCase<String, List<Photo>>> {
        GetPhotosUseCase(repository = get())
    }
}