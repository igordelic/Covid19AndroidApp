package com.example.applicationtocheckforcovid19infectionbasedonsymptoms

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Simptomi() : AppCompatActivity() {

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simptomi)

        supportActionBar!!.setDefaultDisplayHomeAsUpEnabled(true)
        val chk = findViewById<CheckBox>(R.id.checkBox)
        val chk2 = findViewById<CheckBox>(R.id.checkBox2)
        val chk3 = findViewById<CheckBox>(R.id.checkBox3)
        val chk4 = findViewById<CheckBox>(R.id.checkBox4)
        val chk5 = findViewById<CheckBox>(R.id.checkBox5)
        val chk6 = findViewById<CheckBox>(R.id.checkBox6)
        val chk7 = findViewById<CheckBox>(R.id.checkBox7)
        val chk8 = findViewById<CheckBox>(R.id.checkBox8)
        val chk9 = findViewById<CheckBox>(R.id.checkBox9)

        val grip1 = mutableListOf<String>("Temp","Dah","Slab","Glav","Grl","Bol")
        val grip2 = mutableListOf<String>("Temp","Dah","Slab","Glav","Bol")
        val grip3 = mutableListOf<String>("Temp","Dah","Slab","Glav","Grl")
        val grip4 = mutableListOf<String>("Temp","Slab","Glav","Grl","Bol")
        val grip5 = mutableListOf<String>("Temp","Glav","Grl","Bol")
        val grip6 = mutableListOf<String>("Temp","Glav","Bol")
        val grip7 = mutableListOf<String>("Temp","Dah","Slab","Glav")
        val grip8 = mutableListOf<String>("Temp","Dah","Slab","Bol")
        val grip9 = mutableListOf<String>("Temp","Slab","Bol")
        val grip10 = mutableListOf<String>("Temp","Dah","Slab")
        val grip11 = mutableListOf<String>("Temp","Dah","Bol")
        val grip12 = mutableListOf<String>("Temp","Bol")

        val preh1 = mutableListOf<String>("Slab","Kih")
        val preh2 = mutableListOf<String>("Kih","Grl")
        val preh3 = mutableListOf<String>("Slab","Grl")
        val preh4 = mutableListOf<String>("Kih")
        val preh5 = mutableListOf<String>("Grl")

        val cov1 = mutableListOf<String>("Temp","Kas","Dah","Slab","Bol","Grl","Glav","Osj")
        val cov2 = mutableListOf<String>("Temp","Kas","Dah","Slab","Bol","Grl","Glav")
        val cov3 = mutableListOf<String>("Temp","Kas","Dah","Slab","Bol","Grl","Osj")
        val cov4 = mutableListOf<String>("Temp","Kas","Dah","Slab","Bol","Osj")
        val cov5 = mutableListOf<String>("Temp","Kas","Dah","Slab","Osj")
        val cov6 = mutableListOf<String>("Temp","Kas","Dah","Bol","Osj")
        val cov7 = mutableListOf<String>("Temp","Kas","Slab","Bol","Osj")
        val cov8 = mutableListOf<String>("Temp","Dah","Slab","Bol","Osj")
        val cov9 = mutableListOf<String>("Temp","Slab","Bol","Osj")
        val cov10 = mutableListOf<String>("Temp","Slab","Bol","Osj")
        val cov11 = mutableListOf<String>("Temp","Dah","Bol","Osj")
        val cov12 = mutableListOf<String>("Temp","Kas","Dah","Osj")
        val cov13 = mutableListOf<String>("Temp","Dah","Slab","Osj")
        val cov14 = mutableListOf<String>("Temp","Dah","Slab","Osj")

        val symps = mutableListOf<String>()
        symps.clear()
        val checkButton = findViewById<Button>(R.id.chcButton)
        checkButton.setOnClickListener {
            symps.clear()
            if (chk.isChecked){
                symps.add("Temp")
            }
            if (chk2.isChecked){
                symps.add("Kas")
            }
            if (chk3.isChecked){
                symps.add("Dah")
            }
            if (chk4.isChecked){
                symps.add("Slab")
            }
            if (chk5.isChecked){
                symps.add("Glav")
            }
            if (chk6.isChecked){
                symps.add("Bol")
            }
            if (chk7.isChecked){
                symps.add("Kih")
            }
            if (chk8.isChecked){
                symps.add("Grl")
            }
            if (chk9.isChecked){
                symps.add("Osj")
            }


            if(symps.containsAll(cov1)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov2)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov3)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov4)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov5)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov6)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov7)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov8)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov9)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov10)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov11)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov12)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov13)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(cov14)){
                val Intent = Intent(this,Covid::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip1)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip2)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip3)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
            }
            else if(symps.containsAll(grip4)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip5)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip6)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip7)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip8)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip9)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip10)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip11)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(grip12)){
                val Intent = Intent(this,Gripa::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(preh1)){
                val Intent = Intent(this,Prehlada::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(preh2)){
                val Intent = Intent(this,Prehlada::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(preh3)){
                val Intent = Intent(this,Prehlada::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(preh4)){
                val Intent = Intent(this,Prehlada::class.java)
                startActivity(Intent)
                symps.clear()
            }
            else if(symps.containsAll(preh5)){
                val Intent = Intent(this,Prehlada::class.java)
                startActivity(Intent)
                symps.clear()
            }

            else{
                val Intent = Intent(this,Neodredjeno::class.java)
                startActivity(Intent)
                symps.clear()
            }

        }

    }
}

