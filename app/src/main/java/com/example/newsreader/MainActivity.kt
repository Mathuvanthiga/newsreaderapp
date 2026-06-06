package com.example.newsreader

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: NewsAdapter
    private val newsList = ArrayList<News>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)

        loadNews()
    }

    override fun onResume() {
        super.onResume()
        loadNews()
    }

    private fun loadNews() {

        val db = FirebaseFirestore.getInstance()

        db.collection("news")
            .get()
            .addOnSuccessListener { documents ->

                newsList.clear()

                for (document in documents) {
                    Log.d("Firestore", document.data.toString())

                    val news = document.toObject(News::class.java)

                    newsList.add(news)
                }

                adapter = NewsAdapter(newsList)
                viewPager.adapter = adapter
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error loading news", e)
            }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.addNews) {
            startActivity(
                Intent(this, AddNewsActivity::class.java)
            )
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}