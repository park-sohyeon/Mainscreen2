package com.example.recolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_studyscreen.*

class studyscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_studyscreen)

        button16.setOnClickListener {
            val intent = Intent(this, ResultScreen::class.java)
            startActivity(intent)

            button2.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("코딩(개발용)의 대략적 사향입니다.")
                dialog.setMessage("CPU: 8th-generation Intal Core i5-i7, 램 8-32GB, SSD: 128GB-2TB, 그래픽: Intel UHD Graphics 620 ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }
            button13.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("단순 문서작업의 대략적 사향입니다.")
                dialog.setMessage("CPU: i5(6200U/ 7200U/ 8250U) , 램 4-16GB, SSD: 256GB, 그래픽: MX150 ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }
            button14.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("사진/영상 편집의 대략적 사향입니다.")
                dialog.setMessage("CPU: i7-9750H , 램 8GB, SSD: 256GB, 그래픽: GTX1650 ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }
        }

    }
}