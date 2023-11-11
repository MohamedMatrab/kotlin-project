package com.example.projectkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.projectkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        handleThings()
    }
    private fun handleThings(){
        val bookArray = listOf(
            Book(R.drawable.book1, "Book 1", "Description of Book 1", "Author 1", 300, "Category A"),
            Book(R.drawable.book2, "Book 2", "Description of Book 2", "Author 2", 250, "Category B"),
            Book(R.drawable.book3, "Book 3", "Description of Book 3", "Author 3", 400, "Category C"),
            Book(R.drawable.book4, "Book 4", "Description of Book 4", "Author 4", 280, "Category A"),
            Book(R.drawable.book5, "Book 5", "Description of Book 5", "Author 5", 350, "Category B"),
            Book(R.drawable.book6, "Book 6", "Description of Book 6", "Author 6", 320, "Category C"),
            Book(R.drawable.book7, "Book 7", "Description of Book 7", "Author 7", 270, "Category A"),
            Book(R.drawable.book8, "Book 8", "Description of Book 8", "Author 8", 380, "Category B"),
            Book(R.drawable.book9, "Book 9", "Description of Book 9", "Author 9", 310, "Category C"),
            Book(R.drawable.book10, "Book 10", "Description of Book 10", "Author 10", 260, "Category A"),
            Book(R.drawable.book3, "Book 3", "Description of Book 3", "Author 3", 400, "Category C"),
            Book(R.drawable.book4, "Book 4", "Description of Book 4", "Author 4", 280, "Category A"),
            Book(R.drawable.book5, "Book 5", "Description of Book 5", "Author 5", 350, "Category B"),
            Book(R.drawable.book6, "Book 6", "Description of Book 6", "Author 6", 320, "Category C"),
            Book(R.drawable.book7, "Book 7", "Description of Book 7", "Author 7", 270, "Category A"),
            Book(R.drawable.book8, "Book 8", "Description of Book 8", "Author 8", 380, "Category B"),
            Book(R.drawable.book9, "Book 9", "Description of Book 9", "Author 9", 310, "Category C"),
            Book(R.drawable.book10, "Book 10", "Description of Book 10", "Author 10", 260, "Category A"),
        )

        val adapter = BookAdapter(bookArray)
        binding.myRecycler.adapter = adapter
        binding.myRecycler.layoutManager = GridLayoutManager(this,3)
    }
}