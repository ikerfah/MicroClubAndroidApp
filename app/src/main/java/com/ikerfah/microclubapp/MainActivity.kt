package com.ikerfah.microclubapp

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_gallery -> {
                activityTitle.setText(R.string.title_gallery)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_account -> {
                activityTitle.setText(R.string.title_account)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_home -> {
                activityTitle.setText(R.string.title_news)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_formation -> {
                activityTitle.setText(R.string.title_formations)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_events -> {
                activityTitle.setText(R.string.title_events)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        navigation.selectedItemId = R.id.navigation_home;
    }
}
