package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentAddRoomBinding
import ru.iteco.fmhandroid.databinding.FragmentCreateEditClaimBinding

class AddRoomFragment : Fragment(R.layout.fragment_add_room) {

    private lateinit var binding: FragmentAddRoomBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddRoomBinding.bind(view)

        binding.addPatientImageView.setOnClickListener {
            if (binding.roomListAddPatientTextView.visibility == View.GONE) {
                binding.roomListAddPatientTextView.visibility = View.VISIBLE
            } else
                binding.roomListAddPatientTextView.visibility = View.GONE
        }
    }
}