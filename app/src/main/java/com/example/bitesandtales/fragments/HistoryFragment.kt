package com.example.bitesandtales.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bitesandtales.R
import com.example.bitesandtales.adapter.BuyAgainAdapter
import com.example.bitesandtales.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {

    private lateinit var binding : FragmentHistoryBinding
    private lateinit var buyAgainAdapter : BuyAgainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHistoryBinding.inflate(layoutInflater, container, false)
        setupRecyclerView()
        return binding.root
    }

    private fun setupRecyclerView(){

        val buyAgainFoodName = arrayListOf("Fruit Salad", "Herbal Pancake","Dal Makhani", "Green Noddle","Pasta")
        val buyAgainFoodPrice = arrayListOf("$2","$5","$10", "$3", "8$")
        val buyAgainFoodImages = arrayListOf(R.drawable.menu2,R.drawable.menu1,R.drawable.menu4,R.drawable.menu3, R.drawable.menu5)

        buyAgainAdapter = BuyAgainAdapter(buyAgainFoodName,buyAgainFoodPrice,buyAgainFoodImages)
        binding.buyAgainRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.buyAgainRecyclerView.adapter = buyAgainAdapter
    }
}