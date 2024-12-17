package com.example.bitesandtales.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bitesandtales.FoodDetailsActivity
import com.example.bitesandtales.databinding.PopularItemBinding

class PopularAdapter(private val items:List<String>,private val price:List<String>, private val image:List<Int>, private val requireContext : Context) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(PopularItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item = items[position]
        val image = image[position]
        val price = price[position]
        holder.bind(item, price, image)

        holder.itemView.setOnClickListener {
            //setonclicklistener to open details
            val intent = Intent(requireContext, FoodDetailsActivity::class.java)
            intent.putExtra("MenuItemName", item)
            intent.putExtra("MenuItemImage", image)
            requireContext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PopularViewHolder(private val binding: PopularItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private val imageView = binding.imageView
        fun bind(item: String, price: String, image: Int) {
            binding.foodNameTV.text = item
            binding.priceTV.text = price
            imageView.setImageResource(image)
        }

    }
}