package me.kariot.musify.ui.main

import android.os.Bundle
import android.view.View
import me.kariot.musify.databinding.FragmentDashboardBinding
import me.kariot.musify.ui.base.BaseFragment
import me.kariot.musify.ui.main.adapter.AdapterMusicList
import me.kariot.musify.utills.Constants

class DashboardFragment :
    BaseFragment<FragmentDashboardBinding>(FragmentDashboardBinding::inflate) {

    private val adapter = AdapterMusicList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }

    private fun initRecycler() {
        adapter.submitList(Constants.DUMMY_LIST)
        binding.recyclerSongs.apply {
            adapter = this@DashboardFragment.adapter
        }
    }
}