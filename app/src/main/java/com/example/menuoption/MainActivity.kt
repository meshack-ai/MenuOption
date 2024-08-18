package com.example.menuoption

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem  // Add this import statement
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.message -> {
                Toast.makeText(applicationContext, "Shows share icon", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.picture -> {
                Toast.makeText(applicationContext, "Shows image icon", Toast.LENGTH_SHORT).show()
                // Handle picture option here, if needed
                return true
            }
            R.id.mode -> {
                Toast.makeText(applicationContext, "Shows call icon", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.about -> {
                Toast.makeText(applicationContext, "calculator menu", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.exit -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
