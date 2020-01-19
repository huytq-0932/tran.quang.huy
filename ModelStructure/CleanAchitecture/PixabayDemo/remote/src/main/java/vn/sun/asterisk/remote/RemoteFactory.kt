package vn.sun.asterisk.remote

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal object RemoteFactory {

    fun <T> buildRestApi(
        baseUrl: String,
        restApi: Class<T>,
        converterFactory: GsonConverterFactory,
        callAdapterFactory: CoroutineCallAdapterFactory
    ): T {
        val httpClient = OkHttpClient.Builder()
        val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        httpClient.interceptors().add(interceptor)

        return Retrofit.Builder().baseUrl(baseUrl)
            .client(httpClient.build())
            .addConverterFactory(converterFactory)
            .addCallAdapterFactory(callAdapterFactory)
            .build()
            .create(restApi)
    }
}
