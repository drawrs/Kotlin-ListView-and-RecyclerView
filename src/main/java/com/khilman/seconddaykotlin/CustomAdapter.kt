package com.khilman.seconddaykotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by Rizal Hilman on 22/08/17.
 * rizal.drawrs@gmail.com
 * fb.me/rizal.ofdraw
 */
// extends
class CustomAdapter : RecyclerView.Adapter<CustomAdapter.MyHolder> {

    // deklarasi variable
    var c : Activity? = null
    var dataBuah : Array<String>? = null
    var dataGambar : Array<Int>? = null

    constructor(recyclerViewActivity: RecyclerViewActivity, dataBuah: Array<String>, dataGambar: Array<Int>){
        // inisialisasi value
        c = recyclerViewActivity
        this.dataBuah = dataBuah
        this.dataGambar = dataGambar
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var txt : TextView? = itemView?.findViewById(R.id.rctitle)
        var img : ImageView? = itemView?.findViewById(R.id.rcimage)
        var carditem : CardView? = itemView?.findViewById(R.id.cardItem)


    }
    override fun onBindViewHolder(holder: MyHolder?, position: Int) {
        holder?.txt?.text = dataBuah?.get(position)
        holder?.img?.setImageResource(dataGambar?.get(position)!!)
        holder?.carditem?.setOnClickListener {
            var intent : Intent = Intent(c, DetailActivity::class.java)
            intent.putExtra("nb", dataBuah?.get(position))
            intent.putExtra("gb",dataGambar?.get(position))
            //intent.putExtras("gb", dataGambar.get(position))
            c?.startActivity(intent)
        }
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return dataBuah?.size!!
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
        var view = LayoutInflater.from(c).inflate(R.layout.list_item, parent, false)

        return MyHolder(view)
        ///TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}