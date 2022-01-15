package com.example.projektzaliczeniowy_bartoszszabat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.lang.StringBuilder

class TwoStrokeResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_stroke_result)


        val wynik = findViewById<View>(R.id.yt) as TextView
        val intent = intent
        val message = intent.getStringExtra("First")

        wynik.text = StringBuilder("$message")



    }















}