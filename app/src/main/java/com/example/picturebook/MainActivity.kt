package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btna:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        onClick()
    }
    fun castView(){
        btna=findViewById(R.id.btna)

    }
    fun onClick(){
        btna.setOnClickListener {
            var intent= Intent(baseContext,manii::class.java)
            startActivity(intent)
        }
}}