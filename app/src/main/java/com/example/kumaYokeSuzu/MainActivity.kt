package com.example.kumaYokeSuzu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.media.SoundPool
import android.media.AudioAttributes
import android.media.AudioManager
import android.os.Build
import android.widget.Toast
import android.graphics.Color





class MainActivity : AppCompatActivity() {

    private val soundPool = SoundPool.Builder().setMaxStreams(4).build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val imageViewBell = findViewById<ImageView>(R.id.jiko_kumayoke_suzu)
        imageViewBell.setImageResource(R.drawable.jiko_kumayoke_suzu)

        val startButton: Button = findViewById<Button>(R.id.startButton)
        startButton.setTextColor(Color.WHITE)
        //startButton.setOnClickListener(this)

        val endButton: Button = this.findViewById<Button>(R.id.endButton)
        endButton.setTextColor(Color.WHITE)
        //endButton.setOnClickListener(this)



        val soundId = soundPool.load(this, R.raw.bell_ring, 1)
        startButton.setOnClickListener{
            soundPool.play(soundId, 1.0f, 1.0f, 0, 0, 1.0f)
            //Toast.makeText(applicationContext, "トーストメッセージ", Toast.LENGTH_LONG).show()
            }






    }
}
