package com.bwie.text.recycleview_demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bwie.text.recycleview_demo1.adapter.RMoreItemAdapter;

public class MoreItemActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private String str = "+++++++++++++++++++++++++++++++++++++1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_item);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RMoreItemAdapter(this,str));


    }
}
