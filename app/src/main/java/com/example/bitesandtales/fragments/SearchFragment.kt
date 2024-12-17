package com.example.bitesandtales.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bitesandtales.R
import com.example.bitesandtales.adapter.MenuAdapter
import com.example.bitesandtales.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding
    private lateinit var adapter: MenuAdapter
    private val originalMenuFoodName = mutableListOf("Herbal Pancake","Fruit Salad", "Green Noddle","Dal Makhani","Pasta", "Herbal Pancake","Fruit Salad", "Green Noddle","Dal Makhani","Pasta")
    private val originalMenuFoodPrice = mutableListOf("$5","$2", "$3","$10", "8$","$5","$2", "$3","$10", "8$")
    private val originalMenuFoodImages = mutableListOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4, R.drawable.menu5, R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4, R.drawable.menu5)

    private val filteredMenuFoodName = mutableListOf<String>()
    private val filteredMenuFoodPrice = mutableListOf<String>()
    private val filteredMenuFoodImages = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        adapter = MenuAdapter(filteredMenuFoodName,filteredMenuFoodPrice,filteredMenuFoodImages, requireContext())
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter

        //setup for search view
        setupSearchView()

        // show all menu
        showAllMenu()

        return binding.root
    }

    private fun showAllMenu() {
        filteredMenuFoodName.clear()
        filteredMenuFoodPrice.clear()
        filteredMenuFoodImages.clear()

        filteredMenuFoodName.addAll(originalMenuFoodName)
        filteredMenuFoodPrice.addAll(originalMenuFoodPrice)
        filteredMenuFoodImages.addAll(originalMenuFoodImages)

        adapter.notifyDataSetChanged()


    }

    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                filterMenuItem(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                filterMenuItem(newText)
                return true
            }

        })
    }

    private fun filterMenuItem(query: String) {
        filteredMenuFoodName.clear()
        filteredMenuFoodPrice.clear()
        filteredMenuFoodImages.clear()

        originalMenuFoodName.forEachIndexed{ index, foodname ->
            if(foodname.contains(query, ignoreCase = true)){
                filteredMenuFoodName.add(foodname)
                filteredMenuFoodPrice.add(originalMenuFoodPrice[index])
                filteredMenuFoodImages.add(originalMenuFoodImages[index])
            }

        }
        adapter.notifyDataSetChanged()

    }
}