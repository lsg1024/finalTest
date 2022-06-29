package com.example.finaltest

import android.app.Notification
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.app.NotificationCompat
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class GuestBookFragment : Fragment(){

    val db = Firebase.firestore

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_guest_book, container, false)

//        var button : Button = view.findViewById(R.id.button)
//        button.setOnClickListener {
//            var builder = NotificationCompat.Builder(this, " ")
//                .s
//        }


        return view
    }


    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GuestBookFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}