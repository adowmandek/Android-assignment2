package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class manii : AppCompatActivity() {
    lateinit var btno:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manii)
        castView()
        onClick()

    }
    fun castView(){

        btno=findViewById(R.id.btno)
    }
    fun onClick(){
        btno.setOnClickListener {
            var intent= Intent(baseContext,adow::class.java)
            startActivity(intent)
        }
}}