package com.khilman.seconddaykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
// biar ngga perlu pake findViewById() lagi
// kurang lebih mirip seperti butter knife fungsinya
import kotlinx.android.synthetic.main.activity_simple_list_view.*
/**
 * Created by Rizal Hilman on 22/08/17.
 * rizal.drawrs@gmail.com
 * fb.me/rizal.ofdraw
 */
class SimpleListViewActivity : AppCompatActivity() {
    // buat data array
    var dataArray = arrayOf("Java", "Kotlin", "Swift", "PHP", "Phyton", "Ruby", "C#", "Kotlin", "HTML", "CSS", "JavaScript", "GO Lang", "C++", "Ruby on Rails")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list_view)
        // menset Title bar
        this.supportActionBar?.setTitle("Simple List View")
        // create adapter for adapter
        var adapter = ArrayAdapter(SimpleListViewActivity@this, android.R.layout.simple_list_item_1, dataArray)
        // set Adapter ke listview
        listview.adapter = adapter

    }
}
