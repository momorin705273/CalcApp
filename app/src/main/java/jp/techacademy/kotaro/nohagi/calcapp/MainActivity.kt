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
    }
    override fun onClick(v: View) {
        if(editText1.text.toString().equals("")||editText2.text.toString().equals("")) {
            error.text = "数字を入力した後、ボタンを押してください。"
        }else if(editText2.text.toString().toDouble()==0.0 && v.id == R.id.button4){
            error.text="「0」で割ることは出来ません。"
        }else{
            val intent = Intent(this, CalcAnswer::class.java)
            when(v.id){
                R.id.button1 -> {
                    intent.putExtra("VALUE1", editText1.text.toString().toDouble() + editText2.text.toString().toDouble())
                }
                R.id.button2 -> {
                    intent.putExtra("VALUE1", editText1.text.toString().toDouble() - editText2.text.toString().toDouble())
                }
                R.id.button3 -> {
                    intent.putExtra("VALUE1", editText1.text.toString().toDouble() * editText2.text.toString().toDouble())
                }
                R.id.button4 -> {
                    intent.putExtra("VALUE1", editText1.text.toString().toDouble() / editText2.text.toString().toDouble())
                }
            }
            startActivity(intent)
        }
    }
}