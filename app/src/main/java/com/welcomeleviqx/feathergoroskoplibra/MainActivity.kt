package com.welcomeleviqx.feathergoroskoplibra

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import com.welcomeleviqx.feathergoroskoplibra.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // переменная под ViewBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // интеграция ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.mainButton.setOnClickListener {

            binding.mainText.animate()
                .alpha(0f)
                .setDuration(1500)
                .setListener(null)

            Handler().postDelayed ({

                binding.mainText.setTypingSpeed(70)
                binding.mainText.setTextAutoTyping(applicationContext.getString(R.string.goroskop))

                binding.mainText.animate()
                    .alpha(1f)
                    .setDuration(1500)
                    .setListener(null)

                binding.mainText.setTextColor(Color.parseColor("#1E1D22"))
                binding.mainText.setTypeface(Typeface.DEFAULT)
                binding.mainText.gravity = Gravity.LEFT

            }, 1500)

            binding.mainButton.isEnabled = false

        }

    }
}