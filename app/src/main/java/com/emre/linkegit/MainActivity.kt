package com.emre.linkegit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun anlık (view:View){
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://thingspeak.com/channels/1345318"))
        startActivity(i)

    }

    fun aylık (view: View){
        val intent=Intent(applicationContext,Aylik::class.java)
        startActivity(intent)


    }
    fun haftalık (view: View){
        val intent=Intent(applicationContext,Haftalik::class.java)
        startActivity(intent)

    }



}