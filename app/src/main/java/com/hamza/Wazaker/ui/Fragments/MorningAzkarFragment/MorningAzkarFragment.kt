package com.hamza.Wazaker.ui.Fragments.MorningAzkarFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.hamza.Wazaker.Data.DataSets.MorningAzkarDataset
import com.hamza.Wazaker.Data.Models.ZekerModel
import com.ikbala.muslimdua.databinding.FragmentMorningAzkarBinding
import java.util.*


class MorningAzkarFragment : Fragment() {

    private var _binding: FragmentMorningAzkarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        _binding = FragmentMorningAzkarBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(context)
        binding.morRecyclerview.layoutManager = layoutManager

        val adapter =
            MorningAzkarAdapter(
                MorningAzkarDataset.getMorningAzkar() as ArrayList<ZekerModel>?
            )
        binding.morRecyclerview.adapter = adapter

    }

}