package com.example.projektzaliczeniowy_bartoszszabat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class InsertPetrolHeadName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_petrol_head_name)
        initListeners()

    }

    private fun initListeners() {
        val buttonBePetrolHeadFromInsert = findViewById<Button>(R.id.btnBePetrolHeadFromInsert)
        buttonBePetrolHeadFromInsert.setOnClickListener(buttonBePetrolHeadFromInsertListener)



    }

    private val buttonBePetrolHeadFromInsertListener = View.OnClickListener { zwróćImie() }


    private fun zwróćImie() {
        val editText = findViewById<EditText>(R.id.editText)
        val intent = Intent()
        if (editText.text.toString().isEmpty()) {
            setResult(RESULT_CANCELED, intent)
        } else {
            intent.putExtra("RESULT", editText.text.toString())
            setResult(RESULT_OK, intent)
        }
        finish()
    }

}