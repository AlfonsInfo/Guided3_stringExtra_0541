package com.alfonsus.guided3_stringextra

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent : Intent = intent
        val message : String = intent.getStringExtra(MainActivity.EXTRA_MESSAGE).toString()

        //Membuat Text View

        val textView = TextView(this)
        textView.setTextSize(40F)
        textView.setText("Anda Memilih Warna " + message)
        if(message=="Merah")
        {
            textView.setTextColor(Color.parseColor("#FF0000"))
        }else if(message=="Hijau")
        {
            textView.setTextColor(Color.parseColor("#OOFFOO"))
        }else
        {
            textView.setTextColor(Color.parseColor("#0000FF"))
        }
        setContentView(textView)
    }
}