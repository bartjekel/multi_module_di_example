package one.ffz.di.app

import android.app.Application
import one.ffz.di.calculation.dagger.CalculationComponent
import one.ffz.di.calculation.dagger.CalculationComponentProvider
import one.ffz.di.calculation.dagger.DaggerCalculationComponent
import one.ffz.di.calculation.koin.calculationModule
import one.ffz.di.screen.dagger.DaggerScreenComponent
import one.ffz.di.screen.dagger.ScreenComponent
import one.ffz.di.screen.dagger.ScreenComponentProvider
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application(), CalculationComponentProvider, ScreenComponentProvider {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(calculationModule)
        }
    }

    override fun calculationComponent(): CalculationComponent =
        DaggerCalculationComponent.builder().build()

    override fun screenComponent(): ScreenComponent =
        DaggerScreenComponent.builder().build()
}