package ru.iteco.fmhandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.ItemCommentBinding
import ru.iteco.fmhandroid.dto.WishComment
import ru.iteco.fmhandroid.utils.Utils
import ru.iteco.fmhandroid.viewmodel.WishCardViewModel

interface OnWishCommentItemClickListener {
    fun onCard(wishComment: WishComment)
}

class WishCommentListAdapter(
    private val onWishCommentItemClickListener: OnWishCommentItemClickListener,
    private val wishCardViewModel: WishCardViewModel
) : ListAdapter<WishComment, WishCommentListAdapter.WishCommentViewHolder>(
    WishCommentDiffCallback
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishCommentViewHolder {
        val binding = ItemCommentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return WishCommentViewHolder(binding, onWishCommentItemClickListener, wishCardViewModel)
    }

    override fun onBindViewHolder(holder: WishCommentViewHolder, position: Int) {
        val wishComment = getItem(position)
        holder.bind(wishComment)
    }

    class WishCommentViewHolder(
        private val binding: ItemCommentBinding,
        private val onWishCommentItemClickListener: OnWishCommentItemClickListener,
        private val wishCardViewModel: WishCardViewModel
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(wishComment: WishComment) {
            with(binding) {
                commentDescriptionTextView.text = wishComment.description

                commentDateTextView.text =
                    Utils.formatDate(wishComment.createDate)
                commentTimeTextView.text =
                    Utils.formatTime(wishComment.createDate)

                editCommentImageButton.setImageResource(
                    if (wishComment.creatorId != wishCardViewModel.currentUser.id) R.drawable.ic_pen_light else R.drawable.ic_pen
                )
                editCommentImageButton.setOnClickListener {
                    if (wishCardViewModel.currentUser.id == wishComment.creatorId) {
                        onWishCommentItemClickListener.onCard(wishComment)
                    } else {
                        return@setOnClickListener
                    }
                }
            }
        }
    }

    private object WishCommentDiffCallback : DiffUtil.ItemCallback<WishComment>() {
        override fun areItemsTheSame(
            oldItem: WishComment,
            newItem: WishComment
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: WishComment,
            newItem: WishComment
        ): Boolean {
            return oldItem == newItem
        }
    }
}