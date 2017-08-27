package com.khilman.seconddaykotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
/**
 * Created by Rizal Hilman on 22/08/17.
 * rizal.drawrs@gmail.com
 * fb.me/rizal.ofdraw
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonlistview.setOnClickListener {
            moveActivity(SimpleListViewActivity())
        }
        buttonrecyclerview.setOnClickListener {
            moveActivity(RecyclerViewActivity())
        }
    }

    private fun moveActivity(activityTarget: Any){
        startActivity(Intent(applicationContext, activityTarget::class.java))
    }
}
