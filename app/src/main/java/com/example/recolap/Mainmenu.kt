package com.example.recolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Mainmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_search.setOnClickListener{
            val intent = Intent(this, Mainmenu::class.java) // 다음 화면으로 넘어가기 위한 인텐트 객체 생성.
            startActivity(intent)
        }

        btn_reco.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java) // 다음 화면으로 넘어가기 위한 인텐트 객체 생성.
            startActivity(intent)
        }
    }
}