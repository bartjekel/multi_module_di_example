package one.ffz.di.screen.dagger

import dagger.Component
import one.ffz.di.screen.ScreenDaggerActivity

@Component(modules = [ScreenDaggerModule::class])
interface ScreenComponent {
    fun inject(screenDaggerActivity: ScreenDaggerActivity)
}