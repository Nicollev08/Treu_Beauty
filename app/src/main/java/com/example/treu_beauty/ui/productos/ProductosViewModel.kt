package com.example.treu_beauty.ui.productos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductosViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "laura y nicoll"
    }
    val text: LiveData<String> = _text
}
