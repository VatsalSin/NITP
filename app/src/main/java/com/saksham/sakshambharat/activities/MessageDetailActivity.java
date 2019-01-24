package com.saksham.sakshambharat.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.saksham.sakshambharat.R;

public class MessageDetailActivity extends AppCompatActivity {

    RecyclerView messageDetailRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_detail);

        messageDetailRecycler = (RecyclerView) findViewById(R.id.message_detail_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        messageDetailRecycler.setLayoutManager(linearLayoutManager);
        messageDetailRecycler.setHasFixedSize(false);

    }
}
