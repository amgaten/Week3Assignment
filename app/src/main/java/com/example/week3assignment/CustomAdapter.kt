package com.example.week3assignment

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_post, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.ivMain.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.tvTitle.text = ItemsViewModel.tvTitle

        holder.tvDescription.text = ItemsViewModel.tvDescription

        holder.viewMore.text = ItemsViewModel.viewMore

        holder.viewMore.setOnClickListener {
            holder.mActivity.startActivity(holder.intent)
        }

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val ivMain: ImageView = itemView.findViewById(R.id.ivMain)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvDescription: TextView = itemView.findViewById(R.id.tvDescription)
        val viewMore: Button = itemView.findViewById(R.id.viewMore)

        val mActivity = itemView.context as Activity
        val intent = Intent(mActivity, FullPost::class.java)

    }
}