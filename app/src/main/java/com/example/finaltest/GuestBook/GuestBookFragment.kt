package com.example.finaltest.GuestBook

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finaltest.DTO.ResultData
import com.example.finaltest.GuestBook.SearchPackage.ImageClick_Actitivty
import com.example.finaltest.Interface.AuthRetrofitInterface
import com.example.finaltest.Interface.RetrofitClass
import com.example.finaltest.R
import com.example.finaltest.GuestBook.SearchPackage.SearchActivity
import org.w3c.dom.Text
import retrofit2.*

class GuestBookFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_guest_book, container, false)

        val lankRecyclerView : RecyclerView = view.findViewById(R.id.rank_recyclerView)
        val service = RetrofitClass.retrofit.create(AuthRetrofitInterface::class.java)
        val result = service.GetlLankplace()
        val Rank_Text : TextView = view.findViewById(R.id.lankText)


        result.enqueue(object : Callback<ResultData>{
            override fun onResponse(call: Call<ResultData>, response: Response<ResultData>) {
                if(response.isSuccessful){

                    var result : ResultData? = response.body()

                    Log.d("response", "Response 성공 ${result?.result!![0].place}")

                    var DataList = arrayListOf(
                        Data("1번  ${result?.result!![0].place}"),
                        Data("2번 ${result?.result!![1].place}"),
                        Data("3번 ${result?.result!![2].place}"),
                        Data("4번 ${result?.result!![3].place}"),
                        Data("5번 ${result?.result!![4].place}"),
                    )

                    lankRecyclerView.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
                    lankRecyclerView.adapter = LankAdapter(DataList)

                    Rank_Text.setOnClickListener {
                        val intent = Intent(context, ImageClick_Actitivty::class.java)
                        // 여기있는 프래그먼트에서 텍스트를 클릭했을 때 gp_key 값을 보낸다 하트 수는 정렬해서 보내기 위한 값이다
                        startActivity(intent)
                    }


                } else{
                    Log.d("response", "실패")
                }
            }

            override fun onFailure(call: Call<ResultData>, t: Throwable) {
                Log.d("response", "응답 에러" + t.message.toString())
            }
        })

        val search : ImageButton = view.findViewById(R.id.search_button)
        search.setOnClickListener {
            val intent = Intent(context, SearchActivity::class.java)
            startActivity(intent)
        }
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

