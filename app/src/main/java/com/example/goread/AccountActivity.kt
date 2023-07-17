package com.example.goread

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val accountImage: ImageView = findViewById(R.id.account_imageView)
        accountImage.setImageResource(R.drawable.selfie_1)
    }
}