package one.ffz.di.screen

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.screen_main.*
import one.ffz.di.calculation.Calculator
import one.ffz.di.calculation.GeneratedNumber
import one.ffz.di.screen.dagger.ScreenComponentProvider
import javax.inject.Inject
import javax.inject.Provider

class ScreenDaggerActivity : AppCompatActivity() {
    @Inject
    lateinit var calculator: Calculator

    @Inject
    lateinit var generatedNumber: Provider<GeneratedNumber>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext as ScreenComponentProvider).screenComponent().inject(this)

        setContentView(R.layout.screen_main)
        button_calculate.setOnClickListener {
            val value1 = generatedNumber.get().value
            val value2 = generatedNumber.get().value

            Toast.makeText(it.context, "$value1 + $value2 = ${calculator.run(value1, value2)}", Toast.LENGTH_SHORT).show()
        }
    }
}