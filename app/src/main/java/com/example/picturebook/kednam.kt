package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kednam : AppCompatActivity() {
    lateinit var btnnum4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kednam)
        startActivity(intent)
        castView()
        onClick()
    }


    fun castView(){

        btnnum4=findViewById(R.id.btnnum4)
    }
    fun onClick(){
        btnnum4.setOnClickListener {
            var intent= Intent(baseContext,deks::class.java)
            startActivity(intent)
        }
}}