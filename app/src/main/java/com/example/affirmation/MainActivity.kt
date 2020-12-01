package com.example.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.data.DataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataSet = DataSource().loadAffirmation()

        val mRecyclerView: RecyclerView = findViewById(R.id.my_recyler_view)
        mRecyclerView.adapter = ItemAdapter(this, myDataSet)
        mRecyclerView.setHasFixedSize(true)
    }
}