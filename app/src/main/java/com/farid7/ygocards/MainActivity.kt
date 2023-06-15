package com.farid7.ygocards

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatDelegate
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

// Kelas aktivitas utama
class MainActivity : AppCompatActivity() {

    // Toggle untuk Drawer Layout
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fungsi mengganti fragmen saat ini
        makeCurrentFragment(CardFragmentKashtira())

        // Pengaturan variabel dengan lokasi layout
        val menuBottom = findViewById<BottomNavigationView>(R.id.navigation_bottom)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val menuLeft = findViewById<NavigationView>(R.id.navigation_left)

        // Pengaturan Toggle Drawer Layout
        toggle = ActionBarDrawerToggle(this, drawerLayout,
            R.string.open, R.string.close).apply {
            drawerLayout.addDrawerListener(this)
            syncState()
        }

        //Pengatuaran ActionBar
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "Yu-Gi-Oh! Cards!"
        }

        // Navigasi samping
        menuLeft.setNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.menu_left_kashtira -> {
                    makeCurrentFragment(CardFragmentKashtira())
                    menuBottom.selectedItemId = R.id.menu_bottom_kashtira
                }
                R.id.menu_left_mannadium -> {
                    makeCurrentFragment(CardFragmentMannadium())
                    menuBottom.selectedItemId = R.id.menu_bottom_mannadium
                }
                R.id.menu_left_despia -> {
                    makeCurrentFragment(CardFragmentDespia())
                    menuBottom.selectedItemId = R.id.menu_bottom_despia
                }
                R.id.menu_left_github -> {
                    startActivity(Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/frdvndb")))
                }
            }
            drawerLayout.closeDrawers()
            true
        }

        // Navigasi bawah
        menuBottom.setOnNavigationItemSelectedListener { menuItem ->
            val fragment = when (menuItem.itemId) {
                R.id.menu_bottom_kashtira -> {
                    menuLeft.setCheckedItem(R.id.menu_left_kashtira)
                    CardFragmentKashtira()
                }
                R.id.menu_bottom_mannadium -> {
                    menuLeft.setCheckedItem(R.id.menu_left_mannadium)
                    CardFragmentMannadium()
                }
                R.id.menu_bottom_despia -> {
                    menuLeft.setCheckedItem(R.id.menu_left_despia)
                    CardFragmentDespia()
                }
                else -> null
            }
            fragment?.let { makeCurrentFragment(it) }
            true
        }
    }

    // Fungsi pengaturan fragmen sekarang
    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().run {
            replace(R.id.navigation_view, fragment)
            commit()
        }
    }

    // Menu untuk mode gelap dan terang
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.apply {
            add(Menu.NONE, 1, Menu.NONE, "Dark Mode")
            add(Menu.NONE, 2, Menu.NONE, "Light Mode")
        }
        return super.onCreateOptionsMenu(menu)
    }

    // Fungsi mode gelap
    private fun setNightMode(isNightMode: Boolean) {
        AppCompatDelegate.setDefaultNightMode(
            if (isNightMode) AppCompatDelegate.MODE_NIGHT_YES
            else AppCompatDelegate.MODE_NIGHT_NO
        )
    }

    // Fungsi ketika item dipilih
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            1 -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            2 -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        toggle.onOptionsItemSelected(item)?.let { return it }
        return super.onOptionsItemSelected(item)
    }

    // Deklarasi companion object
    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
}