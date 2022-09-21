package ru.iteco.fmhandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.iteco.fmh.model.Claim
import ru.iteco.fmh.viewmodel.claim.card.ClaimCardViewModel
import ru.iteco.fmh.viewmodel.claim.card.OnClaimCommentItemClickListener
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.ItemCommentBinding
import ru.iteco.fmhandroid.utils.Utils

class ClaimCommentListAdapter(
    private val onClaimCommentItemClickListener: OnClaimCommentItemClickListener,
    private val claimCardViewModel: ClaimCardViewModel
) : ListAdapter<Claim.Comment, ClaimCommentListAdapter.ClaimCommentViewHolder>(
    ClaimCommentDiffCallback
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClaimCommentViewHolder {
        val binding = ItemCommentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ClaimCommentViewHolder(binding, onClaimCommentItemClickListener, claimCardViewModel)
    }

    override fun onBindViewHolder(holder: ClaimCommentViewHolder, position: Int) {
        val claimComment = getItem(position)
        holder.bind(claimComment)
    }

    class ClaimCommentViewHolder(
        private val binding: ItemCommentBinding,
        private val onClaimCommentItemClickListener: OnClaimCommentItemClickListener,
        private val claimCardViewModel: ClaimCardViewModel
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(claimComment: Claim.Comment) {
            with(binding) {
                commentDescriptionTextView.text = claimComment.description
                commentatorNameTextView.text = claimComment.creatorName

                commentDateTextView.text =
                    Utils.formatDate(claimComment.createDate)
                commentTimeTextView.text =
                    Utils.formatTime(claimComment.createDate)

                editCommentImageButton.setImageResource(
                    if (claimComment.creatorId != claimCardViewModel.currentUser.id) R.drawable.ic_pen_light else R.drawable.ic_pen
                )
                editCommentImageButton.setOnClickListener {
                    if (claimCardViewModel.currentUser.id == claimComment.creatorId) {
                        onClaimCommentItemClickListener.onCard(claimComment)
                    } else {
                        return@setOnClickListener
                    }
                }
            }
        }
    }

    private object ClaimCommentDiffCallback : DiffUtil.ItemCallback<Claim.Comment>() {
        override fun areItemsTheSame(
            oldItem: Claim.Comment,
            newItem: Claim.Comment
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: Claim.Comment,
            newItem: Claim.Comment
        ): Boolean {
            return oldItem == newItem
        }
    }
}
