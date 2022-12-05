package ru.iteco.fmhandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.iteco.fmhandroid.databinding.ItemWishBinding
import ru.iteco.fmhandroid.dto.FullWish
import ru.iteco.fmhandroid.utils.Utils


interface OnWishItemClickListener {
    fun onCard(fullWish: FullWish) {}
}

class WishListAdapter(
    private val onWishItemClickListener: OnWishItemClickListener
) : ListAdapter<FullWish, WishListAdapter.WishViewHolder>(
    WishDiffCallback
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishViewHolder {
        val binding = ItemWishBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return WishViewHolder(binding, onWishItemClickListener)
    }

    override fun onBindViewHolder(holder: WishViewHolder, position: Int) {
        val fullWish = getItem(position)
        holder.bind(fullWish)
    }

    class WishViewHolder(
        private val binding: ItemWishBinding,
        private val onWishItemClickListener: OnWishItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(fullWish: FullWish) {
            with(binding) {
                titleTextView.text = fullWish.wish.title
                patientTextView.text = fullWish.wish.patientId.toString()
                executorNameTextView.text = fullWish.wish.executorId.toString()
                planExecuteDateTextView.text =
                    Utils.formatDate(
                        fullWish.wish.planExecuteDate
                    )
                planExecuteTimeTextView.text = Utils.formatTime(
                    fullWish.wish.planExecuteDate
                )
                wishListCard.setOnClickListener {
                    onWishItemClickListener.onCard(fullWish)
                }
            }

        }
    }
}

private object WishDiffCallback : DiffUtil.ItemCallback<FullWish>() {
    override fun areItemsTheSame(
        oldItem: FullWish,
        newItem: FullWish
    ): Boolean {
        return oldItem.wish.id == newItem.wish.id
    }

    override fun areContentsTheSame(
        oldItem: FullWish,
        newItem: FullWish
    ): Boolean {
        return oldItem == newItem
    }
}
