package com.example.goread.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.goread.NewsDetailActivity
import com.example.goread.R
import com.example.goread.data.NewsDataSource
import com.example.goread.model.News

class NewsCardAdapter :
    RecyclerView.Adapter<NewsCardAdapter.NewsViewHolder>() {

    private val datasource: List<News> = NewsDataSource.news

    class NewsViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val newsImage: ImageView = itemView.findViewById(R.id.sportImage_iv)
        val newsTitle: TextView = itemView.findViewById(R.id.newsTitle_tv)
        val newsDescription: TextView = itemView.findViewById(R.id.newsDescription_tv)
        val newsCard: View = itemView.findViewById(R.id.newsCard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return NewsViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return datasource.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = datasource[position]
        holder.newsImage.setImageResource(item.imageResourceId)
        holder.newsTitle.text = item.title
        holder.newsDescription.text = item.description
        holder.newsCard.setOnClickListener {
            val context = holder.newsCard.context
            val intent = Intent(context, NewsDetailActivity::class.java)
            intent.putExtra(NewsDetailActivity.NEWS, item)
            context.startActivity(intent)
        }
    }


}