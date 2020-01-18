package vn.sun.asterisk.remote.di

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.converter.gson.GsonConverterFactory
import vn.sun.asterisk.common.ScopeNames
import vn.sun.asterisk.data.datasource.PhotoDataSource
import vn.sun.asterisk.remote.PixabayApi
import vn.sun.asterisk.remote.RemoteFactory
import vn.sun.asterisk.remote.datasource.PhotoRemoteDataSourceImpl

val remoteModule = module {
    single {
        RemoteFactory.buildRestApi(
            baseUrl = get(named(ScopeNames.API_KEY)), //This should be base url instead of api key
            restApi = PixabayApi::class.java,
            converterFactory = GsonConverterFactory.create(),
            callAdapterFactory = CoroutineCallAdapterFactory()
        )
    }

    single<PhotoDataSource> {
        PhotoRemoteDataSourceImpl(pixabayApi = get())
    }
}
