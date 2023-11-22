package com.example.finalproject.presentation.adapter.movie_details

import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.databinding.ItemDetailsBodyBinding
import com.example.finalproject.databinding.ItemDetailsHeaderBinding
import com.example.finalproject.databinding.ItemDetailsViewpagerBinding
import com.example.finalproject.presentation.adapter.UserListsViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HeaderViewHolder(private val binding: ItemDetailsHeaderBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: ListItem.Header) {
        binding.title.text = item.title
    }
}

class BodyViewHolder(private val binding: ItemDetailsBodyBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: ListItem.Body) = with(binding) {
        ratingbar.rating = item.rating.toFloat()
        ratingAverage.text = root.resources.getString(R.string.rating, item.rating)
        description.text = item.description
    }
}

class ViewPagerViewHolder(private val binding: ItemDetailsViewpagerBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: ListItem.ViewPager) = with(binding) {
        viewPager.offscreenPageLimit = 2
        viewPager.adapter = UserListsViewPagerAdapter(item.fragmentManager, item.lifecycle)

        TabLayoutMediator(tabLayoutBinding.topTab, viewPager) { tab, position ->
            when(position) {
                0 -> tab.text = "TRAILERS"
                1 -> tab.text = "MORE LIKE THIS"
            }
        }.attach()
    }
}