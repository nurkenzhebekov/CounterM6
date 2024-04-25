package com.example.counter

class CounterModel {

    private var count = 0

    fun getCount(): Int {
        return count
    }

    fun increment() {
        ++count
    }

    fun decrement() {
        --count
    }

    fun reset() {
        count = 0
    }

}