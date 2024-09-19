package com.itproger.prak_2.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.itproger.prak_2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (savedInstanceState == null) {
//            val fragment1: Fragment1 = Fragment1()
//            val fragmentManager: FragmentManager = supportFragmentManager
//            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
//            fragmentTransaction.replace(R.id.fragment_container, fragment1)
//            fragmentTransaction.commit()
//        }

    }
}