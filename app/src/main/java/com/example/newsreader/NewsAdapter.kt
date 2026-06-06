package com.example.newsreader

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NewsAdapter(
    private val newsList: List<News>
) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val image: ImageView = itemView.findViewById(R.id.imageNews)
        val title: TextView = itemView.findViewById(R.id.titleNews)
        val description: TextView = itemView.findViewById(R.id.descriptionNews)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewsViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)

        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: NewsViewHolder,
        position: Int
    ) {

        val news = newsList[position]

        holder.title.text = news.title
        holder.description.text = news.description

        Glide.with(holder.itemView.context)
            .load(news.imageUrl)
            .placeholder(android.R.drawable.ic_menu_gallery)
            .error(android.R.drawable.ic_dialog_alert)
            .into(holder.image)

        holder.itemView.setOnClickListener {

            val intent = Intent(
                holder.itemView.context,
                NewsDetailsActivity::class.java
            )

            intent.putExtra("title", news.title)
            intent.putExtra("description", news.description)
            intent.putExtra("imageUrl", news.imageUrl)

            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return newsList.size
    }
}