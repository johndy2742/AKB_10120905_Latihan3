package com.example.a10120905_latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

//<!-- 28 April 10102905 Johndy Panca IF10k--> //

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val boxName = findViewById<TextInputLayout>(R.id.boxCallName)
        val etName = findViewById<TextInputEditText>(R.id.etCallName)

        btnSubmit.setOnClickListener {
            if(etName.text.toString() == resources.getString(R.string.empty)) {
                boxName.isErrorEnabled = true
                boxName.error = resources.getString(R.string.cannot_empty)
            } else {
                boxName.isErrorEnabled = false

                startActivity(
                    Intent(this, SuccessActivity::class.java).putExtra(
                        "call_name",
                        etName.text.toString()
                    )
                )
            }
        }

    }
}