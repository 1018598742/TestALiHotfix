package com.example.testalihotfix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        val TAG = "My_Test"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "MainActivity-onCreate: 测试打开了主界面");
        jump_bt.setOnClickListener {
            startActivity(Intent(this@MainActivity, TempActivity::class.java))
        }
    }
}
