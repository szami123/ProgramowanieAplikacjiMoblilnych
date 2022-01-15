package com.example.projektzaliczeniowy_bartoszszabat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.lang.StringBuilder
import java.math.BigDecimal
import java.math.RoundingMode

class TwoStroke : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_stroke)
        initListeners()
    }

    private fun initListeners() {
        val buttonxd = findViewById<Button>(R.id.btnResult)
        buttonxd.setOnClickListener(buttonResultListener)
    }



    private val buttonResultListener = View.OnClickListener { dodawanie() }




   private fun dodawanie() {

        val proporcje = findViewById<Spinner>(R.id.spinner) as Spinner
        val ilośćPaliwa = findViewById<View>(R.id.ilośćPaliwa) as EditText




        val jakajestliczba1 = proporcje.selectedItem.toString().toDouble()
        val jakajestliczba2 = ilośćPaliwa.text.toString().toDouble()


        val wynikdodawania = jakajestliczba2/jakajestliczba1*1000
        val rounded = wynikdodawania.toBigDecimal().setScale(1, RoundingMode.UP).toDouble()




       val runSecondIntent = Intent(this, TwoStrokeResult::class.java)
       runSecondIntent.putExtra("First", rounded.toString())
       startActivity(runSecondIntent)


   }




}