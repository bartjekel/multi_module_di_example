package one.ffz.di.app

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import one.ffz.di.screen.ScreenDaggerActivity
import one.ffz.di.screen.ScreenKoinActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_dagger.setOnClickListener {
            startActivity(Intent(this, ScreenDaggerActivity::class.java))
        }
        btn_koin.setOnClickListener {
            startActivity(Intent(this, ScreenKoinActivity::class.java))
        }
    }
}