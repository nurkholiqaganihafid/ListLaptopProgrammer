package com.nurkholiq.listlaptopprogrammer.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.nurkholiq.listlaptopprogrammer.DescriptionActivity
import com.nurkholiq.listlaptopprogrammer.R
import com.nurkholiq.listlaptopprogrammer.model.Laptop

class ListLaptopAdapter(private val listLaptop: ArrayList<Laptop>, val value: String) :
    RecyclerView.Adapter<ListLaptopAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvBrandName: TextView = itemView.findViewById(R.id.tv_brand)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_price)
        var imgFoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        lateinit var view: View
        val context = parent.context

        if (value == "laptop_programmer") {
            view = LayoutInflater.from(context)
                .inflate(R.layout.item_laptop_programmer, parent, false)
        }

        if (value == "laptop_gaming") {
            view =
                LayoutInflater.from(context).inflate(R.layout.item_laptop_programmer, parent, false)
        }

        if (value == "laptop_recommend") {
            view =
                LayoutInflater.from(context).inflate(R.layout.item_laptop_recommend, parent, false)
        }

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val laptop = listLaptop[position]
        val content = holder.itemView.context

        Glide.with(content)
            .load(laptop.image)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgFoto)

        holder.tvBrandName.text = laptop.brandName
        holder.tvPrice.text = laptop.price

        holder.itemView.setOnClickListener {
            val moveIntentDesc = Intent(content, DescriptionActivity::class.java)
            moveIntentDesc.putExtra(DescriptionActivity.LAPTOP_IMAGE, laptop.image)
            moveIntentDesc.putExtra(DescriptionActivity.LAPTOP_BRAND, laptop.brandName)
            moveIntentDesc.putExtra(DescriptionActivity.LAPTOP_PRICE, laptop.price)
            moveIntentDesc.putExtra(DescriptionActivity.LAPTOP_SCREEN, laptop.screen)
            moveIntentDesc.putExtra(DescriptionActivity.LAPTOP_PROCESSOR, laptop.processor)
            moveIntentDesc.putExtra(DescriptionActivity.LAPTOP_GRAPHIC, laptop.graphic)
            moveIntentDesc.putExtra(DescriptionActivity.LAPTOP_RAM, laptop.ram)
            moveIntentDesc.putExtra(DescriptionActivity.LAPTOP_STORAGE, laptop.storage)
            moveIntentDesc.putExtra(DescriptionActivity.LAPTOP_BATTERY, laptop.battery)
            moveIntentDesc.putExtra(DescriptionActivity.URL_SHOPEE, laptop.shopeeLink)
            moveIntentDesc.putExtra(DescriptionActivity.URL_LAZADA, laptop.lazadaLink)
            moveIntentDesc.putExtra(DescriptionActivity.LAPTOP_DESC, laptop.detail)
            content.startActivity(moveIntentDesc)
        }
    }

    override fun getItemCount(): Int {
        return listLaptop.size
    }
}