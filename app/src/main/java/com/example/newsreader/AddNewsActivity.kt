package com.example.newsreader

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore

class AddNewsActivity : AppCompatActivity() {

    private lateinit var titleEt: EditText
    private lateinit var descriptionEt: EditText
    private lateinit var imageEt: EditText
    private lateinit var postBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_news)

        titleEt = findViewById(R.id.etTitle)
        descriptionEt = findViewById(R.id.etDescription)
        imageEt = findViewById(R.id.etImageUrl)
        postBtn = findViewById(R.id.btnPost)

        postBtn.setOnClickListener {

            val title = titleEt.text.toString().trim()
            val description = descriptionEt.text.toString().trim()
            val imageUrl = imageEt.text.toString().trim()

            if (title.isEmpty() || description.isEmpty() || imageUrl.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please fill all fields",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val news = hashMapOf(
                "title" to title,
                "description" to description,
                "imageUrl" to imageUrl
            )

            FirebaseFirestore.getInstance()
                .collection("news")
                .add(news)
                .addOnSuccessListener {

                    Toast.makeText(
                        this,
                        "News Added Successfully",
                        Toast.LENGTH_SHORT
                    ).show()

                    finish()
                }
                .addOnFailureListener {

                    Toast.makeText(
                        this,
                        "Failed to Add News",
                        Toast.LENGTH_SHORT
                    ).show()
                }
        }
    }
}