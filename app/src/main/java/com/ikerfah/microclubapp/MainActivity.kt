package com.ikerfah.microclubapp

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.ikerfah.microclubapp.contact.ContactFragment
import com.ikerfah.microclubapp.events.EventFragment
import com.ikerfah.microclubapp.formations.FormationFragment
import com.ikerfah.microclubapp.gallery.GalleryFragment
import com.ikerfah.microclubapp.news.NewsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private var fragmentTransaction = fragmentManager.beginTransaction()
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_gallery -> {
                activityTitle.setText(R.string.title_gallery)
                setActivatedFragment(GalleryFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_account -> {
                activityTitle.setText(R.string.title_account)
                setActivatedFragment(ContactFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_home -> {
                activityTitle.setText(R.string.title_news)
                setActivatedFragment(NewsFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_formation -> {
                activityTitle.setText(R.string.title_formations)
                setActivatedFragment(FormationFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_events -> {
                activityTitle.setText(R.string.title_events)
                setActivatedFragment(EventFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun setActivatedFragment(fragment : Fragment) {
        fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.main_container, fragment)
        fragmentTransaction.commit()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        navigation.selectedItemId = R.id.navigation_home


    }
}
