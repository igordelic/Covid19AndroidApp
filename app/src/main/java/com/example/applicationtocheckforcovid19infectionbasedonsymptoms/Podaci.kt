package com.example.applicationtocheckforcovid19infectionbasedonsymptoms

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.applicationtocheckforcovid19infectionbasedonsymptoms.databinding.ActivityPodaciBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Podaci : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    private lateinit var binding: ActivityPodaciBinding
    private lateinit var database: DatabaseReference
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPodaciBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val trenTemp = binding.unos1.text.toString()
            val maxTemp = binding.unos2.text.toString()
            val sympBegin = binding.unos3.text.toString()
            val userName = binding.unos4.text.toString()

            database = FirebaseDatabase.getInstance().getReference("Users")

            val User = User(trenTemp,maxTemp,sympBegin,userName)
            database.child(userName).setValue(User).addOnSuccessListener {
                binding.unos1.text.clear()
                binding.unos2.text.clear()
                binding.unos3.text.clear()
                binding.unos4.text.clear()

                Toast.makeText(this,"Uspješno unešeno",Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this,"Greška",Toast.LENGTH_SHORT).show()
            }


        }

        supportActionBar!!.setDefaultDisplayHomeAsUpEnabled(true)
    }
}
