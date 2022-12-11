package ru.iteco.fmhandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import ru.iteco.fmhandroid.databinding.ItemClaimBinding
import ru.iteco.fmhandroid.dto.Claim
import ru.iteco.fmhandroid.dto.FullClaim
import ru.iteco.fmhandroid.utils.Utils

interface OnClaimItemClickListener {
    fun onCard(claim: Claim) {}
}

class ClaimListAdapter(
    private val onClaimItemClickListener: OnClaimItemClickListener
) : PagingDataAdapter<Claim, ClaimListAdapter.ClaimViewHolder>(
    ClaimDiffCallback
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClaimViewHolder {
        val binding = ItemClaimBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ClaimViewHolder(binding, onClaimItemClickListener)
    }

    override fun onBindViewHolder(holder: ClaimViewHolder, position: Int) {
        val claim = getItem(position) ?: return
        holder.bind(claim)
    }

    class ClaimViewHolder(
        private val binding: ItemClaimBinding,
        private val onClaimItemClickListener: OnClaimItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(claim: Claim) {
            with(binding) {
                executorNameMaterialTextView.text = claim.executorName
                planTimeMaterialTextView.text =
                    Utils.formatTime(
                        claim.planExecuteDate
                    )

                planDateMaterialTextView.text =
                    Utils.formatDate(
                       claim.planExecuteDate
                    )

                descriptionMaterialTextView.text = claim.title

                claimListCard.setOnClickListener {
                    onClaimItemClickListener.onCard(claim)
                }
            }
        }
    }

    private object ClaimDiffCallback : DiffUtil.ItemCallback<Claim>() {
        override fun areItemsTheSame(
            oldItem: Claim,
            newItem: Claim
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: Claim,
            newItem: Claim
        ): Boolean {
            return oldItem == newItem
        }
    }
}
