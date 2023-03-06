package ru.iteco.fmhandroid.ui

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText
import dagger.hilt.android.AndroidEntryPoint
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentSearchPatientsBinding
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class SearchPatient: Fragment(R.layout.fragment_search_patients) {

    private lateinit var binding: FragmentSearchPatientsBinding
    private var lastNameSP: String = ""
    private var firstNameSP: String = ""
    private var middleNameSP: String = ""
    lateinit var tvDataPicker:TextInputEditText
    private var dataString =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSearchPatientsBinding.bind(view)

        lastNameSP = binding.lastNameTextInputEditText.text.toString()
        firstNameSP = binding.firstNameTextInputEditText.text.toString()
        middleNameSP = binding.middleNameTextInputEditText.text.toString()

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

        binding.searchPatientOkMaterialButton.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("lastNameSP", lastNameSP)
            bundle.putString("firstNameSP", firstNameSP)
            bundle.putString("middleNameSP", middleNameSP)
            bundle.putString("dateBirth", dataString)
            findNavController().navigate(R.id.patientListFragment, bundle)
        }

        binding.searchPatientCancelMaterialButton.setOnClickListener {
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

    private fun updateLabel(calendar: Calendar) {
        val formatData = "dd.MM.YYYY"
        val sdf = SimpleDateFormat(formatData, Locale.UK)
        tvDataPicker.setText(sdf.format(calendar.time))
        dataString = sdf.format(calendar.time)
    }
}