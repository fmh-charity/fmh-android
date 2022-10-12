package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentAddRoomBinding

class AddRoomFragment : Fragment(R.layout.fragment_card_room) {

    private lateinit var binding: FragmentAddRoomBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddRoomBinding.bind(view)

        binding.addPatientImageView.setOnClickListener {
            val view = requireActivity().layoutInflater.inflate(
                R.layout.fragment_dialog_patient,
                null
            )


        }
    }
}