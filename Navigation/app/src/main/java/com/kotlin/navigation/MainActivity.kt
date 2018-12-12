package com.kotlin.navigation

import android.app.Activity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        // 첫번쨰 방법
        val navController= Navigation.findNavController(this, R.id.my_nav_host_fragment)
        NavigationUI.setupWithNavController(bottom_nav, navController)
        NavigationUI.setupWithNavController(toolbar, navController)

        // 두번째 방법
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment
//        findViewById<BottomNavigationView>(R.id.bottom_nav)?.let { bottomNavView ->
//            NavigationUI.setupWithNavController(bottomNavView, navHostFragment.navController)
//        }
//
//        findViewById<Toolbar>(R.id.toolbar)?.let { toolbar ->
//            NavigationUI.setupWithNavController(toolbar, navHostFragment.navController)
//        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        MenuInflater(this).inflate(R.menu.toolbar_item, menu)
        return true
    }

//    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        when(item?.itemId){
//            R.id.profile ->{
//                Navigation.findNavController(item.).navigate(R.id.action_global_blankFragment5)
//            }
//            else ->{}
//        }
//        return super.onOptionsItemSelected(item)
//    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.my_nav_host_fragment).navigateUp()
    }
}
