package jp.techacademy.kotaro.nohagi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc_answer.*

class CalcAnswer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_answer)

        val value1 = intent.getDoubleExtra("VALUE1", 0.00)
        val value2 = intent.getDoubleExtra("VALUE2", 0.00)
        val value3 = intent.getStringExtra("VALUE3")

        if(value3=="+") {
            textView2.text = "${value1 + value2}"
        }else if(value3=="-") {
            textView2.text = "${value1 - value2}"
        }else if(value3=="×") {
            textView2.text = "${value1 * value2}"
        }else if(value3=="÷") {
            textView2.text = "${value1 / value2}"
        }
    }
}