package com.example.projektzaliczeniowy_bartoszszabat

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        val buttonHistory = findViewById<Button>(R.id.btnHistory)
        buttonHistory.setOnClickListener(buttonHistoryListener)

        val buttonBePetrolHead = findViewById<Button>(R.id.btnBePetrolHead)
        buttonBePetrolHead.setOnClickListener(buttonBePetrolHeadListener)

        val buttonTwoStroke = findViewById<Button>(R.id.btnTwoStroke)
        buttonTwoStroke.setOnClickListener(buttonTwoStrokeListener)

        val buttonMotorcycle = findViewById<Button>(R.id.btnMotorcycle)
        buttonMotorcycle.setOnClickListener(buttonMotorcycleListener)

        val buttonAuthor = findViewById<Button>(R.id.btnAuthor)
        buttonAuthor.setOnClickListener(buttonAuthorListener)


    }


    private val buttonHistoryListener = View.OnClickListener { callHistory() }
    private val buttonBePetrolHeadListener = View.OnClickListener { callBePetrolHead() }
    private val buttonTwoStrokeListener = View.OnClickListener { callTwoStroke() }
    private val buttonMotorcycleListener = View.OnClickListener { callMotorcycle() }
    private val buttonAuthorListener = View.OnClickListener { callAuthor() }

    private fun callHistory() {
        val historyIntent = Intent(this, History::class.java)
        startActivity(historyIntent)
    }

    private fun callBePetrolHead() {
        val bePetrolHeadIntent = Intent(this, BePetrolHead::class.java)
        startActivity(bePetrolHeadIntent)
    }

    private fun callTwoStroke() {
        val twoStrokeIntent = Intent(this, TwoStroke::class.java)
        startActivity(twoStrokeIntent)
    }

    private fun callMotorcycle() {
        val motorcycleIntent = Intent(this, Motorcycle::class.java)
        startActivity(motorcycleIntent)
    }

    private fun callAuthor() {
        val authorIntent = Intent(this, Author::class.java)
        startActivity(authorIntent)
    }

}

