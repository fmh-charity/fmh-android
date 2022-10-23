package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentListOfNurseStationsBinding

class ListOfNurseStationsFragment: Fragment(R.layout.fragment_list_of_nurse_stations) {
    private lateinit var binding: FragmentListOfNurseStationsBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListOfNurseStationsBinding.bind(view)

        binding.addNurseStationsImageView.setOnClickListener {
            findNavController().navigate(R.id.action_listOfPostFragment_to_addPostFragment)
        }
    }
}
