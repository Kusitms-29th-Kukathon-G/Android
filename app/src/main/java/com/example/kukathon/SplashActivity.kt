package com.example.kukathon

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.kukathon.databinding.ActivitySplashBinding
import com.kakao.sdk.common.KakaoSdk

class SplashActivity : AppCompatActivity() {

     lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_splash)

        val handler = Handler(Looper.getMainLooper())

        KakaoSdk.init(this, "{NATIVE_APP_KEY}")

        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500L)
    }

}