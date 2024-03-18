package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Witam(view: View) {

        var displaytext : TextView = findViewById(R.id.textView)
        displaytext.setText("Witam")
    }

    fun Mateusz(view: View) {

        var displaytext: TextView = findViewById(R.id.textView2)
        displaytext.setText("Mateusz")
    }

    fun Do_widzenia(view: View){

        var displaytext: TextView = findViewById(R.id.textView3)
        displaytext.setText("Do widzenia")
    }
}