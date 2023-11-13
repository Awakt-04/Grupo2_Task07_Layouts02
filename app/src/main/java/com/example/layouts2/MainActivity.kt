package com.example.layouts2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.PopupMenu

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutButton : Button
    private lateinit var tableLayoutButton : Button
    private lateinit var relativeLayoutButton : Button
    private lateinit var gridLayoutButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayoutButton = findViewById(R.id.botonL)
        tableLayoutButton = findViewById(R.id.botonT)
        relativeLayoutButton = findViewById(R.id.botonR)
        // gridLayoutButton = findViewById(R.id.botonG)

        linearLayoutButton.setOnClickListener{
            val intent = Intent(this@MainActivity, LinearLayout::class.java)
            startActivity(intent)
        }

        tableLayoutButton.setOnClickListener{
            val intent = Intent(this@MainActivity, TableLayout::class.java)
            startActivity(intent)
        }

        relativeLayoutButton.setOnClickListener{
            val intent = Intent(this@MainActivity, RelativeLayout::class.java)
            startActivity(intent)
        }

        /*gridLayoutButton.setOnClickListener{
            val intent = Intent(this@MainActivity, GridLayout::class.java)
            startActivity(intent)
        }*/

    }

    fun showPopupM(view: View) {
        val popupMenu = PopupMenu(this, view)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.show()
    }
}