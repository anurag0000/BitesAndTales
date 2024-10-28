package com.example.bitesandtales.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.bitesandtales.R
import com.example.bitesandtales.adapter.CartAdapter
import com.example.bitesandtales.adapter.PopularAdapter
import com.example.bitesandtales.databinding.FragmentCartBinding
import com.example.bitesandtales.databinding.FragmentHomeBinding


class CartFragment : Fragment() {

    private lateinit var binding : FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val foodName = mutableListOf("Fruit Salad", "Herbal Pancake","Dal Makhani", "Green Noddle","Pasta")
        val foodPrice = mutableListOf("$2","$5","$10", "$3", "8$")
        val cartFoodImages = mutableListOf(R.drawable.menu2,R.drawable.menu1,R.drawable.menu4,R.drawable.menu3, R.drawable.menu5)

        val adapter = CartAdapter(foodName,foodPrice,cartFoodImages)
        binding.addCartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.addCartRecyclerView.adapter = adapter
    }
}