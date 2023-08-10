package com.example.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.presentation.databinding.ActivityWebViewBinding

class WebViewActivity: AppCompatActivity() {

    private lateinit var binding: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}