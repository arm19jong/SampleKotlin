package com.jongzazaal.samplekotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var mRecyclerView: RecyclerView? = null
    private var mAdapter: RecyclerView.Adapter<*>? = null
    private var mLayoutManager: RecyclerView.LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_main)
        mRecyclerView = findViewById(R.id.my_recycler_view) as RecyclerView

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView

        mRecyclerView!!.setHasFixedSize(true)

        // use a linear layout manager
        mLayoutManager = LinearLayoutManager(getApplicationContext())
        mRecyclerView!!.setLayoutManager(mLayoutManager)

        // specify an adapter (see also next example)
        val myDataSet = arrayOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12")

        mAdapter = MyAdapter(myDataSet)
        mRecyclerView!!.setAdapter(mAdapter)

    }

}
