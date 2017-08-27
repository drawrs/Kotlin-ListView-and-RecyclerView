package com.khilman.seconddaykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*
import java.util.*

/**
 * Created by Rizal Hilman on 22/08/17.
 * rizal.drawrs@gmail.com
 * fb.me/rizal.ofdraw
 */
class RecyclerViewActivity : AppCompatActivity() {
    // Buat data array nama-nama buah
    var dataBuah = arrayOf("Jambu Air", "Durian", "Alpukat", "Apel", "Ceri", "Manggis", "Strawberry")
    // ini data gambar dari nama-nama buah di atas, posisi dan banyak datanya harus sama (nama buah dan gambar buah)
    var dataGambar = arrayOf(R.drawable.jambuair, R.drawable.durian, R.drawable.alpukat, R.drawable.apel, R.drawable.ceri, R.drawable.manggis, R.drawable.strawberry)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        // menset Title bar
        this.supportActionBar?.setTitle("Recycler View")
        // merapihkan data array menjadi sesuai urutan abjad
        // ascending
        Arrays.sort(dataBuah)

        // buat custom adapter
        // membawa data nama buah dan gambarbuah juga context
        var adapter = CustomAdapter(this, dataBuah, dataGambar)
        // kita perlu layout manager, karena list_item.xml (layout untuk list item nya) menggunakan linear layout
        var linear = LinearLayoutManager(applicationContext) // jadi pakai LinearLayoutManager
        // set adapter ke recyclerview
        recyclerview.adapter = adapter
        // set layout manager ke recycler view
        recyclerview.layoutManager = linear
    }
}
