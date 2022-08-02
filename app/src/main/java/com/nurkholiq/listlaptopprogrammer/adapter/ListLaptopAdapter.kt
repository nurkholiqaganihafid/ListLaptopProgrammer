package com.nurkholiq.listlaptopprogrammer.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.nurkholiq.listlaptopprogrammer.R
import com.nurkholiq.listlaptopprogrammer.model.Laptop

class ListLaptopAdapter(private val listLaptop: ArrayList<Laptop>, val orientation: String) :
    RecyclerView.Adapter<ListLaptopAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvBrandName: TextView = itemView.findViewById(R.id.tv_brand)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_price)

        //        var tvBrandName: TextView = itemView.findViewById(R.id.tv_brand)
        var imgFoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        lateinit var view: View

        if (orientation == "horizontal") {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_laptop_programmer, parent, false)
        }
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val laptop = listLaptop[position]
        val content = holder.itemView.context

        Glide.with(content)
            .load(laptop.image)
//            .apply(RequestOptions().override(200, 200))
            .into(holder.imgFoto)

        holder.tvBrandName.text = laptop.brandName
        holder.tvPrice.text = laptop.price

        holder.itemView.setOnClickListener {
            Toast.makeText(
                content,
                "Product not available " + listLaptop[position].brandName,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return listLaptop.size
    }
}