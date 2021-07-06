package jp.techacademy.kotaro.nohagi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc_answer.*

class CalcAnswer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_answer)

        val value1 = intent.getDoubleExtra("VALUE1", 0.00)
            textView2.text = "${value1}"
    }
}