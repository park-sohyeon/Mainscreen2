package com.example.recolap

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity2 : AppCompatActivity() {

    var dataService = DataService()
    var members: List<Member>? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
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

        button1.setOnClickListener {
            val intent = Intent(this, SearchScreen2::class.java)
            startActivity(intent)

            button4.setOnClickListener {
                val intent = Intent(this, gamescreen::class.java)
                startActivity(intent)

                button5.setOnClickListener {
                    val intent = Intent(this, studyscreen::class.java)
                    startActivity(intent)

                    button5.setOnClickListener {
                        val intent = Intent(this, SearchScreen2::class.java)
                        startActivity(intent)


                    }
                }
            }
        }
    }
}