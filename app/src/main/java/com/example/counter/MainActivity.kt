package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this)[CounterViewModel::class.java]
    }
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupObservers()
        setupClickListeners()

    }

    private fun setupClickListeners() = with(binding) {
        btIncrement.setOnClickListener {
            viewModel.increment()
        }
        btDecrement.setOnClickListener {
            viewModel.decrement()
        }
        btReset.setOnClickListener {
            viewModel.reset()
        }
    }

    private fun setupObservers() {
        viewModel.counterLD.observe(this) {
            binding.tvCountResult.text = it.toString()
        }
    }
}