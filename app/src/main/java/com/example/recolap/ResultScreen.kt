package com.example.recolap

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result_screen.*

class ResultScreen : AppCompatActivity() {

    var members = arrayListOf<Member>(
        Member(
            id = 0,
            PRODUCT_NAME = "String?",
            PRICE = "String?",
            DISPLAY = "String?",
            CPU_NAME = "String?",
            RESOLUTION = "String?",
            RAM = "String?",
            STORAGE_SIZE = "String?",
            WEIGHT = "String?"
        )
    )

    fun getExtra() {
        if (intent.hasExtra("members")) {
            var members = intent.getStringArrayListExtra("members")
        } else {
            Toast.makeText(this, "전달된 이름이 없습니다", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)

        val Adapter = MemberAdapter(this, members)
        listview.adapter = Adapter
    }
}

