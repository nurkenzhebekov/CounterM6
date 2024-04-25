package com.example.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val counterModel = CounterModel()
    private val _counterLD = MutableLiveData<Int>()
    val counterLD: LiveData<Int> = _counterLD

    init {
        _counterLD.value = counterModel.getCount()
    }

    fun increment() {
        counterModel.increment()
        _counterLD.value = counterModel.getCount()
    }

    fun decrement() {
        counterModel.decrement()
        _counterLD.value = counterModel.getCount()
    }

    fun reset() {
        counterModel.reset()
        _counterLD.value = counterModel.getCount()
    }

}