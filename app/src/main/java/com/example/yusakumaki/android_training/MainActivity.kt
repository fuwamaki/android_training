package com.example.yusakumaki.android_training

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val items = Array(20, { i -> "Title-$i" })
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        mainListView.adapter = adapter
    }
}
