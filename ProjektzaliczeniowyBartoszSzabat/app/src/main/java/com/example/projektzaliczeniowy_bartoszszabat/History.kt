package com.example.projektzaliczeniowy_bartoszszabat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

    }


    fun printSth(v: View?) {
        Toast.makeText(this, R.string.btnBeMotorcyclistToast, Toast.LENGTH_LONG).show()
    }




}