package com.f.livedatademoproject

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _observeTextState = MutableLiveData<String>() //private variable of MutableLiveData for observing and Updating LiveData
    val observeTextState : LiveData<String>
    get() = _observeTextState //get() is a public function of LiveData for retieval of  data using mutableLiveData private variable

    fun operationsHere(){
        _observeTextState.value = "Text change" //changed variable of MutableLIVEdata
    }
}