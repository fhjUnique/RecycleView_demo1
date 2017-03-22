package com.bwie.text.recycleview_demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.bwie.text.recycleview_demo1.adapter.RWaterFallAdapter;

import java.util.ArrayList;

public class WaterFallActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Integer> dataList;
    private RWaterFallAdapter rWaterFallAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_fall);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        initData();
        rWaterFallAdapter = new RWaterFallAdapter(this, dataList);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,RecyclerView.VERTICAL));
        recyclerView.setAdapter(rWaterFallAdapter);




    }

    private void initData() {
        dataList = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            dataList.add("条目"+i);
//        }
        dataList.add(R.drawable.a2);
        dataList.add(R.drawable.a3);
        dataList.add(R.drawable.a4);
        dataList.add(R.drawable.a22);
        dataList.add(R.drawable.a6);
        dataList.add(R.drawable.a7);
        dataList.add(R.drawable.a8);
        dataList.add(R.drawable.a9);
        dataList.add(R.drawable.a10);
        dataList.add(R.drawable.a11);
        dataList.add(R.drawable.a12);
        dataList.add(R.drawable.a13);
        dataList.add(R.drawable.a14);
        dataList.add(R.drawable.a15);
        dataList.add(R.drawable.a16);
        dataList.add(R.drawable.a17);
        dataList.add(R.drawable.a18);
        dataList.add(R.drawable.a19);
        dataList.add(R.drawable.a20);
        dataList.add(R.drawable.a21);






    }

}
