package com.example.a10120905_latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textview.MaterialTextView

//<!-- 28 April 10102905 Johndy Panca IF10k--> //
class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val argument = intent.getStringExtra("call_name").toString()
        val textCongratulations = findViewById<MaterialTextView>(R.id.tvCongratulations)

        textCongratulations.text =
            resources.getString(R.string.congratulations, argument, argument, argument)
    }
}