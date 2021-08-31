package ru.netology.fmhandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.netology.fmhandroid.databinding.ClaimsListCardBinding
import ru.netology.fmhandroid.dto.Claim
import ru.netology.fmhandroid.utils.Utils

interface OnClaimItemClickListener {
    fun onCard(claim: Claim) {}
}

class ClaimListAdapter (
    private val onClaimItemClickListener: OnClaimItemClickListener
    ) : ListAdapter<Claim, ClaimListAdapter.NoteViewHolder>(NoteDiffCallback()) {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
            val binding = ClaimsListCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            return NoteViewHolder(binding, onClaimItemClickListener)
        }

        override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
            getItem(position)?.let {
                holder.bind(it)
            }
        }

        class NoteViewHolder(
            private val binding: ClaimsListCardBinding,
            private val onClaimItemClickListener: OnClaimItemClickListener
        ) : RecyclerView.ViewHolder(binding.root) {

            fun bind(claim: Claim) {
                binding.apply {
                    executorNameMaterialTextView.text = TODO("Додумать как здесь получить исполнителя")
                    planTimeMaterialTextView.text = Utils.convertTime(claim.planExecuteDate)
                    planDateMaterialTextView.text = Utils.convertDate(claim.planExecuteDate)
                    descriptionMaterialTextView.text = claim.description

                    claimListCard.setOnClickListener {
                        onClaimItemClickListener.onCard(claim)
                    }
                }
            }
        }

        class NoteDiffCallback : DiffUtil.ItemCallback<Claim>() {
            override fun areItemsTheSame(oldItem: Claim, newItem: Claim): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Claim, newItem: Claim): Boolean {
                return oldItem == newItem
            }
        }

}