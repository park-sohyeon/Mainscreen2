package com.example.recolap

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_search_screen.*

class SearchScreen : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    private var tv_result: TextView? = null
    private var cb1: CheckBox? = null
    private var cb2: CheckBox? = null
    private var cb3: CheckBox? = null
    private var cb4: CheckBox? = null
    private var cb5: CheckBox? = null
    private var cb6: CheckBox? = null
    private var cb7: CheckBox? = null
    private var cb8: CheckBox? = null
    private var cb9: CheckBox? = null
    private var cb10: CheckBox? = null

    private var cb11: CheckBox? = null
    private var cb12: CheckBox? = null
    private var cb13: CheckBox? = null
    private var cb14: CheckBox? = null
    private var cb15: CheckBox? = null
    private var cb16: CheckBox? = null
    private var cb17: CheckBox? = null
    private var cb18: CheckBox? = null
    private var cb19: CheckBox? = null
    private var cb20: CheckBox? = null

    private var cb21: CheckBox? = null
    private var cb22: CheckBox? = null
    private var cb23: CheckBox? = null
    private var cb24: CheckBox? = null
    private var cb25: CheckBox? = null
    private var cb26: CheckBox? = null
    private var cb27: CheckBox? = null
    private var cb28: CheckBox? = null
    private var cb29: CheckBox? = null
    private var cb30: CheckBox? = null

    private var cb31: CheckBox? = null
    private var cb32: CheckBox? = null

    private var cb37: CheckBox? = null
    private var cb38: CheckBox? = null
    private var cb39: CheckBox? = null
    private var cb40: CheckBox? = null

    private var cb41: CheckBox? = null
    private var cb42: CheckBox? = null
    private var cb43: CheckBox? = null
    private var cb44: CheckBox? = null
    private var cb45: CheckBox? = null
    private var cb46: CheckBox? = null
    private var cb47: CheckBox? = null
    private var cb48: CheckBox? = null
    private var cb49: CheckBox? = null
    private var cb50: CheckBox? = null

    private var cb51: CheckBox? = null
    private var cb52: CheckBox? = null
    private var cb53: CheckBox? = null
    private var cb54: CheckBox? = null
    private var cb55: CheckBox? = null
    private var cb56: CheckBox? = null
    private var cb57: CheckBox? = null
    private var cb58: CheckBox? = null
    private var cb59: CheckBox? = null
    private var cb60: CheckBox? = null

    private var cb61: CheckBox? = null
    private var cb62: CheckBox? = null
    private var cb63: CheckBox? = null
    private var cb64: CheckBox? = null
    private var cb65: CheckBox? = null
    private var cb66: CheckBox? = null
    private var cb67: CheckBox? = null
    private var cb68: CheckBox? = null
    private var cb69: CheckBox? = null
    private var cb70: CheckBox? = null

    private var cb71: CheckBox? = null
    private var cb72: CheckBox? = null

    private var cb78: CheckBox? = null
    private var cb79: CheckBox? = null
    private var cb80: CheckBox? = null

    private var cb81: CheckBox? = null
    private var cb82: CheckBox? = null

    private var cb96: CheckBox? = null
    private var cb97: CheckBox? = null
    private var cb98: CheckBox? = null
    private var cb99: CheckBox? = null
    private var cb100: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_screen)

        btn_enter.setOnClickListener{
            val intent = Intent(this, ResultScreen::class.java) // 다음 화면으로 넘어가기 위한 인텐트 객체 생성.
            startActivity(intent)
        }

        btnTIP.setOnClickListener{view->
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("")
            dialog.setMessage("화면크기 : 휴대성이 중요하다면 13.3인치를, 큰 화면이 필요하면 15.6인치를 추천합니다.\n" +
                    "CPU : 15W 이하의 저전력 프로세서로 알아보는 것을 추천합니다. 최소 4GB, 8GB를 권장합니다.\n" +
                    "SSD : 256GB 클라우드나 외장 장치를 활용하면 무난히 쓸만 합니다. 자금 여력이 된다면 클수록 좋습니다.\n" +
                    "디스플레이 : 특별한 목적이 없다면 FHD(1080p) 해상도의 IPS 패널이 무난합니다.")
            dialog.setNeutralButton("확인", null)
            dialog.setCancelable(false)
            dialog.show()
        }

        cb1 = findViewById(R.id.checkBox1)
        cb2 = findViewById(R.id.checkBox2)
        cb3 = findViewById(R.id.checkBox3)
        cb4 = findViewById(R.id.checkBox4)
        cb5 = findViewById(R.id.checkBox5)
        cb6 = findViewById(R.id.checkBox6)
        cb7 = findViewById(R.id.checkBox7)
        cb8 = findViewById(R.id.checkBox8)
        cb9 = findViewById(R.id.checkBox9)
        cb10 = findViewById(R.id.checkBox10)

        cb11 = findViewById(R.id.checkBox11)
        cb12 = findViewById(R.id.checkBox12)
        cb13 = findViewById(R.id.checkBox13)
        cb14 = findViewById(R.id.checkBox14)
        cb15 = findViewById(R.id.checkBox15)
        cb16 = findViewById(R.id.checkBox16)
        cb17 = findViewById(R.id.checkBox17)
        cb18 = findViewById(R.id.checkBox18)
        cb19 = findViewById(R.id.checkBox19)
        cb20 = findViewById(R.id.checkBox20)

        cb21 = findViewById(R.id.checkBox21)
        cb22 = findViewById(R.id.checkBox22)
        cb23 = findViewById(R.id.checkBox23)
        cb24 = findViewById(R.id.checkBox24)
        cb25 = findViewById(R.id.checkBox25)
        cb26 = findViewById(R.id.checkBox26)
        cb27 = findViewById(R.id.checkBox27)
        cb28 = findViewById(R.id.checkBox28)
        cb29 = findViewById(R.id.checkBox29)
        cb30 = findViewById(R.id.checkBox30)

        cb31 = findViewById(R.id.checkBox31)
        cb32 = findViewById(R.id.checkBox32)

        cb37 = findViewById(R.id.checkBox37)
        cb38 = findViewById(R.id.checkBox38)
        cb39 = findViewById(R.id.checkBox39)
        cb40 = findViewById(R.id.checkBox40)

        cb41 = findViewById(R.id.checkBox41)
        cb42 = findViewById(R.id.checkBox42)
        cb43 = findViewById(R.id.checkBox43)
        cb44 = findViewById(R.id.checkBox44)
        cb45 = findViewById(R.id.checkBox45)
        cb46 = findViewById(R.id.checkBox46)
        cb47 = findViewById(R.id.checkBox47)
        cb48 = findViewById(R.id.checkBox48)
        cb49 = findViewById(R.id.checkBox49)
        cb50 = findViewById(R.id.checkBox50)

        cb51 = findViewById(R.id.checkBox51)
        cb52 = findViewById(R.id.checkBox52)
        cb53 = findViewById(R.id.checkBox53)
        cb54 = findViewById(R.id.checkBox54)
        cb55 = findViewById(R.id.checkBox55)
        cb56 = findViewById(R.id.checkBox56)
        cb57 = findViewById(R.id.checkBox57)
        cb58 = findViewById(R.id.checkBox58)
        cb59 = findViewById(R.id.checkBox59)
        cb60 = findViewById(R.id.checkBox60)

        cb61 = findViewById(R.id.checkBox61)
        cb62 = findViewById(R.id.checkBox62)
        cb63 = findViewById(R.id.checkBox63)
        cb64 = findViewById(R.id.checkBox64)
        cb65 = findViewById(R.id.checkBox65)
        cb66 = findViewById(R.id.checkBox66)
        cb67 = findViewById(R.id.checkBox67)
        cb68 = findViewById(R.id.checkBox68)
        cb69 = findViewById(R.id.checkBox69)
        cb70 = findViewById(R.id.checkBox70)

        cb71 = findViewById(R.id.checkBox71)
        cb72 = findViewById(R.id.checkBox72)

        cb78 = findViewById(R.id.checkBox78)
        cb79 = findViewById(R.id.checkBox79)
        cb80 = findViewById(R.id.checkBox80)

        cb81 = findViewById(R.id.checkBox81)
        cb82 = findViewById(R.id.checkBox82)

        cb96 = findViewById(R.id.checkBox96)
        cb97 = findViewById(R.id.checkBox97)
        cb98 = findViewById(R.id.checkBox98)
        cb99 = findViewById(R.id.checkBox99)
        cb100 = findViewById(R.id.checkBox100)

        tv_result = findViewById(R.id.tv_result)
        cb1!!.setOnCheckedChangeListener(this)
        cb2!!.setOnCheckedChangeListener(this)
        cb3!!.setOnCheckedChangeListener(this)
        cb4!!.setOnCheckedChangeListener(this)
        cb5!!.setOnCheckedChangeListener(this)
        cb6!!.setOnCheckedChangeListener(this)
        cb7!!.setOnCheckedChangeListener(this)
        cb8!!.setOnCheckedChangeListener(this)
        cb9!!.setOnCheckedChangeListener(this)
        cb10!!.setOnCheckedChangeListener(this)

        cb11!!.setOnCheckedChangeListener(this)
        cb12!!.setOnCheckedChangeListener(this)
        cb13!!.setOnCheckedChangeListener(this)
        cb14!!.setOnCheckedChangeListener(this)
        cb15!!.setOnCheckedChangeListener(this)
        cb16!!.setOnCheckedChangeListener(this)
        cb17!!.setOnCheckedChangeListener(this)
        cb18!!.setOnCheckedChangeListener(this)
        cb19!!.setOnCheckedChangeListener(this)
        cb20!!.setOnCheckedChangeListener(this)

        cb21!!.setOnCheckedChangeListener(this)
        cb22!!.setOnCheckedChangeListener(this)
        cb23!!.setOnCheckedChangeListener(this)
        cb24!!.setOnCheckedChangeListener(this)
        cb25!!.setOnCheckedChangeListener(this)
        cb26!!.setOnCheckedChangeListener(this)
        cb27!!.setOnCheckedChangeListener(this)
        cb28!!.setOnCheckedChangeListener(this)
        cb29!!.setOnCheckedChangeListener(this)
        cb30!!.setOnCheckedChangeListener(this)

        cb31!!.setOnCheckedChangeListener(this)
        cb32!!.setOnCheckedChangeListener(this)

        cb37!!.setOnCheckedChangeListener(this)
        cb38!!.setOnCheckedChangeListener(this)
        cb39!!.setOnCheckedChangeListener(this)
        cb40!!.setOnCheckedChangeListener(this)

        cb41!!.setOnCheckedChangeListener(this)
        cb42!!.setOnCheckedChangeListener(this)
        cb43!!.setOnCheckedChangeListener(this)
        cb44!!.setOnCheckedChangeListener(this)
        cb45!!.setOnCheckedChangeListener(this)
        cb46!!.setOnCheckedChangeListener(this)
        cb47!!.setOnCheckedChangeListener(this)
        cb48!!.setOnCheckedChangeListener(this)
        cb49!!.setOnCheckedChangeListener(this)
        cb50!!.setOnCheckedChangeListener(this)

        cb51!!.setOnCheckedChangeListener(this)
        cb52!!.setOnCheckedChangeListener(this)
        cb53!!.setOnCheckedChangeListener(this)
        cb54!!.setOnCheckedChangeListener(this)
        cb55!!.setOnCheckedChangeListener(this)
        cb56!!.setOnCheckedChangeListener(this)
        cb57!!.setOnCheckedChangeListener(this)
        cb58!!.setOnCheckedChangeListener(this)
        cb59!!.setOnCheckedChangeListener(this)
        cb60!!.setOnCheckedChangeListener(this)

        cb61!!.setOnCheckedChangeListener(this)
        cb62!!.setOnCheckedChangeListener(this)
        cb63!!.setOnCheckedChangeListener(this)
        cb64!!.setOnCheckedChangeListener(this)
        cb65!!.setOnCheckedChangeListener(this)
        cb66!!.setOnCheckedChangeListener(this)
        cb67!!.setOnCheckedChangeListener(this)
        cb68!!.setOnCheckedChangeListener(this)
        cb69!!.setOnCheckedChangeListener(this)
        cb70!!.setOnCheckedChangeListener(this)

        cb71!!.setOnCheckedChangeListener(this)
        cb72!!.setOnCheckedChangeListener(this)

        cb78!!.setOnCheckedChangeListener(this)
        cb79!!.setOnCheckedChangeListener(this)
        cb80!!.setOnCheckedChangeListener(this)

        cb81!!.setOnCheckedChangeListener(this)
        cb82!!.setOnCheckedChangeListener(this)

        cb96!!.setOnCheckedChangeListener(this)
        cb97!!.setOnCheckedChangeListener(this)
        cb98!!.setOnCheckedChangeListener(this)
        cb99!!.setOnCheckedChangeListener(this)
        cb100!!.setOnCheckedChangeListener(this)

    }

    @SuppressLint("SetTextI18n")
    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        // 체크박스를 클릭해서 상태가 바꾸었을 경우 호출되는 콜백 메서드
        var result = "" // 문자열 초기화는 빈문자열로 하자

        //if(isChecked) tv.setText("체크했음");
        //else tv.setText("체크안했슴");

        // 혹은 3항연산자
        //tx.setText(isChecked?"체크했음":"안했음");
        if (cb1!!.isChecked) result += cb1!!.text.toString() + ", "
        if (cb2!!.isChecked) result += cb2!!.text.toString() + ". "
        if (cb3!!.isChecked) result += cb3!!.text.toString() + ". "
        if (cb4!!.isChecked) result += cb4!!.text.toString() + ". "
        if (cb5!!.isChecked) result += cb5!!.text.toString() + ", "
        if (cb6!!.isChecked) result += cb6!!.text.toString() + ". "
        if (cb7!!.isChecked) result += cb7!!.text.toString() + ". "
        if (cb8!!.isChecked) result += cb8!!.text.toString() + ". "
        if (cb9!!.isChecked) result += cb9!!.text.toString() + ", "
        if (cb10!!.isChecked) result += cb10!!.text.toString() + ". "

        if (cb11!!.isChecked) result += cb11!!.text.toString() + ", "
        if (cb12!!.isChecked) result += cb12!!.text.toString() + ". "
        if (cb13!!.isChecked) result += cb13!!.text.toString() + ". "
        if (cb14!!.isChecked) result += cb14!!.text.toString() + ". "
        if (cb15!!.isChecked) result += cb15!!.text.toString() + ", "
        if (cb16!!.isChecked) result += cb16!!.text.toString() + ". "
        if (cb17!!.isChecked) result += cb17!!.text.toString() + ". "
        if (cb18!!.isChecked) result += cb18!!.text.toString() + ". "
        if (cb19!!.isChecked) result += cb19!!.text.toString() + ", "
        if (cb20!!.isChecked) result += cb20!!.text.toString() + ". "

        if (cb21!!.isChecked) result += cb21!!.text.toString() + ", "
        if (cb22!!.isChecked) result += cb22!!.text.toString() + ". "
        if (cb23!!.isChecked) result += cb23!!.text.toString() + ". "
        if (cb24!!.isChecked) result += cb24!!.text.toString() + ". "
        if (cb25!!.isChecked) result += cb25!!.text.toString() + ", "
        if (cb26!!.isChecked) result += cb26!!.text.toString() + ". "
        if (cb27!!.isChecked) result += cb27!!.text.toString() + ". "
        if (cb28!!.isChecked) result += cb28!!.text.toString() + ". "
        if (cb29!!.isChecked) result += cb29!!.text.toString() + ", "
        if (cb30!!.isChecked) result += cb30!!.text.toString() + ". "

        if (cb31!!.isChecked) result += cb31!!.text.toString() + ", "
        if (cb32!!.isChecked) result += cb32!!.text.toString() + ". "

        if (cb37!!.isChecked) result += cb37!!.text.toString() + ". "
        if (cb38!!.isChecked) result += cb38!!.text.toString() + ". "
        if (cb39!!.isChecked) result += cb39!!.text.toString() + ", "
        if (cb40!!.isChecked) result += cb40!!.text.toString() + ". "

        if (cb41!!.isChecked) result += cb41!!.text.toString() + ", "
        if (cb42!!.isChecked) result += cb42!!.text.toString() + ". "
        if (cb43!!.isChecked) result += cb43!!.text.toString() + ". "
        if (cb44!!.isChecked) result += cb44!!.text.toString() + ". "
        if (cb45!!.isChecked) result += cb45!!.text.toString() + ", "
        if (cb46!!.isChecked) result += cb46!!.text.toString() + ". "
        if (cb47!!.isChecked) result += cb47!!.text.toString() + ". "
        if (cb48!!.isChecked) result += cb48!!.text.toString() + ". "
        if (cb49!!.isChecked) result += cb49!!.text.toString() + ", "
        if (cb50!!.isChecked) result += cb50!!.text.toString() + ". "

        if (cb51!!.isChecked) result += cb51!!.text.toString() + ", "
        if (cb52!!.isChecked) result += cb52!!.text.toString() + ". "
        if (cb53!!.isChecked) result += cb53!!.text.toString() + ". "
        if (cb54!!.isChecked) result += cb54!!.text.toString() + ". "
        if (cb55!!.isChecked) result += cb55!!.text.toString() + ", "
        if (cb56!!.isChecked) result += cb56!!.text.toString() + ". "
        if (cb57!!.isChecked) result += cb57!!.text.toString() + ". "
        if (cb58!!.isChecked) result += cb58!!.text.toString() + ". "
        if (cb59!!.isChecked) result += cb59!!.text.toString() + ", "
        if (cb60!!.isChecked) result += cb60!!.text.toString() + ". "

        if (cb61!!.isChecked) result += cb61!!.text.toString() + ", "
        if (cb62!!.isChecked) result += cb62!!.text.toString() + ". "
        if (cb63!!.isChecked) result += cb63!!.text.toString() + ". "
        if (cb64!!.isChecked) result += cb64!!.text.toString() + ". "
        if (cb65!!.isChecked) result += cb65!!.text.toString() + ", "
        if (cb66!!.isChecked) result += cb66!!.text.toString() + ". "
        if (cb67!!.isChecked) result += cb67!!.text.toString() + ". "
        if (cb68!!.isChecked) result += cb68!!.text.toString() + ". "
        if (cb69!!.isChecked) result += cb69!!.text.toString() + ", "
        if (cb70!!.isChecked) result += cb70!!.text.toString() + ". "

        if (cb71!!.isChecked) result += cb71!!.text.toString() + ", "
        if (cb72!!.isChecked) result += cb72!!.text.toString() + ". "

        if (cb78!!.isChecked) result += cb78!!.text.toString() + ". "
        if (cb79!!.isChecked) result += cb79!!.text.toString() + ", "
        if (cb80!!.isChecked) result += cb80!!.text.toString() + ". "

        if (cb81!!.isChecked) result += cb81!!.text.toString() + ", "
        if (cb82!!.isChecked) result += cb82!!.text.toString() + ". "

        if (cb96!!.isChecked) result += cb66!!.text.toString() + ". "
        if (cb97!!.isChecked) result += cb67!!.text.toString() + ". "
        if (cb98!!.isChecked) result += cb68!!.text.toString() + ". "
        if (cb99!!.isChecked) result += cb69!!.text.toString() + ", "
        if (cb100!!.isChecked) result += cb70!!.text.toString() + ". "

        tv_result!!.text = result
    }
}
