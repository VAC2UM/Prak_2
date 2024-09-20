package com.itproger.prak_2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.itproger.prak_2.R

class FirstFragmentViewModel: ViewModel() {
    val _currentImage = MutableLiveData<Int>(R.drawable.walter)
    private var imageChanged = false

    fun changeImage() {
        if (!imageChanged) {
            _currentImage.value = R.drawable.heizenberg
            imageChanged = true
        } else {
            _currentImage.value = R.drawable.walter
            imageChanged = false
        }
    }
}