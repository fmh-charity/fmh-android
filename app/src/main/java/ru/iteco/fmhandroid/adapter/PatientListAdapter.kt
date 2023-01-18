package ru.iteco.fmhandroid.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.iteco.fmhandroid.databinding.ItemPatientBinding
import ru.iteco.fmhandroid.dto.FullPatient
import ru.iteco.fmhandroid.utils.Utils

interface OnPatientItemClickListener {
    fun onCard(fullPatient: FullPatient)
}

class PatientListAdapter(private val onPatientItemClickListener: OnPatientItemClickListener) :
    ListAdapter<FullPatient, PatientListAdapter.PatientViewHolder>(
        PatientDiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatientViewHolder {
        val binding = ItemPatientBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PatientViewHolder(binding, onPatientItemClickListener)
    }

    override fun onBindViewHolder(holder: PatientViewHolder, position: Int) {
        val fullPatient = getItem(position)
        holder.bind(fullPatient)
    }

    class PatientViewHolder(
        private val binding: ItemPatientBinding,
        private val OnPatientItemClickListener: OnPatientItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(fullPatient: FullPatient) {
            with(binding) {
                nameLabelTextView.text = Utils.generateShortUserNameForPatient(
                    fullPatient.patient.lastName,
                    fullPatient.patient.firstName,
                    fullPatient.patient.middleName
                )
                birthDateTextView.text = fullPatient.patient.birthDate
                statusTextView.text = fullPatient.patient.status

               patientListCardView.setOnClickListener {
                   OnPatientItemClickListener.onCard(fullPatient)
                }
            }
        }
    }
}

private object PatientDiffCallBack : DiffUtil.ItemCallback<FullPatient>() {
    override fun areItemsTheSame(oldItem: FullPatient, newItem: FullPatient): Boolean {
        return oldItem.patient.id == newItem.patient.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: FullPatient, newItem: FullPatient): Boolean {
        return oldItem == newItem
    }
}
