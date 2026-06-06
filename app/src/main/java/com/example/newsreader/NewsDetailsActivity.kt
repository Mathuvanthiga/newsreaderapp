package com.example.newsreader

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class NewsDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        val image = findViewById<ImageView>(R.id.imageNewsDetails)
        val title = findViewById<TextView>(R.id.titleNewsDetails)
        val description = findViewById<TextView>(R.id.descriptionNewsDetails)

        title.text = intent.getStringExtra("title")
        description.text = intent.getStringExtra("description")

        Glide.with(this)
            .load(intent.getStringExtra("imageUrl"))
            .into(image)
    }
}