package com.example.projectkotlin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val data: List<Book>): RecyclerView.Adapter<BookAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val bookTitle: TextView = itemView.findViewById(R.id.book_title)
        val bookImage: ImageView = itemView.findViewById(R.id.book_image)

        fun bind(book: Book) {
            bookTitle.text = book.title
            bookImage.setImageResource(book.image)
            itemView.setOnClickListener {
                val intent:Intent = Intent(itemView.context,SecondActivity::class.java)
                intent.putExtra("image",book.image)
                intent.putExtra("author",book.author)
                intent.putExtra("nbPage",book.nbPage)
                intent.putExtra("category",book.category)
                intent.putExtra("title",book.title)
                intent.putExtra("description",book.description)
                itemView.context.startActivity(intent)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.book_layout, parent, false)
        return ViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bookTitle.text = data[position].title
        holder.bookImage.setImageResource(data[position].image)
        holder.bind(data[position])
    }
    override fun getItemCount(): Int {
        return data.size
    }
}
