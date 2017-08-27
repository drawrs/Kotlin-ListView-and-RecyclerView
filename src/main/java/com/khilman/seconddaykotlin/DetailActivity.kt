package com.khilman.seconddaykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
/**
 * Created by Rizal Hilman on 22/08/17.
 * rizal.drawrs@gmail.com
 * fb.me/rizal.ofdraw
 */
class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        gambarbuah.setImageResource(intent.getIntExtra("gb", 0))
        namabuah.setText(intent.getStringExtra("nb"))
    }
}
