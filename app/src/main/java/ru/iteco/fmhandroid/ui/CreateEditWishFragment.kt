package ru.iteco.fmhandroid.ui

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
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
import ru.iteco.fmhandroid.databinding.FragmentCreateWishBinding
import ru.iteco.fmhandroid.dto.User
import ru.iteco.fmhandroid.dto.Wish
import ru.iteco.fmhandroid.utils.Utils
import ru.iteco.fmhandroid.viewmodel.WishCardViewModel
import java.time.LocalDateTime
import java.util.*

@AndroidEntryPoint
class CreateEditWishFragment : Fragment(R.layout.fragment_create_wish) {
    private lateinit var vPlanExecuteDate: TextInputEditText
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

            /** ------------args------------------------------------------------------------ **/
            //TODO аргументы
            if (args.argWish == null) {
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
            args.argWish.let { wish ->
                if (wish != null) {

                    containerWishInclude.titleTextInputEditText.setText(wish.wish.title)
                    containerWishInclude.descriptionTextInputEditText.setText(wish.wish.description)
                    containerWishInclude.executorTextInputEditText.setText(wish.wish.executorId.toString())
                    containerWishInclude.planExecuteDateTextInputEditText.setText(wish.wish.planExecuteDate.toString())

                }
            }

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


        /** ------------выбор статуса---------------------------------------------------------- **/
//        lifecycleScope.launch {
//            val adapter = ArrayAdapter(
//                requireContext(),
//                R.layout.menu_item,
//                wishCardViewModel.statuses
//            )
//
//            binding.statusDropMenuAutoCompleteTextView.apply {
//                setAdapter(adapter)
//                setOnItemClickListener { _, _, position, _ ->
//                    statusChoice = viewModel.statuses[position]
//                }
//            }
//        }

        /** ------------Календарь плановая дата------------------------------------------------ **/
        val calendar = Calendar.getInstance()
        vPlanExecuteDate = binding.containerWishInclude.planExecuteDateTextInputEditText

        val dateBirth =
            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, month)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                Utils.updateDateLabel(calendar, vPlanExecuteDate)
            }
        vPlanExecuteDate.setOnClickListener {
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
                    executorId = 1,
                    createDate = fullWish.wish.createDate,
                    planExecuteDate = fullWish.wish.planExecuteDate,
                    factExecuteDate = fullWish.wish.factExecuteDate,
                    status = fullWish.wish.status,
                    room = 1,
                    wishVisibility = 1

                )
                wishCardViewModel.updateWish(editedWish)
            } else {
                val createdWish = Wish(
                    id = 1,
                    patientId = 0, //TODO При создании Просьбы из карточки Пациента данное поле заполняется автоматически!
                    title = containerWishInclude.titleTextInputEditText.text.toString(),
                    description = containerWishInclude.descriptionTextInputEditText.text.toString(),
                    creatorId = wishCardViewModel.currentUser.id,
                    executorId = executor?.id,
                    createDate =0,
                    planExecuteDate = 0, //TODO Значение поля "plan_execute_date" таблицы wish.
                    factExecuteDate = 0, //TODO Значение поля “fact_execute_date” таблицы wish. Если поле  “fact_execute_date” не заполнено, то отображается надпись «Не исполнена».
                    status = "",
                    room = 1,
                    wishVisibility = 1
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
