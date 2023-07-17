package com.example.goread

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.goread.databinding.ActivityNewsDetailBinding
import com.example.goread.model.News

class NewsDetailActivity : AppCompatActivity() {

    companion object {
        const val NEWS = "news"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNewsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        @Suppress("DEPRECATION")
        val news = intent?.getParcelableExtra<News>(NEWS)
        news?.let {
            binding.detailNewsImageIv.setImageResource(it.imageResourceId)
            binding.detailNewsTitleTv.text = it.title
            binding.detailNewsDescriptionTv.text = it.description
            binding.detailNewsAuthorTv.text = getString(R.string.author, it.author)
        }
    }
}