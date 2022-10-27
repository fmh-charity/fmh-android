package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentListOfNurseStationsBinding
import ru.iteco.fmhandroid.viewmodel.NurseStationViewModel

class ListOfNurseStationsFragment: Fragment(R.layout.fragment_list_of_nurse_stations) {
    private lateinit var binding: FragmentListOfNurseStationsBinding
    private val viewModel: NurseStationViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListOfNurseStationsBinding.bind(view)

        binding.addNurseStationsImageView.setOnClickListener {
            findNavController().navigate(R.id.action_listOfPostFragment_to_addPostFragment)
        }
    }
}
