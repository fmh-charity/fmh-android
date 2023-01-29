package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.adapter.PatientListAdapter
import ru.iteco.fmhandroid.databinding.FragmentListPatientBinding
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.viewmodel.PatientViewModel

@AndroidEntryPoint
class PatientListFragment : Fragment(R.layout.fragment_list_patient) {
    private lateinit var binding: FragmentListPatientBinding
    private val viewModel: PatientViewModel by viewModels()
    private var tempList = emptyList<Patient>()
    private lateinit var statusChoice: Patient.Status

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        return super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //viewModel.deletePatient(139)



        binding = FragmentListPatientBinding.bind(view)

        val mainMenu = PopupMenu(
            context,
            binding.containerCustomAppBarIncludeOnFragmentListPatient.mainMenuImageButton
        )
        mainMenu.inflate(R.menu.menu_main)
        val menuItemMain = mainMenu.menu.getItem(3)
        menuItemMain.isEnabled = false
        binding.containerCustomAppBarIncludeOnFragmentListPatient.mainMenuImageButton.setOnClickListener {
            mainMenu.show()
        }

        mainMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu_item_main -> {
                    findNavController().navigate(R.id.action_patientListFragment_to_mainFragment)
                    true
                }
                R.id.menu_item_claims -> {
                    findNavController().navigate(R.id.action_patientListFragment_to_claimListFragment)
                    true
                }
                R.id.menu_item_news -> {
                    findNavController().navigate(R.id.action_patientListFragment_to_newsListFragment)
                    true
                }
                R.id.menu_item_about -> {
                    findNavController().navigate(R.id.action_patientListFragment_to_aboutFragment)
                    true
                }
                R.id.menu_item_wish -> {
                    findNavController().navigate(R.id.action_patientListFragment_to_wishListFragment)
                    true
                }
                else -> {
                    false
                }
            }
        }

        binding.containerCustomAppBarIncludeOnFragmentListPatient.ourMissionImageButton.setOnClickListener {
            findNavController().navigate(R.id.action_patientListFragment_to_our_mission_fragment)
        }

        val authorizationMenu = PopupMenu(
            context,
            binding.containerCustomAppBarIncludeOnFragmentListPatient.authorizationImageButton
        )
        authorizationMenu.inflate(R.menu.authorization)

        binding.containerCustomAppBarIncludeOnFragmentListPatient.authorizationImageButton.setOnClickListener {
            authorizationMenu.show()
        }






        /** кнопка создания пациента **/
        binding.containerListPatientInclude.createNewPatientMaterialButton.setOnClickListener {
            findNavController().navigate(R.id.action_patientListFragment_to_createPatientFragment)
        }
        /** кнопка для фильтра пациента **/
        binding.containerListPatientInclude.filtersMaterialButton.setOnClickListener {
             findNavController().navigate(R.id.action_patientListFragment_to_filterPatientListFragment)
        }

        /** поиск **/
        binding.containerListPatientInclude.searchPatient.setOnQueryTextListener(object :
            SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean = true

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }
        })

        /**Система отражает перечень пациентов "В хосписе" (по умолчанию)*/


        viewModel.data.forEach { element->
            if(element.status == Patient.Status.ACTIVE.toString()){
                tempList.plus(element)
            }
        }
//        for(i in viewModel.data) {
//         if(i.status == Patient.Status.ACTIVE.toString()){
//             tempList.plus(i)
//        }
//        }

        val adapter = PatientListAdapter(viewModel)
        adapter.submitList(tempList)
        binding.containerListPatientInclude.patientListRecyclerView.adapter = adapter
    }
}



