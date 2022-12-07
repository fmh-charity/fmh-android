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
import java.time.LocalDateTime
import java.util.*


@AndroidEntryPoint
class CreateEditPatientFragment : Fragment(R.layout.fragment_create_edit_patient) {
    private lateinit var vDateBirth: TextInputEditText
    private lateinit var binding: FragmentCreateEditPatientBinding
    private val viewModel: PatientViewModel by viewModels()
    private val args: CreateEditPatientFragmentArgs by navArgs()
    private var statusChoice: Patient.Status = Patient.Status.NEW


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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

        /** -------------------------------------------------------------------------------- **/
        with(binding) {

            /** ------------args------------------------------------------------------------ **/
            //TODO аргументы
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
                createBirthDateTextInputLayout.editText?.setText(patient.birthDate.toString())
                statusDropMenuTextInputLayout.editText?.setText(patient.status.toString())
            }

            /** ------------кнопки------------------------------------------------------------ **/
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

        /** ------------выбор статуса---------------------------------------------------------- **/
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

        /** ------------Календарь дата рождения------------------------------------------------ **/
        val calendar = Calendar.getInstance()
        vDateBirth = binding.createDateBirthTextInputEditText

        val dateBirth =
            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, month)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                Utils.updateDateLabel(calendar, vDateBirth)
            }
        vDateBirth.setOnClickListener {
            DatePickerDialog(
                this.requireContext(),
                dateBirth,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).apply {
                this.datePicker.minDate = (System.currentTimeMillis() - 1000)
            }.show()
        }

    }

    private fun fillPatient() {
        with(binding) {
            val patient = args.patientItemArg
            if (patient != null) {
                val editedPatient = Patient(
                    id = patient.id,
                    firstName = patient.firstName,
                    lastName = patient.lastName,
                    middleName = patient.middleName,
                    birthDate = patient.birthDate,
                    status = patient.status,
                    factDateIn = 0L,
                    factDateOut = 0L,
                    roomId = 0L
                )
                viewModel.edit(patient)
            } else {
                val createdPatient = Patient(
                    id = null,
                    firstName = firstNameTextInputEditText.text.toString().trim(),
                    lastName = lastNameTextInputEditText.text.toString().trim(),
                    middleName = middleNameTextInputEditText.text.toString().trim(),
                    birthDate = Utils.fromLocalDateTimeToTimeStamp(
                        LocalDateTime.now()
                    ),
                    status = statusChoice,
                    factDateIn = 0L,
                    factDateOut = 0L,
                    roomId = 0L
                )
                viewModel.save(createdPatient)
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
