package one.ffz.di.calculation.dagger

import dagger.Module
import dagger.Provides
import one.ffz.di.calculation.Calculator
import one.ffz.di.calculation.GeneratedNumber

@Module
class CalculationDaggerModule {
    @Provides
    fun providesCalculator() : Calculator = Calculator()

    @Provides
    fun providesGeneratedNumber() : GeneratedNumber = GeneratedNumber()
}