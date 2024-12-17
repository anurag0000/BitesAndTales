package com.example.bitesandtales.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bitesandtales.R
import com.example.bitesandtales.adapter.MenuAdapter
import com.example.bitesandtales.adapter.PopularAdapter
import com.example.bitesandtales.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MenuBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentMenuBottomSheetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMenuBottomSheetBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val foodName = mutableListOf("Herbal Pancake","Fruit Salad", "Green Noddle","Dal Makhani","Pasta", "Herbal Pancake","Fruit Salad", "Green Noddle","Dal Makhani","Pasta")
        val foodPrice = mutableListOf("$5","$2", "$3","$10", "8$","$5","$2", "$3","$10", "8$")
        val foodImages = mutableListOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4, R.drawable.menu5, R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4, R.drawable.menu5)

        val adapter = MenuAdapter(foodName,foodPrice,foodImages,requireContext())
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter

        binding.backButton.setOnClickListener {
            dismiss()
        }
    }

}