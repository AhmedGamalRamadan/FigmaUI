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
import com.example.appssquareuidesign.R
import com.example.appssquareuidesign.databinding.FragmentCommingSoonEndBinding


class CommingSoonEndFragment : Fragment() {
    private lateinit var binding:FragmentCommingSoonEndBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCommingSoonEndBinding.inflate(layoutInflater)
         return binding.root
    }


}