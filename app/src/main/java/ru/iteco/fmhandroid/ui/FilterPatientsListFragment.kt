package ru.iteco.fmhandroid.ui


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentPatientListFilterBinding

@AndroidEntryPoint
class FilterPatientsListFragment : Fragment(R.layout.fragment_patient_list_filter) {
        private lateinit var binding: FragmentPatientListFilterBinding
        private var expectedFPL: String = ""
        private var dischargedFPL: String = ""
        private var activeFPL: String = ""

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setHasOptionsMenu(true)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)
                binding = FragmentPatientListFilterBinding.bind(view)

                binding.itemFilterExpected.setOnCheckedChangeListener { _, IsChecked ->
                        if (IsChecked) {
                                expectedFPL = "EXPECTED"
                        }
                }

                binding.itemFilterDischarged.setOnCheckedChangeListener { _, IsChecked ->
                        if (IsChecked) {
                                dischargedFPL = "DISCHARGED"
                        }
                }

                binding.itemFilterActive.setOnCheckedChangeListener { _, IsChecked ->
                        if (IsChecked) {
                                activeFPL = "ACTIVE"
                        }
                }

                binding.patientFilterOkMaterialButton.setOnClickListener {
                        val bundle = Bundle()
                        bundle.putString("expected", expectedFPL)
                        bundle.putString("discharged", dischargedFPL)
                        bundle.putString("active", activeFPL)
                        findNavController().navigate(R.id.patientListFragment, bundle)
                }

                binding.patientFilterCancelMaterialButton.setOnClickListener {
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
}