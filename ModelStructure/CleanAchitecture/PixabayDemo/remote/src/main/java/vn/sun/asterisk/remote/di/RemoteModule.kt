package vn.sun.asterisk.remote.di

import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.converter.gson.GsonConverterFactory
import vn.sun.asterisk.common.ScopeNames
import vn.sun.asterisk.data.datasource.PhotoDataSource
import vn.sun.asterisk.remote.ApiConfig
import vn.sun.asterisk.remote.PixabayApi
import vn.sun.asterisk.remote.RemoteFactory
import vn.sun.asterisk.remote.datasource.PhotoRemoteDataSourceImpl

val remoteModule = module {
    single {
        ApiConfig.apiKey = get(named(ScopeNames.API_KEY))
        RemoteFactory.buildRestApi(
            baseUrl = ApiConfig.BASE_URL,
            restApi = PixabayApi::class.java,
            converterFactory = GsonConverterFactory.create(GsonBuilder().setLenient().create()),
            callAdapterFactory = CoroutineCallAdapterFactory()
        )
    }

    single<PhotoDataSource> {
        PhotoRemoteDataSourceImpl(pixabayApi = get())
    }
}
