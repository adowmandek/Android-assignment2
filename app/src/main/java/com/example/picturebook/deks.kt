package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class deks : AppCompatActivity() {
    lateinit var btnb:Button
    lateinit var btnnum1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deks)

        castView()
        onClick()
    }
    fun castView(){
        btnb=findViewById(R.id.btnb)
        btnnum1=findViewById(R.id.btnnum1)
    }
    fun onClick(){
        btnb.setOnClickListener {
            val intent= Intent(baseContext,kednam::class.java)
            startActivity(intent)
        }
}}