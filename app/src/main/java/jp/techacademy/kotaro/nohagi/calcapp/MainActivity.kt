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
            intent.putExtra("VALUE1", editText1.text.toString().toDoubleOrNull())
            intent.putExtra("VALUE2", editText2.text.toString().toDoubleOrNull())
            intent.putExtra("VALUE3", textView2.text)
            startActivity(intent)
        }
    }
}