package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentCreateWishBinding
import ru.iteco.fmhandroid.viewmodel.WishCardViewModel

@AndroidEntryPoint
class CreateWishFragment : Fragment(R.layout.fragment_create_wish) {
    private lateinit var binding: FragmentCreateWishBinding
    private val wishCardViewModel: WishCardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCreateWishBinding.bind(view)

        with(binding) {

            cancelButton.setOnClickListener {
                val activity = activity ?: return@setOnClickListener
                val dialog = android.app.AlertDialog.Builder(activity)
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

            saveButton.setOnClickListener {
                val activity = activity ?: return@setOnClickListener
                val dialog = android.app.AlertDialog.Builder(activity)
                if (commentTextInputLayout.editText?.text.isNullOrBlank()) {
                    dialog.setMessage(R.string.empty_fields)
                        .setPositiveButton(R.string.fragment_positive_button) { alertDialog, _ ->
                            alertDialog.cancel()
                        }
                        .create()
                        .show()
                } else {

                }
            }
        }

    }
}
