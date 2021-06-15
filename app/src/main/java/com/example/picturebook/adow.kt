package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class adow : AppCompatActivity() {
    lateinit var btnd:Button
    lateinit var btnum3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deks)
            R.layout.activity_adow
        startActivity(intent)
                    castView ()
                    onClick ()

    }
    fun castView(){
        btnd=findViewById(R.id.btnd)
        btnum3=findViewById(R.id.btnum3)
    }
    fun onClick(){
        btnd.setOnClickListener {
            var intent=Intent(baseContext,deks::class.java)
            startActivity(intent)
        }

    }
}