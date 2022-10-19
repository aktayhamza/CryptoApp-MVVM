package com.example.cryptoapp.ui.home

import androidx.fragment.app.viewModels
import com.example.cryptoapp.base.BaseFragment
import com.example.cryptoapp.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel> (
    FragmentHomeBinding::inflate
        ) {
    override val viewModel by viewModels<HomeViewModel> ()

    override fun onCreateFinished() {

    }

    override fun initializeListeners() {

    }

    override fun observeEvents() {

    }


}