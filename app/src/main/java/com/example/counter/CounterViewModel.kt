package com.example.counter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val counterModel = CounterModel()
    val counterLD = MutableLiveData<Int>()

    init {
        counterLD.value = counterModel.getCount()
    }

    fun increment() {
        counterModel.increment()
        counterLD.value = counterModel.getCount()
    }

    fun decrement() {
        counterModel.decrement()
        counterLD.value = counterModel.getCount()
    }

    fun reset() {
        counterModel.reset()
        counterLD.value = counterModel.getCount()
    }

}