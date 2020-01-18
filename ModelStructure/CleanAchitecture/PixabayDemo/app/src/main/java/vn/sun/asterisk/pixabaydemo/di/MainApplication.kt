package vn.sun.asterisk.pixabaydemo.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import vn.sun.asterisk.data.di.dataModule
import vn.sun.asterisk.domain.di.domainModule
import vn.sun.asterisk.remote.di.remoteModule

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(
                listOf(
                    appModule,
                    remoteModule,
                    dataModule,
                    domainModule,
                    viewModelModule
                )
            )
        }
    }
}
