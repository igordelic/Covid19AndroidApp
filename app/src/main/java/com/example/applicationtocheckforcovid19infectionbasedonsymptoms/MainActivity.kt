package com.example.applicationtocheckforcovid19infectionbasedonsymptoms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secndActivButton = findViewById<Button>(R.id.simptomibtn)
        secndActivButton.setOnClickListener {
            val Intetn = Intent(this,Simptomi::class.java)
            startActivity(Intetn)
        }

        val thirdActivButton = findViewById<Button>(R.id.databtn)
        thirdActivButton.setOnClickListener {
            val Intent2 = Intent(this,Ocitaj::class.java)
            startActivity(Intent2)
        }
    }
}
