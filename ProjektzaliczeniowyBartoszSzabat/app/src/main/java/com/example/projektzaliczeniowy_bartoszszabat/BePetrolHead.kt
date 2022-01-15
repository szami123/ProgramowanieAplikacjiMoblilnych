package com.example.projektzaliczeniowy_bartoszszabat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class BePetrolHead : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_be_petrol_head)
        initListeners()
    }

    private fun initListeners() {
        val buttonInsertPetrolHeadName = findViewById<Button>(R.id.btnInsertPetrolHeadName)
        buttonInsertPetrolHeadName.setOnClickListener(buttonInsertPetrolHeadNameListener)

    }


    private val buttonInsertPetrolHeadNameListener = View.OnClickListener { callbuttonInsertPetrolHeadNameListener() }




    private fun callbuttonInsertPetrolHeadNameListener() {
        val intentWithResult = Intent(this, InsertPetrolHeadName::class.java)
        startActivityForResult(intentWithResult, 2)
    }





    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode,  data)
        var result: String? = ""
        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                result = data!!.getStringExtra("RESULT")
            } else if (resultCode == RESULT_CANCELED) {
                result = "No data"
            }
        }
        val textView = findViewById<TextView>(R.id.textView2)
        textView.text = result
    }





}