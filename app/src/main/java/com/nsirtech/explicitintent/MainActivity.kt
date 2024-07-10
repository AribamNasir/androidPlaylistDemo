package com.nsirtech.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Intent is of two types -that is one screen to another screen
        //Explicit intent - one screen to another screen within the same application
        //Implicit intent - one screen to other screen in different application say application which have Razor payment gateway will point to open Paytm or phonepe app

        val btnIntent= findViewById<Button>(R.id.btnExplicit)

        btnIntent.setOnClickListener {

            //open a new activity
            intent= Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}