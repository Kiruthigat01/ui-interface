package com.example.uiinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uiinterface.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val textview = binding.tv1
        val button = binding.btnStart
        val msg1 = "android"
        val msg2 ="studio"

        button.setOnClickListener {
            Thread(Runnable {
                while (true) {
                    runOnUiThread { textview.text = msg1 }
                    Thread.sleep(1000)
                    runOnUiThread {
                        textview.text = msg2
                    }

                    Thread.sleep(1000)
                }
                }).start()
        }
    }
}
