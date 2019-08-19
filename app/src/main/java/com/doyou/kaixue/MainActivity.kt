package com.doyou.kaixue

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    lateinit var mainTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainTv = findViewById(R.id.mainTv)

        checkNull(mainTv)
    }

    private fun checkNull(tv: TextView?) {
        Log.d(TAG, tv?.id.toString())
        tv?.text = tv?.id.toString()
    }
}
