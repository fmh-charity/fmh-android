package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentOpenPatientBinding
import ru.iteco.fmhandroid.dto.*
import ru.iteco.fmhandroid.viewmodel.AuthViewModel

class OpenPatientFragment : Fragment(R.layout.fragment_open_patient) {
    private lateinit var binding: FragmentOpenPatientBinding
    private val authViewModel: AuthViewModel by viewModels()


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

        /** -------AppBar ---------------------------------------------------------------------- **/

        val mainMenu = PopupMenu(
            context,
            binding.containerCustomAppBarIncludeOnFragmentOpenPatient.mainMenuImageButton
        )
        mainMenu.inflate(R.menu.menu_main)
        binding.containerCustomAppBarIncludeOnFragmentOpenPatient.mainMenuImageButton.setOnClickListener {
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

        binding.containerCustomAppBarIncludeOnFragmentOpenPatient.ourMissionImageButton.setOnClickListener {
            findNavController().navigate(R.id.action_openClaimFragment_to_our_mission_fragment)
        }

        val authorizationMenu = PopupMenu(
            context,
            binding.containerCustomAppBarIncludeOnFragmentOpenPatient.authorizationImageButton
        )
        authorizationMenu.inflate(R.menu.authorization)

        binding.containerCustomAppBarIncludeOnFragmentOpenPatient.authorizationImageButton.setOnClickListener {
            authorizationMenu.show()
        }

        authorizationMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.authorization_logout_menu_item -> {
                    authViewModel.logOut()
                    findNavController().navigate(R.id.action_openClaimFragment_to_authFragment)
                    true
                }
                else -> false
            }
        }

    }

    private fun showErrorToast(text: Int) {
        Toast.makeText(
            requireContext(),
            text,
            Toast.LENGTH_LONG
        ).show()
    }

    private fun displayingStatusOfPatient(patientStatus: Patient.Status) =
        when (patientStatus) {
            Patient.Status.NEW -> getString(R.string.status_patient_new)
            Patient.Status.IN_HOSPICE -> getString(R.string.status_patient_in_hospice)
            Patient.Status.DISCHARGED -> getString(R.string.status_patient_discharged)
        }

    private fun renderingContentOfClaim(fullPatient: FullPatient) {
        binding.lastNameTextView.text = fullPatient.patient.lastName
        binding.firstNameTextView.text = fullPatient.patient.firstName
        binding.middleNameTextView.text = fullPatient.patient.middleName
        binding.birthDateTextView.text = fullPatient.patient.birthDate.toString()
        binding.dateFromTextView.text = fullPatient.patient.factDateIn.toString()
        binding.dateToTextView.text = fullPatient.patient.factDateOut.toString()
        binding.statusLabelTextView.text = displayingStatusOfPatient(fullPatient.patient.status)
        binding.patientRoomTextView.text = fullPatient.patient.roomId.toString()

    }

}