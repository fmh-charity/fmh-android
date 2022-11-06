package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentCreatePatientBinding
import ru.iteco.fmhandroid.viewmodel.PatientViewModel


@AndroidEntryPoint
class CreatePatientFragment : Fragment(R.layout.fragment_create_patient) {
    private lateinit var binding: FragmentCreatePatientBinding
    private val viewModel: PatientViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCreatePatientBinding.bind(view)

    }


}