package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentAddPostBinding

class AddPostFragment : Fragment(R.layout.fragment_add_post) {
    private lateinit var binding: FragmentAddPostBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddPostBinding.bind(view)

    }

}