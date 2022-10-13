package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentAddBlockBinding

class AddBlockFragment : Fragment(R.layout.fragment_add_block) {

    private lateinit var binding: FragmentAddBlockBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddBlockBinding.bind(view)

    }


}


