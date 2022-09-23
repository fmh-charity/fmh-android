package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentListOfPostBinding

class ListOfPostFragment: Fragment(R.layout.fragment_list_of_post) {
    private lateinit var binding: FragmentListOfPostBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListOfPostBinding.bind(view)

        binding.addPostImageView.setOnClickListener {
            findNavController().navigate(R.id.action_listOfPostFragment_to_addPostFragment)
        }
    }
}
