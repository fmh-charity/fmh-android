package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentListOfRoomBinding

class ListOfRoomFragment : Fragment(R.layout.fragment_list_of_room) {
    private lateinit var binding: FragmentListOfRoomBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListOfRoomBinding.bind(view)

        binding.addRoomImageView.setOnClickListener {
            findNavController().navigate(R.id.action_listOfRoomFragment_to_addRoomFragment2)
        }
    }

}
