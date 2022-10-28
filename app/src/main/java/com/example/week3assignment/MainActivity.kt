package com.example.week3assignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        data.add(ItemsViewModel(R.drawable.img1, "Cleophas", "My day has been fantastic. Can't wait for tomorrow!", "Read More >>"))
        data.add(ItemsViewModel(R.drawable.img2, "Faith Jeptoo", "Contract design changed everything about how I work with contracts and I want to share ...", "Read More >>"))
        data.add(ItemsViewModel(R.drawable.img3, "Julia Ng'ang'a", "User-friendly contracts communicate, empower and build relationships.", "Read More >>"))
        data.add(ItemsViewModel(R.drawable.img4, "Okafor Benedict", "I’m inviting you to my brand new FREE workshop The Case for Contract Design...", "Read More >>"))
        data.add(ItemsViewModel(R.drawable.img5, "Alberto Gonzalez", "The effective 4 step process for designing simple contracts your clients can understand", "Read More >>"))
        data.add(ItemsViewModel(R.drawable.img6, "Nwosu Valentine", "The powerful 10-minute design tool you can use in your everyday contract work", "Read More >>"))
        data.add(ItemsViewModel(R.drawable.img7, "Maxwel Malasi", "Why contract design is so important for customer experience (and happy customers)", "Read More >>"))

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}