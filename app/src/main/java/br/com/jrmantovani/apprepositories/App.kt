package br.com.jrmantovani.apprepositories

import android.app.Application
import br.com.jrmantovani.apprepositories.data.di.DataModule
import br.com.jrmantovani.apprepositories.domain.di.DomainModule
import br.com.jrmantovani.apprepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }
        DataModule.load()
        DomainModule.load()
        PresentationModule.load()

    }
}