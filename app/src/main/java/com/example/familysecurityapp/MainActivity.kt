package com.example.familysecurityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomBar=findViewById<BottomNavigationView>(R.id.btmview)

        bottomBar.setOnItemSelectedListener { menuItem ->

            if( menuItem.itemId == R.id.guard)
            {
                    inflateFragment(GuardFragment.newInstance())

            }else if(menuItem.itemId == R.id.home){

                inflateFragment(HomeFragment.newInstance())
            }else if(menuItem.itemId == R.id.dash1){

                inflateFragment(DashboardFragment.newInstance())
            }else if(menuItem.itemId == R.id.profile){
                inflateFragment(ProfileFragment.newInstance())
            }
            true
        }
        bottomBar.selectedItemId==R.id.home
    }
    private fun inflateFragment(newInstance: Fragment,) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container55,newInstance)
        transaction.commit()
    }
}