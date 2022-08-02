package com.nurkholiq.listlaptopprogrammer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide

class DescriptionActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val LAPTOP_IMAGE = "laptop_image"
        const val LAPTOP_BRAND = "laptop_brand"
        const val LAPTOP_PRICE = "laptop_price"
        const val LAPTOP_SCREEN = "laptop_screen"
        const val LAPTOP_PROCESSOR = "laptop_processor"
        const val LAPTOP_GRAPHIC = "laptop_graphic"
        const val LAPTOP_RAM = "laptop_ram"
        const val LAPTOP_STORAGE = "laptop_storage"
        const val LAPTOP_BATTERY = "laptop_battery"
        const val URL_SHOPEE = "laptop_shopee"
        const val URL_LAZADA = "laptop_lazada"
        const val LAPTOP_DESC = "laptop_desc"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val toolbar: Toolbar = findViewById(R.id.bar_layout)
        setSupportActionBar(toolbar)
        supportActionBar?.title = null

        toolbar.setNavigationOnClickListener {
            finish()
        }

        val btnShopee: Button = findViewById(R.id.btn_shopee)
        val btnLazada: Button = findViewById(R.id.btn_lazada)
        val btnShare: Button = findViewById(R.id.btn_share)
        btnShopee.setOnClickListener(this)
        btnLazada.setOnClickListener(this)
        btnShare.setOnClickListener(this)

        val imageItem: ImageView = findViewById(R.id.img_item_desc)
        val brandItem: TextView = findViewById(R.id.tv_title_desc_item)
        val priceItem: TextView = findViewById(R.id.tv_price_item)
        val subScreenItem: TextView = findViewById(R.id.tv_sub_screen)
        val subProcessorItem: TextView = findViewById(R.id.tv_sub_prosesor)
        val subGraphicItem: TextView = findViewById(R.id.tv_sub_graphic)
        val subRamItem: TextView = findViewById(R.id.tv_sub_ram)
        val subStorageItem: TextView = findViewById(R.id.tv_sub_storage)
        val subBatteryItem: TextView = findViewById(R.id.tv_sub_battery)
        val descItem: TextView = findViewById(R.id.tv_desc_item)

        // get data
        val getImage = intent.getIntExtra(LAPTOP_IMAGE, 0)
        val getBrand = intent.getStringExtra(LAPTOP_BRAND)
        val getPrice = intent.getStringExtra(LAPTOP_PRICE)
        val getScreen = intent.getStringExtra(LAPTOP_SCREEN)
        val getProcessor = intent.getStringExtra(LAPTOP_PROCESSOR)
        val getGraphic = intent.getStringExtra(LAPTOP_GRAPHIC)
        val getRAM = intent.getStringExtra(LAPTOP_RAM)
        val getStorage = intent.getStringExtra(LAPTOP_STORAGE)
        val getBattery = intent.getStringExtra(LAPTOP_BATTERY)
        val getDesc = intent.getStringExtra(LAPTOP_DESC)

        // for change view
        Glide.with(this)
            .load(getImage)
            .into(imageItem)
        brandItem.text = getBrand
        priceItem.text = getPrice
        subScreenItem.text = getScreen
        subProcessorItem.text = getProcessor
        subGraphicItem.text = getGraphic
        subRamItem.text = getRAM
        subStorageItem.text = getStorage
        subBatteryItem.text = getBattery
        descItem.text = getDesc
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_shopee) {
            val intent = Intent(this, WebSocialMediaActivity::class.java)
            intent.putExtra(
                WebSocialMediaActivity.URL_SOCIAL_MEDIA, getIntent().getStringExtra(
                    URL_SHOPEE
                )
            )
            startActivity(intent)
        }

        if (v?.id == R.id.btn_lazada) {
            val intent = Intent(this, WebSocialMediaActivity::class.java)
            intent.putExtra(
                WebSocialMediaActivity.URL_SOCIAL_MEDIA, getIntent().getStringExtra(
                    URL_LAZADA
                )
            )
            startActivity(intent)
        }

        if (v?.id == R.id.btn_share) {
            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.putExtra(Intent.EXTRA_TEXT, intent.getStringExtra(URL_SHOPEE))
            shareIntent.type = "text/plain"
            startActivity(Intent.createChooser(shareIntent, "Ayo share"))
        }

    }
}