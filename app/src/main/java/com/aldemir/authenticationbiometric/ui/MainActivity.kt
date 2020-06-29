package com.aldemir.authenticationbiometric.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aldemir.authenticationbiometric.R
import com.aldemir.authenticationbiometric.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, HomeFragment())
            .commit()
        }
        setContentView(R.layout.activity_main)
    }
}