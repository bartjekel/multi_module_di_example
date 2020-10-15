package one.ffz.di.screen.dagger

import dagger.Module
import one.ffz.di.calculation.dagger.CalculationDaggerModule

@Module(includes = [CalculationDaggerModule::class])
class ScreenDaggerModule