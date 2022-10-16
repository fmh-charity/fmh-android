package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentAddNurseStationsBinding

class AddNurseStationsFragment : Fragment(R.layout.fragment_add_nurse_stations) {
    private lateinit var binding: FragmentAddNurseStationsBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddNurseStationsBinding.bind(view)

    }

}