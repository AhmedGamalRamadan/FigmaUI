package com.example.appssquareuidesign.ui.fragments

/*
*
* Created by Ahmed Gamal Ramadan
*
 */
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.appssquareuidesign.R
import com.example.appssquareuidesign.databinding.FragmentCommingSoonItemBinding

class CommingSoonItemFragment : Fragment() {

    private lateinit var binding: FragmentCommingSoonItemBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCommingSoonItemBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //to receive data from bundle when i click over item in recycler view
        val cityName = arguments?.getString("CityName")
        val cityReviews = arguments?.getString("CityReviews")
        val cityImage = arguments?.getInt("CityImage")

        binding.tvCityNameItem.text = cityName
        binding.tvCityReviewItem.text = cityReviews
        if (cityImage != null) {
            binding.cityImage.setImageResource(cityImage)
        }

        binding.iconBack.setOnClickListener {
            findNavController().navigate(R.id.action_commingSoonItemFragment_to_commingSoonItemsFragment)
        }
        binding.tvCityDescription.setOnClickListener {
            findNavController().navigate(R.id.action_commingSoonItemFragment_to_commingSoonEndFragment)
        }

    }
}