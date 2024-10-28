package com.example.bitesandtales.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bitesandtales.databinding.CartItemBinding
import com.example.bitesandtales.databinding.PopularItemBinding

class CartAdapter(private val cartItems:MutableList<String>, private val cartPrice:MutableList<String>, private val cartImage:MutableList<Int>) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    private val itemQuantity = IntArray(cartItems.size){1}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
//        val item = items[position]
//        val image = image[position]
//        val price = price[position]
        holder.bind(position)
    }

    override fun getItemCount(): Int = cartItems.size

    inner class CartViewHolder(private val binding: CartItemBinding) : RecyclerView.ViewHolder(binding.root) {
        //private val imageView = binding.imageView
//        fun bind(item: String, price: String, image: Int) {
//            binding.foodNameTV.text = item
//            binding.priceTV.text = price
//            imageView.setImageResource(image)
//        }

        fun bind(position: Int){
            binding.apply {
                val quantity = itemQuantity[position]
                foodNameTV.text = cartItems[position]
                priceTV.text = cartPrice[position]
                imageView.setImageResource(cartImage[position])
                quantityTV.text = quantity.toString()

                substractItemButton.setOnClickListener {
                    decreaseQuantity(position)
                }

                addItemButton.setOnClickListener {
                    increaseQuantity(position)
                }

                deleteButton.setOnClickListener {
                    val itemPosition = adapterPosition
                    if(itemPosition != RecyclerView.NO_POSITION)
                        deleteItem(position)
                }

            }

        }
        private fun decreaseQuantity(position: Int){
            if(itemQuantity[position] > 1){
                itemQuantity[position]--
                binding.quantityTV.text = itemQuantity[position].toString()
            }
        }
        private fun increaseQuantity(position: Int){
            if(itemQuantity[position] < 10){
                itemQuantity[position]++
                binding.quantityTV.text = itemQuantity[position].toString()
            }
        }
        private fun deleteItem(position: Int){
            cartItems.removeAt(position)
            cartPrice.removeAt(position)
            cartImage.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position,cartItems.size)
        }

    }
}