package com.example.clase14

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            R.id.add -> {
                val textview = findViewById<TextView>(R.id.textView)
                textview.text = "Botón Add seleccionado"
                return true
            }        //add the function to perform here

            R.id.reset -> {
                val textview = findViewById<TextView>(R.id.textView)
                textview.text = "Reset Activado"
                return true
            }     //add the function to perform here

            R.id.about -> {
                val toast = Toast.makeText(
                    this,
                    "Sobre esta Aplicacion: Version 0.1", Toast.LENGTH_LONG
                ).show()
                return true
            }      //add the function to perform here

            R.id.exit -> {
                finish()
                return true
            }     //add the function to perform here

        }
        return super.onOptionsItemSelected(item)
    }

}