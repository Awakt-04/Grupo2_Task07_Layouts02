package com.example.layouts2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu

class RelativeLayout : AppCompatActivity()  {

    private lateinit var botonVuelta : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relativelayout03)

        botonVuelta = findViewById(R.id.botonVuelta3)

        botonVuelta.setOnClickListener {
            val intent = Intent(this@RelativeLayout, MainActivity::class.java)
            startActivity(intent)
        }

    }

    fun showPopupR(view: View) {
        val popupMenu = PopupMenu(this, view)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.show()
    }
}