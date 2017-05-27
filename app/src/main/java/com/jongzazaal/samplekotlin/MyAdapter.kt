package com.jongzazaal.samplekotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by jongzazaal on 5/27/2017.
 */
class MyAdapter(private val myDataSet: Array<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.mTextView.setText(myDataSet[position])
    }

    override fun getItemCount(): Int {
        return this.myDataSet.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent!!.context)
                .inflate(R.layout.recycler_main_list, parent, false)

        return ViewHolder(v)
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        // each data item is just a string in this case
        var mTextView: TextView

        init {
            mTextView = v.findViewById(R.id.info_text) as TextView
        }
    }


}