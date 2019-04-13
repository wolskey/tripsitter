package com.example.tripsitter

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_encyclopedia -> {
                message.setText(R.string.title_encyclopedia)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_calculator -> {
                message.setText(R.string.title_calculator)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_mix -> {
                message.setText(R.string.title_mix)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        navigation.selectedItemId = R.id.navigation_encyclopedia
    }
}
