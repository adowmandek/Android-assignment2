package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class manii : AppCompatActivity() {
    lateinit var btnz:Button
//    lateinit var btnum2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manii)
        castView()
        onClick()
        startActivity(intent)
    }
    fun castView(){

        btnz=findViewById(R.id.btnz)
    }
    fun onClick(){
        btnz.setOnClickListener {
            var intent= Intent(baseContext,adow::class.java)
            startActivity(intent)
        }
}}