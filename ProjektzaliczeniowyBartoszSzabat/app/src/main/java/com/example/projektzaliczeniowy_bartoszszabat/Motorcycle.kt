package com.example.projektzaliczeniowy_bartoszszabat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class Motorcycle : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motorcycle)
        initListeners()
    }
    private fun initListeners() {
        val buttonTZR125 = findViewById<Button>(R.id.btnTZR125)
        buttonTZR125.setOnClickListener(buttonTZR125Listener)

        val buttonR1 = findViewById<Button>(R.id.btnR1)
        buttonR1.setOnClickListener(buttonR1Listener)

        val buttonGSXR1000 = findViewById<Button>(R.id.btnGSXR1000)
        buttonGSXR1000.setOnClickListener(buttonGSXR100Listener)

        val buttonCBR600 = findViewById<Button>(R.id.btnCBR600)
        buttonCBR600.setOnClickListener(buttonCBR600Listener)
    }

    private val buttonTZR125Listener = View.OnClickListener { callTZR125() }
    private val buttonR1Listener = View.OnClickListener { callR1() }
    private val buttonGSXR100Listener = View.OnClickListener { callGSXR1000() }
    private val buttonCBR600Listener = View.OnClickListener { callCBR600() }

    private fun callTZR125() {
        val TZR125Intent = Intent(this, TZR125::class.java)
        startActivity(TZR125Intent)
    }

    private fun callR1() {
        val R1Intent = Intent(this, R1::class.java)
        startActivity(R1Intent)
    }

    private fun callGSXR1000() {
        val GSXR1000Intent = Intent(this, GSXR1000::class.java)
        startActivity(GSXR1000Intent)
    }

    private fun callCBR600() {
        val CBR600Intent = Intent(this, CBR600::class.java)
        startActivity(CBR600Intent)
    }





}



