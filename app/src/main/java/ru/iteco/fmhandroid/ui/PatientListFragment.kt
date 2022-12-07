package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.adapter.PatientListAdapter
import ru.iteco.fmhandroid.databinding.FragmentListPatientBinding
import ru.iteco.fmhandroid.viewmodel.PatientViewModel


@AndroidEntryPoint
class PatientListFragment : Fragment(R.layout.fragment_list_patient) {
    private lateinit var binding: FragmentListPatientBinding
    private val viewModel: PatientViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        return super.onCreate(savedInstanceState)
//        lifecycleScope.launchWhenCreated {
//            viewModel.onRefresh()
//        }

   }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?, ) {
        super.onViewCreated(view, savedInstanceState)


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

        /** ---------------------------------------------------------------------------- **/
        binding.apply {
            containerListPatientInclude.allPatientsTextView.visibility = View.GONE
            containerListPatientInclude.expandMaterialButton.visibility = View.GONE
        }
        /** ---------------------------------------------------------------------------- **/
        val adapter = PatientListAdapter(viewModel)

        /** -------кнопка создания пациента----------------------------------------------------- **/
        binding.containerListPatientInclude.createNewPatientMaterialButton.setOnClickListener {
            findNavController().navigate(R.id.action_patientListFragment_to_createPatientFragment)
        }
        /** -------кнопка для фильтра пациента-------------------------------------------------- **/
        binding.containerListPatientInclude.filtersMaterialButton.setOnClickListener {
            //TODO фильтр перенесут на бэк. Возможно потом нужно удалить
            //findNavController().navigate(R.id.action_patientListFragment_to_filterPatientListFragment)
        }
        /** ---------------------------------------------------------------------------- **/

        with(binding) {
            containerListPatientInclude.patientListRecyclerView.adapter = adapter
        }

    }
}