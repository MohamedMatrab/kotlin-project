package com.example.projectkotlin;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.projectkotlin.databinding.ActivitySecondBinding


class SecondActivity: AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_second)
        val image:Int = intent.getIntExtra("image",R.drawable.book)
        val nbPage:Int = intent.getIntExtra("nbPage",0)
        val title: String = intent.getStringExtra("image") ?: ""
        val author: String = intent.getStringExtra("author") ?: ""
        val category: String = intent.getStringExtra("category") ?: ""
        val description: String = intent.getStringExtra("description") ?: ""
        val book = Book(image = image, title = title, author = author, category = category, description = description, nbPage = nbPage)
        binding.bookImage.setImageResource(book.image);
        binding.title.text = book.title;
        binding.author.text = "Author : " + book.author;
        binding.category.text = "Category : " + book.category;
        binding.nbPage.text = "Number of pages : " + book.nbPage;
        binding.desc.text = book.description;
    }
}