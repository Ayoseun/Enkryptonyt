package com.mushroom.enkryptonyt

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val passwrd = findViewById<EditText>(R.id.passwrd)
        var etxt = findViewById<TextView>(R.id.email)
        val enty = findViewById<Button>(R.id.enty)

            val alph = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ')
            val caesarAlph = charArrayOf('b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', ' ')

            val scan = passwrd.text.toHashSet().toString()
        val s2 = scan.toLowerCase(Locale.ROOT)
            val data = StringBuffer(s2)
            coded(data, alph, caesarAlph)


            enty.setOnClickListener {
                if (etxt.text.isEmpty()){
                    etxt.text = data
                }
                else{
                    etxt.text = ""
                }

                Log.i("checkers","$data")

        }

    }

    fun coded(data: StringBuffer, a: CharArray, b: CharArray){
        for (i in data.indices){
            for (j in a.indices){
                if (data[i] == a[j]){
                    data.setCharAt(i, b[j])
                    break
                }
            }
        }
    }
}