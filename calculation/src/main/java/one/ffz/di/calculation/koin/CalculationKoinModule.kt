package one.ffz.di.calculation.koin

import one.ffz.di.calculation.Calculator
import one.ffz.di.calculation.GeneratedNumber
import org.koin.dsl.module

val calculationModule = module {
    single { Calculator() }

    factory { GeneratedNumber() }
}