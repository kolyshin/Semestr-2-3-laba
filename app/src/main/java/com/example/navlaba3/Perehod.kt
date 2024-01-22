package com.example.navlaba3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Timer
import kotlin.concurrent.schedule

class Perehod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perehod)
        Timer().schedule(3000){
            val Mintent = Intent(this@Perehod , MainActivity::class.java)
            startActivity(Mintent)
            finish()
        }
    }
}