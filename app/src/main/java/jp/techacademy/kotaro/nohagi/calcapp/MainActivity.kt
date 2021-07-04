package jp.techacademy.kotaro.nohagi.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.text.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            textView2.text = "+"
        } else if (v.id == R.id.button2) {
            textView2.text = "-"
        } else if (v.id == R.id.button3) {
            textView2.text = "×"
        } else if (v.id == R.id.button4) {
            textView2.text = "÷"
        }else if (v.id == R.id.button5) {
            if(editText1.text.toString().equals("")||editText2.text.toString().equals("")) {
                error.text = "数字を入力してください。"
            }else if(textView2.text.equals(" ")) {
            error.text = "演算子のボタンを押してください。"
            }else if(editText2.text.toString().toDouble()==0.0 && textView2.text.equals("÷")){
                error.text="「0」で割ることは出来ません。"
            }else{
                val intent = Intent(this, CalcAnswer::class.java)
                intent.putExtra("VALUE1", editText1.text.toString().toDouble())
                intent.putExtra("VALUE2", editText2.text.toString().toDouble())
                intent.putExtra("VALUE3", textView2.text)
                startActivity(intent)
            }
        }
    }
}