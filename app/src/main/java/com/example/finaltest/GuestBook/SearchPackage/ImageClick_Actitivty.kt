package com.example.finaltest.GuestBook.SearchPackage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import com.example.finaltest.R


class ImageClick_Actitivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_click_actitivty)


        val titleImage: ImageView = findViewById(R.id.titleimage)
        titleImage.setOnClickListener {

        }

        val CustomDialog = ProfileDialog(this)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            CustomDialog.show()
        }
    }

}