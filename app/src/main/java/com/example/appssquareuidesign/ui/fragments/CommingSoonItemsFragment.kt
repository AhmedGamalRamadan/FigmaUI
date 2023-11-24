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
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appssquareuidesign.R
import com.example.appssquareuidesign.adapter.CityAdapter
import com.example.appssquareuidesign.databinding.FragmentCommingSoonItemsBinding
import com.example.appssquareuidesign.model.City

class CommingSoonItemsFragment : Fragment() {

    private lateinit var cityAdapter: CityAdapter
    private lateinit var binding :FragmentCommingSoonItemsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCommingSoonItemsBinding.inflate(layoutInflater)
         return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cityList =ArrayList<City>()
        cityList.add(City(R.drawable.city1,"Coeurdes Alpes","355"))
        cityList.add(City(R.drawable.city2,"Coeurdes Alpes","1000"))
        cityList.add(City(R.drawable.city3,"Coeurdes Alpes","2500"))
        cityList.add(City(R.drawable.city1,"Coeurdes Alpes","5000"))
        cityList.add(City(R.drawable.city3,"Coeurdes Alpes","2342"))
        cityList.add(City(R.drawable.city2,"Coeurdes Alpes","253"))
        cityList.add(City(R.drawable.city1,"Coeurdes Alpes","355"))
        cityList.add(City(R.drawable.city1,"Coeurdes Alpes","1500"))
        cityList.add(City(R.drawable.city3,"Coeurdes Alpes","500"))
        cityList.add(City(R.drawable.city2,"Coeurdes Alpes","355"))

        cityAdapter = CityAdapter(requireContext(),cityList)
        binding.rvCity.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter =cityAdapter
        }
    }

}