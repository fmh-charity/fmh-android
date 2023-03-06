package ru.iteco.fmhandroid.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.iteco.fmhandroid.databinding.ItemPatientBinding
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.utils.Utils

interface OnPatientItemClickListener {
    fun onCard(patient: Patient)
}

class PatientListAdapter(
    private val onPatientItemClickListener: OnPatientItemClickListener
) : ListAdapter<Patient, PatientListAdapter.PatientViewHolder>(
    PatientDiffCallBack
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatientViewHolder {
        val binding = ItemPatientBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PatientViewHolder(
            binding,
            onPatientItemClickListener
        )
    }

    override fun onBindViewHolder(holder: PatientViewHolder, position: Int) {
        val patient = getItem(position)
        holder.bind(patient)
    }

    class PatientViewHolder(
        private val binding: ItemPatientBinding,
        private val listener: OnPatientItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(patient: Patient) {
            with(binding) {
                nameLabelTextView.text = Utils.generateShortUserNameForPatient(
                    patient.lastName,
                    patient.firstName,
                    patient.middleName
                )
                birthDateTextView.text = patient.birthDate
                statusTextView.text = patient.status.toString()
                patientListCardView.setOnClickListener {
                    listener.onCard(patient)
                }
            }
        }
    }
}

private object PatientDiffCallBack : DiffUtil.ItemCallback<Patient>() {
    override fun areItemsTheSame(
        oldItem: Patient,
        newItem: Patient
    ): Boolean {
        return oldItem.id == newItem.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(
        oldItem: Patient,
        newItem: Patient
    ): Boolean {
        return oldItem == newItem
    }
}
