package com.example.applicationtocheckforcovid19infectionbasedonsymptoms

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.applicationtocheckforcovid19infectionbasedonsymptoms.databinding.ActivityOcitajBinding
import com.example.applicationtocheckforcovid19infectionbasedonsymptoms.databinding.ActivityPodaciBinding
import com.google.firebase.database.*
import java.lang.StringBuilder
import java.lang.reflect.Array.get

class Ocitaj : AppCompatActivity() {
    private lateinit var binding: ActivityOcitajBinding
    private lateinit var database: DatabaseReference

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ocitaj)
        supportActionBar!!.setDefaultDisplayHomeAsUpEnabled(true)
        binding = ActivityOcitajBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val swapBtn = findViewById<Button>(R.id.unsBtn)
        swapBtn.setOnClickListener {
            val Intent = Intent(this, Podaci::class.java)
            startActivity(Intent)
        }

        binding.loadBtn.setOnClickListener {
            val userName : String = binding.etUsername.text.toString()
            if(userName.isNotEmpty()){
                readData(userName)
            }else{
                Toast.makeText(this,"Unesite korisnicko ime",Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun readData(userName: String) {
        database = FirebaseDatabase.getInstance().getReference("Users")
        database.child(userName).get().addOnSuccessListener {
            if(it.exists()){

                val trentemp = it.child("trenTemp").value
                val maxtemp = it.child("maxTemp").value
                val sypbegin = it.child("sympBegin").value
                Toast.makeText(this,"Uspjesno ucitano",Toast.LENGTH_SHORT).show()
                binding.etUsername.text.clear()
                binding.tvTren.text = trentemp.toString() + " °C"
                binding.tvMax.text = maxtemp.toString() + " °C"
                binding.tvDani.text = sypbegin.toString() + " dan/a"


            }else{
                Toast.makeText(this,"Korisnik ne postoji",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
            Toast.makeText(this,"ERROR",Toast.LENGTH_SHORT).show()
        }
    }

}









