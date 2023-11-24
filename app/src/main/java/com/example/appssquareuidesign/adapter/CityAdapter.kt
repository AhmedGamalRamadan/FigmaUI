package com.example.appssquareuidesign.adapter

/*
*
* Created by Ahmed Gamal Ramadan
*
 */
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.appssquareuidesign.R
import com.example.appssquareuidesign.databinding.CityRowBinding
import com.example.appssquareuidesign.model.City

class CityAdapter(val context: Context, val cityList: ArrayList<City>) :
    RecyclerView.Adapter<CityAdapter.CityViewHolder>() {


    class CityViewHolder(val binding: CityRowBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        return CityViewHolder(
            CityRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {

        return cityList.size
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {

        val cityPosition = cityList[position]

        //connect XML items to value from arrayList
        holder.binding.apply {
            cityCard.setImageResource(cityPosition.cityImage)
            tvCityName.text = cityPosition.cityName
            tvCityReviews.text = cityPosition.cityReviews
        }

        //set onclick on recyclerView
        holder.itemView.setOnClickListener {
            //put data into bundle
            val bundle = Bundle().apply {
                putString("CityName", cityPosition.cityName)
                putString("CityReviews", cityPosition.cityReviews)
                putInt("CityImage", cityPosition.cityImage)
            }

            holder.binding.root.findNavController()
                .navigate(R.id.action_commingSoonItemsFragment_to_commingSoonItemFragment, bundle)
        }
    }
}

// holder.itemView.findNavController().navigate()

