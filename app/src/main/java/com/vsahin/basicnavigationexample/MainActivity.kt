package com.vsahin.basicnavigationexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = Navigation.findNavController(findViewById(R.id.my_nav_host_fragment))
        NavigationUI.setupWithNavController(findViewById<Toolbar>(R.id.toolbar), navController)
    }
}
