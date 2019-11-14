package com.example.testalihotfix

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.newpath.activity_temp.*

class TempActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp)
        bt_info.setOnClickListener {
            Toast.makeText(this@TempActivity, "新包点击了", Toast.LENGTH_SHORT).show()
        }
    }
}