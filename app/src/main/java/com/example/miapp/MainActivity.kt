package com.example.miapp


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: Button = findViewById(R.id.button_click_me)
        val textView: TextView = findViewById(R.id.textview_message)
        val iconView: ImageView = findViewById(R.id.icon_view)


        button.setOnClickListener {
            textView.text = "¡Hola, Sabrina!"
            iconView.setImageResource(R.drawable.iselda)
        }
    }
}
