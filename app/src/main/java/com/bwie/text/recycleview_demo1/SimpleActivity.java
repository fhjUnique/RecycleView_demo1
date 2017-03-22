package com.bwie.text.recycleview_demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bwie.text.recycleview_demo1.adapter.RSimpleAdapter;

import java.util.ArrayList;

public class SimpleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> dataList;
    private RSimpleAdapter rSimpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        initData();
        //设置布局管理者
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        rSimpleAdapter = new RSimpleAdapter(this,dataList);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
        recyclerView.setAdapter(rSimpleAdapter);

    }

    private void initData() {
        dataList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            dataList.add("条目"+i);
        }
    }

    public void singleLine(View view){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        rSimpleAdapter.notifyDataSetChanged();
    }
    public void moreLine(View view){
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        rSimpleAdapter.notifyDataSetChanged();
    }
    public void singleHorizontal(View view){
        recyclerView.setLayoutManager(new LinearLayoutManager(this,recyclerView.HORIZONTAL,false));
        rSimpleAdapter.notifyDataSetChanged();
    }
    public void moreHorizontal(View view){
        recyclerView.setLayoutManager(new GridLayoutManager(this,5,recyclerView.HORIZONTAL,false));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL_LIST));
        rSimpleAdapter.notifyDataSetChanged();
    }
}
