package ru.iteco.fmhandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.iteco.fmhandroid.databinding.ItemPatientBinding
import ru.iteco.fmhandroid.dto.Patient
import ru.iteco.fmhandroid.ui.viewdata.NewsViewData
import ru.iteco.fmhandroid.utils.Utils


interface OnPatientItemClickListener {
    //TODO перечислить
    fun onCard(patient: Patient)
}

class PatientListAdapter(private val onPatientItemClickListener: OnPatientItemClickListener) :
    ListAdapter<Patient, PatientListAdapter.PatientViewHolder>(PatientDiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatientViewHolder {
        val binding = ItemPatientBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PatientViewHolder(binding, onPatientItemClickListener)
    }

    override fun onBindViewHolder(holder: PatientViewHolder, position: Int) {
        val patient = getItem(position)
        holder.bind(patient)
    }

    class PatientViewHolder(
        private val binding: ItemPatientBinding,
        private val OnPatientItemClickListener: OnPatientItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(patient: Patient) {
            with(binding) {
                nameTextView.text = Utils.generateShortUserNameForPatient(
                    patient.lastName,
                    patient.firstName,
                    patient.middleName
                )
                birthDateTextView.text = Utils.formatDate(patient.birthDate)
                statusTextView.text = patient.status.toString()
            }
        }
    }
}

private object PatientDiffCallBack : DiffUtil.ItemCallback<Patient>() {
    override fun areItemsTheSame(oldItem: Patient, newItem: Patient): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Patient, newItem: Patient): Boolean {
        return oldItem == newItem
    }
}