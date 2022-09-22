package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentListOfBlockBinding

class ListOfBlockFragment: Fragment(R.layout.fragment_list_of_block) {
    private lateinit var binding: FragmentListOfBlockBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListOfBlockBinding.bind(view)

        binding.addBlockImageView.setOnClickListener {
            findNavController().navigate(R.id.action_listOfBlockFragment_to_addBlockFragment)
        }
    }
}