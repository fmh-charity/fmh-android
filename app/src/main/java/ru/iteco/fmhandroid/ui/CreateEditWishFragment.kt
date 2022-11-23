package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentCreateWishBinding
import ru.iteco.fmhandroid.dto.User
import ru.iteco.fmhandroid.dto.Wish
import ru.iteco.fmhandroid.utils.Utils
import ru.iteco.fmhandroid.viewmodel.WishCardViewModel
import java.time.LocalDateTime

@AndroidEntryPoint
class CreateEditWishFragment : Fragment(R.layout.fragment_create_wish) {
    private lateinit var binding: FragmentCreateWishBinding
    private val wishCardViewModel: WishCardViewModel by viewModels()
    private val args: CreateEditWishFragmentArgs by navArgs()
    private var executor: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            wishCardViewModel.createWishExceptionEvent.collect {
                showErrorToast(R.string.error)
            }
        }
        lifecycleScope.launch {
            wishCardViewModel.wishUpdateExceptionEvent.collect {
                showErrorToast(R.string.error)
            }
        }
        lifecycleScope.launch {
            wishCardViewModel.wishCreatedEvent.collect {
                findNavController().navigateUp()
            }
        }
        lifecycleScope.launch {
            wishCardViewModel.wishUpdatedEvent.collect {
                findNavController().navigateUp()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCreateWishBinding.bind(view)


        with(binding) {

            /** ------------кнопки------------------------------------------------------------- **/
            containerWishInclude.cancelButton.setOnClickListener {
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

            containerWishInclude.saveButton.setOnClickListener {
                val activity = activity ?: return@setOnClickListener

                    if (containerWishInclude.titleTextInputEditText.text.isNullOrBlank() ||
                        containerWishInclude.descriptionTextInputEditText.text.isNullOrBlank()

                    ) {
                        showErrorToast(R.string.empty_fields)
                    } else {
                        fillWish()

                    }
                }
        }
    }

    /** ------------заполняю поля------------------------------------------------------------- **/
    private fun fillWish() {
        with(binding) {
            val fullWish = args.argWish
            if (fullWish != null) {
                val editedWish = Wish(
                    id = fullWish.wish.id,
                    patientId = 1, //TODO Выбор значения из списка Пациентов
                    title = containerWishInclude.titleTextInputEditText.text.toString(),
                    description = containerWishInclude.descriptionTextInputEditText.text.toString(),
                    creatorId = fullWish.wish.creatorId,
                    executorId = executor?.id,
                    createDate = fullWish.wish.createDate,
                    planExecuteDate = fullWish.wish.planExecuteDate,
                    factExecuteDate = fullWish.wish.factExecuteDate,
                    status = fullWish.wish.status
                )
                wishCardViewModel.updateWish(editedWish)
            } else {
                val createdWish = Wish(
                    id = null,
                    patientId = 0, //TODO При создании Просьбы из карточки Пациента данное поле заполняется автоматически!
                    title = containerWishInclude.titleTextInputEditText.text.toString(),
                    description = containerWishInclude.descriptionTextInputEditText.text.toString(),
                    creatorId =  wishCardViewModel.currentUser.id,
                    executorId = executor?.id,
                    createDate =  Utils.fromLocalDateTimeToTimeStamp(
                        LocalDateTime.now()
                    ),
                    planExecuteDate = Utils.fromLocalDateTimeToTimeStamp(
                        LocalDateTime.now()
                    ), //TODO Значение поля "plan_execute_date" таблицы wish.
                    factExecuteDate = Utils.fromLocalDateTimeToTimeStamp(
                        LocalDateTime.now()
                    ), //TODO Значение поля “fact_execute_date” таблицы wish. Если поле  “fact_execute_date” не заполнено, то отображается надпись «Не исполнена».
                    status = Wish.Status.OPEN
                )
                wishCardViewModel.save(createdWish)
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
