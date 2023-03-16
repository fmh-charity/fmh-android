package ru.iteco.fmhandroid.ui

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputEditText
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentCreateEditPatientBinding
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.utils.Utils
import ru.iteco.fmhandroid.viewmodel.PatientViewModel
import java.util.*

@AndroidEntryPoint
class CreateEditPatientFragment : Fragment(R.layout.fragment_create_edit_patient) {
    private lateinit var vDateBirth: TextInputEditText
    private lateinit var vFactDateIn: TextInputEditText
    private lateinit var vFactDateOut: TextInputEditText
    private lateinit var binding: FragmentCreateEditPatientBinding
    private val viewModel: PatientViewModel by viewModels()
    private val args: CreateEditPatientFragmentArgs by navArgs()
    private lateinit var statusChoice: Patient.Status

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        lifecycleScope.launch {
            viewModel.patientCreateExceptionEvent.collect {
                showErrorToast(R.string.error_saving)
            }
        }
        lifecycleScope.launch {
            viewModel.patientEditExceptionEvent.collect {
                showErrorToast(R.string.error_saving)
            }
        }
        lifecycleScope.launch {
            viewModel.patientCreatedEvent.collect {
                findNavController().navigateUp()
            }
        }
        lifecycleScope.launch {
            viewModel.patientEditExceptionEvent.collect {
                findNavController().navigateUp()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCreateEditPatientBinding.bind(view)

        with(binding) {

            if (args.patientItemArg == null) {
                customAppBarTitleTextView.apply {
                    visibility = View.VISIBLE
                    setText(R.string.creating)
                    textSize = 18F
                }
            } else {
                customAppBarTitleTextView.apply {
                    visibility = View.VISIBLE
                    setText(R.string.editing)
                    textSize = 18F
                }
            }

            args.patientItemArg?.let { patient ->
                lastNameTextInputLayout.editText?.setText(patient.lastName)
                firstNameTitleTextInputLayout.editText?.setText(patient.firstName)
                middleNameTextInputLayout.editText?.setText(patient.middleName)
                createBirthDateTextInputLayout.editText?.setText(patient.birthDate)
                statusDropMenuTextInputLayout.editText?.setText(patient.status.toString())
            }

            saveButton.setOnClickListener {
                if (lastNameTextInputEditText.text.isNullOrBlank() ||
                    firstNameTextInputEditText.text.isNullOrBlank() ||
                    middleNameTextInputEditText.text.isNullOrBlank()
                ) {
                    showErrorToast(R.string.empty_fields)
                } else {
                    fillPatient()
                }
            }

            cancelButton.setOnClickListener {
                val activity = activity ?: return@setOnClickListener
                val dialog = AlertDialog.Builder(activity)
                dialog.setMessage(R.string.cancellation)
                    .setPositiveButton(R.string.fragment_positive_button) { alertDialog, _ ->
                        alertDialog.dismiss()
                        findNavController().navigateUp()
                    }
                    .setNegativeButton(R.string.cancel) { alertDialog, _ ->
                        alertDialog.cancel()
                    }
                    .create()
                    .show()
            }
        }

       lifecycleScope.launch {
            val adapter = ArrayAdapter(
                requireContext(),
                R.layout.menu_item,
                viewModel.statuses
            )
            binding.statusDropMenuAutoCompleteTextView.apply {
                setAdapter(adapter)
                setOnItemClickListener { _, _, position, _ ->
                    statusChoice = viewModel.statuses[position]
                }
            }
        }

        val calendar = Calendar.getInstance()
        vDateBirth = binding.createDateBirthTextInputEditText
        val dateBirth =
            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, month)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                Utils.updateDateLabelPatient(calendar, vDateBirth)
            }
        vDateBirth.setOnClickListener {
            DatePickerDialog(
                this.requireContext(),
                dateBirth,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).apply {
                this.datePicker.minDate = (0)
            }.show()
        }

        val calendarFDI = Calendar.getInstance()
      vFactDateIn = binding.factDateInTextInputEditText
        val factDateIn =
            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                calendarFDI.set(Calendar.YEAR, year)
                calendarFDI.set(Calendar.MONTH, month)
                calendarFDI.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                Utils.updateDateLabelPatient(calendarFDI, vFactDateIn)
            }
        vFactDateIn.setOnClickListener {
            DatePickerDialog(
                this.requireContext(),
                factDateIn,
                calendarFDI.get(Calendar.YEAR),
                calendarFDI.get(Calendar.MONTH),
                calendarFDI.get(Calendar.DAY_OF_MONTH)
            ).apply {
                this.datePicker.minDate = (0)
            }.show()
        }

        val calendarFDO = Calendar.getInstance()
        vFactDateOut = binding.factDateOutTextInputEditText
        val factDateOut =
            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                calendarFDO.set(Calendar.YEAR, year)
                calendarFDO.set(Calendar.MONTH, month)
                calendarFDO.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                Utils.updateDateLabelPatient(calendarFDO, vFactDateOut)
            }
        vFactDateOut.setOnClickListener {
            DatePickerDialog(
                this.requireContext(),
                factDateOut,
                calendarFDO.get(Calendar.YEAR),
                calendarFDO.get(Calendar.MONTH),
                calendarFDO.get(Calendar.DAY_OF_MONTH)
            ).apply {
                this.datePicker.minDate = (0)
            }.show()
        }
    }

    private fun fillPatient() {
        with(binding) {
            val patient = args.patientItemArg
            if (patient != null) {
                val editedPatient = Patient(
                    id = id,
                    firstName = patient.firstName,
                    lastName = patient.lastName,
                    middleName = patient.middleName,
                    birthDate = patient.birthDate,
                    dateIn = patient.dateIn,
                    dateOut = patient.dateOut,
                    dateInBoolean = true,
                    dateOutBoolean = true,
                    status = patient.status,
                    room = null
                )
                viewModel.edit(editedPatient)
            } else {
                val createNewPatient = Patient(
                    id = 0,
                    firstName = firstNameTextInputEditText.text.toString().trim(),
                    lastName = lastNameTextInputEditText.text.toString().trim(),
                    middleName = middleNameTextInputEditText.text.toString().trim(),
                    birthDate = vDateBirth.text.toString(),
                    dateIn = vFactDateIn.text.toString(),
                    dateOut = vFactDateOut.text.toString(),
                    dateInBoolean = true,
                    dateOutBoolean = true,
                    status = statusChoice.toString(),
                    room = null
                )
                viewModel.createNewPatient(createNewPatient)
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
}
