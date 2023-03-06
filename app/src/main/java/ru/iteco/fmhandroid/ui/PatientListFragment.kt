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
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.viewmodel.PatientViewModel

@AndroidEntryPoint
class PatientListFragment : Fragment(R.layout.fragment_list_patient) {
    private lateinit var binding: FragmentListPatientBinding
    private val viewModel: PatientViewModel by viewModels()
    private var tempList = mutableListOf<Patient>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        return super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.refreshPatients()

        binding = FragmentListPatientBinding.bind(view)
        filterPatient()
        appBarPatient()
        mainMenuPatient()

//        val test = viewModel.getAllPatients()
//        val testID= viewModel.getPatientById(150)
//        val test1 = ""

        binding.containerListPatientInclude.createNewPatientMaterialButton.setOnClickListener {
            findNavController().navigate(R.id.action_patientListFragment_to_createPatientFragment)
        }

        binding.containerListPatientInclude.filtersMaterialButton.setOnClickListener {
            findNavController().navigate(R.id.action_patientListFragment_to_filterPatientListFragment)
        }
        binding.containerListPatientInclude.searchPatient.setOnClickListener{
            findNavController().navigate(R.id.action_patientListFragment_to_searchPatient)
        }

        val adapter = PatientListAdapter(viewModel)
        adapter.submitList(tempList)
        binding.containerListPatientInclude.patientListRecyclerView.adapter = adapter
    }

    private fun filterPatient(){
        val expected = arguments?.getString("expected")
        val discharged = arguments?.getString("discharged")
        val active = arguments?.getString("active")
        var startList = ""
        if (expected.isNullOrEmpty()
            && discharged.isNullOrEmpty()
            && active.isNullOrEmpty()
        ) {
            startList = "ACTIVE"
        }
        viewModel.data.forEach { element ->
            if (element.status == expected
                || element.status== discharged
                || element.status == active
                || element.status== startList
            ) {
                tempList.add(element)
            }
        }
    }
    private fun appBarPatient(){
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
    }
    private fun mainMenuPatient(){
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
    }
}


/**СЦЕНАРИЙ 2.1. Просмотр списка пациентов
 * Открыть список пациентов с просмотром ключевой информации о нем
 * Пользователи: Пользователи с ролями «Администратор» и «Медицинский работник»
 * Предусловие:Пользователь авторизован в системе. В разделе «Пациенты» присутствуют
 * введенная информация согласно сценария 2.2
 * Результат: Открыт список пациентов с информацией о каждом пациенте
 * */





/**3.  В экранной форме списка пациентов данные детализированы на следующие атрибуты:
ФИО
Дата рождения
Cтатус
4.Система отражает перечень пациентов "В хосписе" (по умолчанию)*/
