package mx.tecnm.cdhidalgo.e401

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.animation.AnimationUtils

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        logo = findViewById(R.id.logo_splash)
        animacion = AnimationUtils.loadAnimation(this,R,anim.anim_splash)

        logo.startAnimation(animacion)
        Handler(Looper.getMainLooper()).postDelayud(
        {
            val intent = Intent(this, Login::class.java)
            val transicion = ActivityOptions.makeSceneTransitionAnimation(
                this, Pair(logo,"logo_trans"))
            startActivity(intent, transicion.toBundle())
        }, 4000)
    }
}