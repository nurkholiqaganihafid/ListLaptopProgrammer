package com.nurkholiq.listlaptopprogrammer

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nurkholiq.listlaptopprogrammer.adapter.ListLaptopAdapter
import com.nurkholiq.listlaptopprogrammer.data.LaptopDataDummy
import com.nurkholiq.listlaptopprogrammer.model.Laptop
import kotlin.collections.ArrayList

class HomeActivity : AppCompatActivity() {

    private lateinit var rvLaptopProgrammer: RecyclerView
    private lateinit var rvLaptopGaming: RecyclerView
    private lateinit var rvLaptopRecommend: RecyclerView


    private var listOne: ArrayList<Laptop> = arrayListOf()
    private var listTwo: ArrayList<Laptop> = arrayListOf()
    private var listThree: ArrayList<Laptop> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val toolbar: Toolbar = findViewById(R.id.bar_layout)
        setSupportActionBar(toolbar)
        supportActionBar?.title = null

        toolbar.setNavigationOnClickListener {
            finish()
        }

        rvLaptopProgrammer = findViewById(R.id.rv_laptop_programmer)
        rvLaptopProgrammer.setHasFixedSize(true)

        rvLaptopGaming = findViewById(R.id.rv_laptop_gaming)
        rvLaptopGaming.setHasFixedSize(true)

        rvLaptopRecommend = findViewById(R.id.rv_laptop_recommendation)
        rvLaptopRecommend.setHasFixedSize(true)

        listOne.addAll(LaptopDataDummy.listLaptop)
        listTwo.addAll(LaptopDataDummy.listLaptop)
        listThree.addAll(LaptopDataDummy.listLaptop)
        showRecyclerViewList()
    }

    private fun showRecyclerViewList() {
        listOne.shuffle()
        rvLaptopProgrammer.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val listLaptopAdapter = ListLaptopAdapter(listOne, "laptop_programmer")
        rvLaptopProgrammer.adapter = listLaptopAdapter

        listTwo.shuffle()
        rvLaptopGaming.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val listGamingAdapter = ListLaptopAdapter(listTwo, "laptop_gaming")
        rvLaptopGaming.adapter = listGamingAdapter

        listThree.shuffle()
        rvLaptopRecommend.layoutManager = GridLayoutManager(this, 2)
        val listRecommendAdapter = ListLaptopAdapter(listTwo, "laptop_recommend")
        rvLaptopRecommend.adapter = listRecommendAdapter
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