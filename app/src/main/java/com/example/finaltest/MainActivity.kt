package com.example.finaltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.finaltest.fragmentFile.MyPageradapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {

    val database = Firebase.database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewPager2 : ViewPager2 = findViewById(R.id.viewpager2)
        val tabLayout : TabLayout = findViewById(R.id.tabLayout)


        viewPager2.apply {
            adapter = MyPageradapter(context as FragmentActivity)
        }

        TabLayoutMediator(tabLayout, viewPager2) {tab, position ->
            when (position){
                0 -> {
                    tab.text = "홈"
                }
                1 -> {
                    tab.text = "동행 페이지"
                }
                2 -> {
                    tab.text = "방명록"
                }
                3 -> {
                    tab.text = "여행일지"
                }
                4 -> {
                    tab.text = "마이 페이지"
                }
            }
        }.attach()
    }
}