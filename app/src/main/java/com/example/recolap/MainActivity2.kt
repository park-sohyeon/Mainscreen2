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
    var members: ArrayList<Member>? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        dataService.select.selectAll()
            ?.enqueue(object : Callback<ArrayList<Member?>?>{
                override fun onResponse(
                    call: Call<ArrayList<Member?>?>,
                    response: Response<ArrayList<Member?>?>
                ) {
                    members = response.body() as ArrayList<Member>?
                }

                override fun onFailure(
                    call: Call<ArrayList<Member?>?>?,
                    t: Throwable
                ) {
                    t.printStackTrace()
                }
            })

        val intent = Intent(this, ResultScreen::class.java)
        intent.putStringArrayListExtra("members", members)
        startActivityForResult(intent, 100)


        button1.setOnClickListener {
            val intent = Intent(this, SearchScreen2::class.java)
            startActivity(intent)

            button4.setOnClickListener {
                val intent = Intent(this, gamescreen::class.java)
                startActivity(intent)

                button5.setOnClickListener {
                    val intent = Intent(this, studyscreen::class.java)
                    startActivity(intent)

                    button6.setOnClickListener {
                        val intent = Intent(this, SearchScreen2::class.java)
                        startActivity(intent)


                    }
                }
            }
        }
    }
}

private fun Intent.putStringArrayListExtra(members: String, members1: ArrayList<Member>?) {

}

private fun <T> Call<T>?.enqueue(callback: Callback<ArrayList<Member?>?>) {

}
