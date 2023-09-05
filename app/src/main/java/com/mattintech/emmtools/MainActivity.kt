package com.mattintech.emmtools

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var drawerLayout: DrawerLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        uiInit()

        val navigationView = findViewById<NavigationView>(R.id.navigation_view)
        navigationView.itemIconTintList = null

        val navController: NavController =
            Navigation.findNavController(this, R.id.nav_host_fragment)
        NavigationUI.setupWithNavController(navigationView, navController)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.iv_menu -> drawerLayout!!.openDrawer(GravityCompat.START)
        }
    }

    private fun uiInit() {
        drawerLayout = findViewById(R.id.drawer_layout)
        findViewById<View>(R.id.iv_menu).setOnClickListener(this)
    }
}