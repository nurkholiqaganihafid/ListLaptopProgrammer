package com.nurkholiq.listlaptopprogrammer

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nurkholiq.listlaptopprogrammer.adapter.ListLaptopAdapter
import com.nurkholiq.listlaptopprogrammer.data.LaptopDataDummy
import com.nurkholiq.listlaptopprogrammer.model.Laptop

class HomeActivity : AppCompatActivity() {

    private lateinit var rvLaptops: RecyclerView
    private var list: ArrayList<Laptop> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val toolbar: Toolbar = findViewById(R.id.bar_layout)
        setSupportActionBar(toolbar)
        supportActionBar?.title = null

        toolbar.setNavigationOnClickListener {
            finish()
        }

        rvLaptops = findViewById(R.id.rv_laptop_programmer)
        rvLaptops.setHasFixedSize(true)

        list.addAll(LaptopDataDummy.listLaptop)
        showRecyclerViewList()
    }

    private fun showRecyclerViewList() {
        rvLaptops.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val listLaptopAdapter = ListLaptopAdapter(list, "horizontal")
        rvLaptops.adapter = listLaptopAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.btn_about_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_about -> {
                val intent = Intent(this, AuthorActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}