package com.example.finaltest.GuestBook.SearchPackage

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle

import com.example.finaltest.R

class ProfileDialog(context: Context, ): Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_profile)

    }
}