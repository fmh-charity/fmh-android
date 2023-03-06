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
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class CreateEditPatientFragment : Fragment(R.layout.fragment_create_edit_patient) {
    private lateinit var vDateBirth: TextInputEditText
    private lateinit var binding: FragmentCreateEditPatientBinding
    private val viewModel: PatientViewModel by viewModels()
    private val args: CreateEditPatientFragmentArgs by navArgs()
    lateinit var tvDataPicker:TextInputEditText
    private var dataString =""
    private var statusChoice: Patient.Status = Patient.Status.ACTIVE

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

            /** args **/
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

            /** кнопки **/
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

        /** выбор статуса **/
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



        /** Календарь **/
        tvDataPicker = binding.createDateBirthTextInputEditText
        val calendar = Calendar.getInstance()
        val datePicker =
            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, month)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateLabel(calendar)
            }

        binding.createDateBirthTextInputEditText.setOnClickListener {
            DatePickerDialog(
                this.requireContext(),
                datePicker,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        }
//        val calendar = Calendar.getInstance()
//        vDateBirth = binding.createDateBirthTextInputEditText
//        val dateBirth =
//            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
//                calendar.set(Calendar.YEAR, year)
//                calendar.set(Calendar.MONTH, month)
//                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
//                Utils.updateDateLabel(calendar, vDateBirth)
//            }
//        vDateBirth.setOnClickListener {
//            DatePickerDialog(
//                this.requireContext(),
//                dateBirth,
//                calendar.get(Calendar.YEAR),
//                calendar.get(Calendar.MONTH),
//                calendar.get(Calendar.DAY_OF_MONTH)
//            ).apply {
//                this.datePicker.minDate = (0)
//            }.show()
//        }
    }

    /** Функция добавления/редактирования пациента
     * Статус пациента (admission.status)
    Если есть фактическая дата выписки, то статус = "Выписан".
    Если есть фактическая дата поступления и нет фактической даты выписки, то статус = "В хосписе".
    Если нет фактических дат (ни поступления, ни выписки), то статус = "Новый".**/
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
                    id = null,
                    firstName = firstNameTextInputEditText.text.toString().trim(),
                    lastName = lastNameTextInputEditText.text.toString().trim(),
                    middleName = middleNameTextInputEditText.text.toString().trim(),
                    birthDate = dataString,
                    dateIn = "",
                    dateOut = "",
                    dateInBoolean = true,
                    dateOutBoolean = true,
                    status = Patient.Status.ACTIVE.toString(),
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

    private fun updateLabel(calendar: Calendar) {
        val formatData = "dd.MM.YYYY"
        val sdf = SimpleDateFormat(formatData, Locale.UK)
        tvDataPicker.setText(sdf.format(calendar.time))
        dataString = sdf.format(calendar.time)
    }
}
