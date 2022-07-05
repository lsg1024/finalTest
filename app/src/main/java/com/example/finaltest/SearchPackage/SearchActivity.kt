package com.example.finaltest.SearchPackage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finaltest.R

class SearchActivity : AppCompatActivity() {

    // 받아온 사진 데이터를 저장하는 곳 실행될때 동작해야함
    val DataList = arrayListOf(
        Data(R.drawable.dog)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val recyclerView : RecyclerView = findViewById(R.id.recyclerView2)

        recyclerView.layoutManager = GridLayoutManager(applicationContext, 3)
        recyclerView.adapter = SearchAdapter(DataList)


    }
}