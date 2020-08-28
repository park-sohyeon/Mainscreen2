package com.example.recolap

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result_screen.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResultScreen : AppCompatActivity() {
    var dataService = DataService()
    var members: List<Member>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)
        dataService.select.selectAll()
            ?.enqueue(object : Callback<List<Member?>?> {
                override fun onResponse(
                    call: Call<List<Member?>?>?,
                    response: Response<List<Member?>?>
                ) {
                    members = response.body() as List<Member>?
                }

                override fun onFailure(
                    call: Call<List<Member?>?>?,
                    t: Throwable
                ) {
                    t.printStackTrace()
                }
            })



        val listView = findViewById<ListView>(R.id.listview)

//        어답터 설정
        listView.adapter = MyCustomAdapter(this)

//        Item click listener
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as String
            selectName.text = selectItem
            //Toast.makeText(this, selectItem, Toast.LENGTH_SHORT).show()
        }
    }

    //    Adapter class
    private class MyCustomAdapter(context: Context) : BaseAdapter() {
        private val mContext: Context

        //데이터 어레이
        private val members = arrayListOf<String>(

        )

        init {
            mContext = context
        }
        override fun getCount(): Int {
            return members.size
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }
        override fun getItem(position: Int): Any {
            val selectItem = members.get(position)
            return selectItem
        }
        override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.row_main, viewGroup, false)

            val nameTextView = rowMain.findViewById<TextView>(R.id.name_textview)
            nameTextView.text = members.get(position)
            val positionTextView = rowMain.findViewById<TextView>(R.id.position_textview)
            positionTextView.text = "순서: " + position

            return rowMain
        }
    }
}