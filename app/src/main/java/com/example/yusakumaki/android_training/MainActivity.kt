package com.example.yusakumaki.android_training

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ArrayAdapter
import android.content.Intent
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Listに並べる
        val items = Array(20, { i -> "Title-$i" })
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        mainListView.adapter = adapter
        mainListView.setOnItemClickListener { _, view, i, l ->
            Toast.makeText(this, "Clicked: ${i}", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Sample1Activity::class.java)
            startActivity(intent)
        }
    }
}
