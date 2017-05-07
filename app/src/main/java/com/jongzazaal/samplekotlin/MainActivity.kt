package com.jongzazaal.samplekotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private var addButton: ImageButton? = null
    private var removeButton: ImageButton? = null
    private var num: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text) as TextView
        addButton = findViewById(R.id.add) as ImageButton
        removeButton = findViewById(R.id.remove) as ImageButton

        addButton!!.setOnClickListener {
            num = numCount(num, 0)
            textView!!.text = "number: $num"
        }
        removeButton!!.setOnClickListener {
            num = numCount(num, 1)
            textView!!.text = "number: $num"
        }
    }
    private fun numCount(inputNum: Int, check: Int): Int {
        if (check == 0){
            return inputNum + 1
        }
        else{
            return inputNum - 1
        }
    }
}
