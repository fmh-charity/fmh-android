package ru.iteco.fmhandroid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.getColorOrThrow
import androidx.core.content.res.use
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.iteco.fmh.viewmodel.ourMission.OnOurMissionItemClickListener
import ru.iteco.fmh.viewmodel.ourMission.OurMissionItemViewData
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.ItemOurMissionBinding

class OurMissionItemListAdapter(
    context: Context,
    private val onOurMissionItemClickListener: OnOurMissionItemClickListener,
) : ListAdapter<OurMissionItemViewData, OurMissionItemListAdapter.OurMissionViewHolder>(
    OurMissionDiffCallback
) {
    private val titles by lazy {
        context.resources.getStringArray(R.array.our_mission_titles)
    }

    private val descriptions by lazy {
        context.resources.getStringArray(R.array.our_mission_descriptions)
    }

    private val backgroundColors by lazy {
        context.resources.obtainTypedArray(R.array.our_mission_background_colors).use {
            List(it.length()) { index -> it.getColorOrThrow(index) }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OurMissionViewHolder {
        val binding = ItemOurMissionBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OurMissionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OurMissionViewHolder, position: Int) {
        val ourMissionItem = getItem(position)
        holder.bind(ourMissionItem)
    }

    inner class OurMissionViewHolder(
        private val binding: ItemOurMissionBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(ourMissionItem: OurMissionItemViewData) {
            with(binding) {
                ourMissionItemTitleTextView.text = titles[ourMissionItem.index]
                ourMissionItemTitleTextView.setBackgroundColor(backgroundColors[ourMissionItem.index])
                ourMissionItemDescriptionTextView.text = descriptions[ourMissionItem.index]

                if (ourMissionItem.isOpen) {
                    ourMissionItemDescriptionTextView.visibility = View.VISIBLE
                    ourMissionItemOpenCardImageButton.setImageResource(R.drawable.expand_less_24)
                } else {
                    ourMissionItemDescriptionTextView.visibility = View.GONE
                    ourMissionItemOpenCardImageButton.setImageResource(R.drawable.expand_more_24)
                }

                ourMissionItemMaterialCardView.setOnClickListener {
                    onOurMissionItemClickListener.onCard(ourMissionItem)
                }
            }
        }
    }

    private object OurMissionDiffCallback : DiffUtil.ItemCallback<OurMissionItemViewData>() {
        override fun areItemsTheSame(
            oldItem: OurMissionItemViewData,
            newItem: OurMissionItemViewData
        ): Boolean {
            return oldItem.index == newItem.index
        }

        override fun areContentsTheSame(
            oldItem: OurMissionItemViewData,
            newItem: OurMissionItemViewData
        ): Boolean {
            return oldItem == newItem
        }
    }
}