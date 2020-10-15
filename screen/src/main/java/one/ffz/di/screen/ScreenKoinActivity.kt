package one.ffz.di.screen

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.screen_main.*
import one.ffz.di.calculation.Calculator
import one.ffz.di.calculation.GeneratedNumber
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class ScreenKoinActivity : AppCompatActivity() {
    private val calculator: Calculator by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_main)
        button_calculate.setOnClickListener {
            val number1: GeneratedNumber = get()
            val number2: GeneratedNumber = get()

            Toast.makeText(it.context, "${number1.value} + ${number2.value} = ${calculator.run(number1.value, number2.value)}", Toast.LENGTH_SHORT).show()
        }
    }
}