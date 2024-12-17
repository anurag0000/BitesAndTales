package com.example.bitesandtales.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bitesandtales.FoodDetailsActivity
import com.example.bitesandtales.databinding.MenuItemBinding

class MenuAdapter(private val menuItems:MutableList<String>, private val menuPrice:MutableList<String>, private val menuImage:MutableList<Int>, private val requireContext : Context) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    private val itemClickListener : OnClickListener ?= null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding = MenuItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MenuViewHolder(binding)
    }

    override fun getItemCount(): Int = menuItems.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class MenuViewHolder(private val binding: MenuItemBinding) : RecyclerView.ViewHolder(binding.root){

        init {
            binding.root.setOnClickListener {
                val position = adapterPosition
                if(position != RecyclerView.NO_POSITION){
                    itemClickListener?.onItemClick(position)
                }
                //setonclicklistener to open details
                val intent = Intent(requireContext, FoodDetailsActivity::class.java)
                intent.putExtra("MenuItemName", menuItems.get(position))
                intent.putExtra("MenuItemImage", menuImage.get(position))
                requireContext.startActivity(intent)
            }
        }
        fun bind(position: Int) {
            binding.apply {
                foodNameTV.text = menuItems[position]
                priceTV.text = menuPrice[position]
                menuIV.setImageResource(menuImage[position])

            }
        }

    }
    interface OnClickListener {
        fun onItemClick(position: Int)
    }
}


