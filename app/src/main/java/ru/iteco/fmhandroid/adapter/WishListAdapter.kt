package ru.iteco.fmhandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.iteco.fmhandroid.databinding.ItemWishBinding
import ru.iteco.fmhandroid.dto.FullWish
import ru.iteco.fmhandroid.dto.Wish
import ru.iteco.fmhandroid.utils.Utils


interface OnWishItemClickListener {
    fun onCard(fullWish: FullWish) {}
}

class WishListAdapter(private val onWishItemClickListener: OnWishItemClickListener) :
    ListAdapter<Wish, WishListAdapter.WishViewHolder>(WishDiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishViewHolder {
        val binding = ItemWishBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return WishViewHolder(binding, onWishItemClickListener)
    }

    override fun onBindViewHolder(holder: WishViewHolder, position: Int) {
        val wish = getItem(position)
        holder.bind(wish)
    }

    class WishViewHolder(
        private val binding: ItemWishBinding,
        private val onWishItemClickListener: OnWishItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(wish: Wish) {
            with(binding) {
                titleTextView.text = wish.title
                planExecuteDateTextView.text = Utils.formatTime(wish.planExecuteDate)

            }
        }
    }
}

private object WishDiffCallBack : DiffUtil.ItemCallback<Wish>() {
    override fun areItemsTheSame(oldItem: Wish, newItem: Wish): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Wish, newItem: Wish): Boolean {
        return oldItem == newItem
    }
}