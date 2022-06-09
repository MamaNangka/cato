package com.c22ps240.cato.ui

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import com.c22ps240.cato.R
import com.c22ps240.cato.databinding.ActivityIntroSliderBinding
import com.c22ps240.cato.databinding.ActivitySplashScreenBinding

class IntroSlider : AppCompatActivity() {

    private lateinit var binding: ActivityIntroSliderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroSliderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()

        binding.btnUserName.setOnClickListener{
        val it = Intent(this, MainActivity::class.java)
        startActivity(it)
        finish()}


    }
    private fun setupView() {
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        supportActionBar?.hide()
    }
}