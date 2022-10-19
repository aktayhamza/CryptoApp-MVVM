package com.example.cryptoapp.ui.detail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapp.model.detail.DetailResponse
import com.example.cryptoapp.utils.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val repository: DetailRepository) : ViewModel() {

    val detailResponse: MutableLiveData<DetailResponse?> = MutableLiveData()
    val isLoading: MutableLiveData<Boolean> = MutableLiveData(true)
    val onError: MutableLiveData<String?> = MutableLiveData()

    fun getDetail (
        apiKey: String,
        symbol: String
    ) = viewModelScope.launch {
        isLoading.value = false
        val request = repository.getDetail(apiKey, symbol)
        when(request){
            is NetworkResult.Success -> {
                isLoading.value = false
                detailResponse.value = request.data
            }

            is NetworkResult.Error -> {
                isLoading.value = false
                onError.value = request.message

            }
        }
    }

}