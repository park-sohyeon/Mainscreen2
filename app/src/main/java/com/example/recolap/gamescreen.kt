package com.example.recolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_gamescreen.*

class gamescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gamescreen)

        button15.setOnClickListener {
            val intent = Intent(this, ResultScreen::class.java)
            startActivity(intent)

            button.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("메이플스토리의 최소 사향입니다.")
                dialog.setMessage("CPUPentium Dual Core급 이상, 램 4GB 이상, 하드여유공간 20GB 이상, 그래픽 Geforce 6600GT / Raneon X 600XT 이상 ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }
            button3.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("롤의 최소 사향입니다.")
                dialog.setMessage("CPUCPU 3GHz, 램 4GB 이상, 하드여유공간 12GB 이상, 그래픽 Geforce 8800 / 동급 그래픽 카드(512MB 이상 비디오 메모리, 전용 GPU가 적용된) 이상 ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }
            button7.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("배틀그라운드의 최소 사향입니다.")
                dialog.setMessage("CPUintel Core i5-6600K, AMD Ryzen 5 1600, 램 16GB 이상, 하드여유공간 30GB 이상, 공간 그래픽nVidia GeForce 1060 3GB, AMD Radeon RX 580 4GB ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }
            button8.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("오버워치의 최소 사향입니다.")
                dialog.setMessage("CPUintel Core i5 / AMD Phenom || X3 이상, 램 6GB 이상, 하드여유공간 30GB 이상, 그래픽 NVIDIA GeForce GTX 660 / AMD Radeon HD 7950 이상 ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }
            button9.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("피파 온라인5의 최소 사향입니다.")
                dialog.setMessage("CPUintel i5-2550K @ 3.4GHz (or AMD FX-6350 Six-Core equivalent), 램 8GB 이상, 하드여유공간 18GB 이상, 그래픽 NVIDIA GeForce GTX 460 / AMD Radeon HD 6870 이상 ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }
            button10.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("던전앤파이터의 최소 사향입니다.")
                dialog.setMessage("CPUCore2Duo E7500 이상, 램 4GB 이상, 하드설치 전 HDD 여유공간 18G 이상/ 설치후 HDD 여유공간 10G 이상, 그래픽 VRAM 512M 이상 ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }
            button11.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("GTA5의 최소 사향입니다.")
                dialog.setMessage("CPUintal Core i5 3470 @ 3.2GHz, AMD X8 FX-8350 @ 4GHz, 램 8GB 이상, 하드여유공간 72GB 이상, 그래픽 NVIDIA GTX 660 2GB/ AMD HD 7870 2GB이상 ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }
            button12.setOnClickListener { view ->
                val dialog = AlertDialog.Builder(this)
                dialog.setTitle("서든어택의 최소 사향입니다.")
                dialog.setMessage("CPUintal Core2 Duo E8400, 램 4GB 이상, 하드여유공간 20GB 이상, 그래픽 NVIDIA GTX 970/ AMD RX 480 이상 ")
                dialog.setNeutralButton("확인", null)
                dialog.setCancelable(false)
                dialog.show()
            }


        }
    }
}