package ru.iteco.fmhandroid.ui


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.iteco.fmhandroid.R

class FilterPatientsListFragment: Fragment(R.layout.fragment_patient_list_filter) {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setHasOptionsMenu(true)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)

        }
        }