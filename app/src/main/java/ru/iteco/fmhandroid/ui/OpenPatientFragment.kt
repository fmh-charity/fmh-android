package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.adapter.OnPatientItemClickListener
import ru.iteco.fmhandroid.adapter.PatientListAdapter
import ru.iteco.fmhandroid.databinding.FragmentOpenPatientBinding
import ru.iteco.fmhandroid.dto.*
import ru.iteco.fmhandroid.utils.Utils
import ru.iteco.fmhandroid.viewmodel.AuthViewModel
import ru.iteco.fmhandroid.viewmodel.PatientViewModel

class OpenPatientFragment : Fragment(R.layout.fragment_open_patient) {
    private lateinit var binding: FragmentOpenPatientBinding
    private val args: OpenPatientFragmentArgs by navArgs()
    private val patientViewModel: PatientViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_open_patient, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentOpenPatientBinding.bind(view)
        appBarPatient()
        mainMenuPatient()

//        val adapter = PatientListAdapter(object : OnPatientItemClickListener {
//            override fun onCard(patient: Patient) {
//                patientViewModel.onCard(patient)
//            }
//        })

        binding.editDataPatientButton.setOnClickListener {
            val action = OpenPatientFragmentDirections
                .actionOpenPatientFragmentToCreateEditPatientFragment(args.argPatient)
            findNavController().navigate(action)
        }



        if(args.argPatient.status == Patient.Status.ACTIVE.toString()){
            binding.factDateInTextView.visibility = View.GONE
            binding.factDateInLabelTextView.visibility = View.GONE
            binding.factDateOutTextView.visibility = View.GONE
            binding.factDateOutLabelTextView.visibility = View.GONE
            binding.patientRoomTextView.visibility = View.GONE
            binding.patientRoomLabelTextView.visibility = View.GONE
        } else if(args.argPatient.status == Patient.Status.EXPECTED.toString()){
            binding.factDateOutTextView.visibility = View.GONE
            binding.factDateOutLabelTextView.visibility = View.GONE
        }
        renderingContentOfClaim(args.argPatient)
    }

    private fun showErrorToast(text: Int) {
        Toast.makeText(
            requireContext(),
            text,
            Toast.LENGTH_LONG
        ).show()
    }

//    private fun displayingStatusOfPatient(patientStatus: Patient.Status) =
//        when (patientStatus) {
//            Patient.Status.ACTIVE -> getString(R.string.status_patient_new)
//            Patient.Status.EXPECTED -> getString(R.string.status_patient_in_hospice)
//            Patient.Status.DISCHARGED -> getString(R.string.status_patient_discharged)
//        }

    private fun renderingContentOfClaim(patient: Patient) {
        binding.dataPatientInitialsTextView.text=Utils.generateShortUserNameForPatient(
            patient.lastName,
            patient.firstName,
            patient.middleName
        )
        binding.lastNameTextView.text = patient.lastName
        binding.firstNameTextView.text = patient.firstName
        binding.middleNameTextView.text = patient.middleName
        binding.birthDateTextView.text = patient.birthDate
        binding.factDateInTextView.text = patient.dateIn
        binding.factDateOutTextView.text = patient.dateOut
        binding.statusTextView.text = patient.status
        binding.patientRoomTextView.text = patient.room.toString()
    }


    private fun appBarPatient(){
        binding.containerCustomAppBarIncludeOnFragmentOpenPatient.ourMissionImageButton.setOnClickListener {
            findNavController().navigate(R.id.action_openPatientFragment_to_our_mission_fragment)
        }
        val authorizationMenu = PopupMenu(
            context,
            binding.containerCustomAppBarIncludeOnFragmentOpenPatient.authorizationImageButton
        )
        authorizationMenu.inflate(R.menu.authorization)

        binding.containerCustomAppBarIncludeOnFragmentOpenPatient.authorizationImageButton.setOnClickListener {
            authorizationMenu.show()
        }
    }
    private fun mainMenuPatient(){
        val mainMenu = PopupMenu(
            context,
            binding.containerCustomAppBarIncludeOnFragmentOpenPatient.mainMenuImageButton
        )
        mainMenu.inflate(R.menu.menu_main)
        val menuItemMain = mainMenu.menu.getItem(3)
        menuItemMain.isEnabled = false
        binding.containerCustomAppBarIncludeOnFragmentOpenPatient.mainMenuImageButton.setOnClickListener {
            mainMenu.show()
        }

        mainMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu_item_main -> {
                    findNavController().navigate(R.id.action_openPatientFragment_to_our_mission_fragment)
                    true
                }
                R.id.menu_item_claims -> {
                    findNavController().navigate(R.id.action_openPatientFragment_to_claimListFragment)
                    true
                }
                R.id.menu_item_news -> {
                    findNavController().navigate(R.id.action_openPatientFragment_to_newsListFragment)
                    true
                }
                R.id.menu_item_about -> {
                    findNavController().navigate(R.id.action_openPatientFragment_to_aboutFragment)
                    true
                }
                R.id.menu_item_wish -> {
                    findNavController().navigate(R.id.action_openPatientFragment_to_wishListFragment)
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}