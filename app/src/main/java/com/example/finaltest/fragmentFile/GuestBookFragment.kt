package com.example.finaltest.fragmentFile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.finaltest.R
import com.example.finaltest.SearchPackage.SearchActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class GuestBookFragment : Fragment(){

    val database = Firebase.database
    val myRef = database.getReference("best1")
    lateinit var best1 : ArrayList<BestLank>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_guest_book, container, false)

        val search : ImageButton = view.findViewById(R.id.search_button)
        search.setOnClickListener {
            val intent = Intent(context, SearchActivity::class.java)
            startActivity(intent)
        }
//        var button : Button = view.findViewById(R.id.button)
//        button.setOnClickListener {
//            var builder = NotificationCompat.Builder(this, " ")
//                .s
//        }
        best1 = ArrayList()

        myRef.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val test = snapshot.child("l1")
                for (ds in test.children) {
                    Log.e("snap", ds.toString())
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
                Log.e("snap", "실패")
            }
        })

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