package com.bwie.text.recycleview_demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

import com.bwie.text.recycleview_demo1.adapter.RWaterFallAdapter;
import com.bwie.text.recycleview_demo1.callback.ItemTouchCallBack;

import java.util.ArrayList;

public class RDragActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Integer> dataList;
    private RWaterFallAdapter rWaterWallAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdrag);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        initData();
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,RecyclerView.VERTICAL));
        //关联RecyclerView
        rWaterWallAdapter = new RWaterFallAdapter(this, dataList);
        recyclerView.setAdapter(rWaterWallAdapter);
        //创建回调
        ItemTouchCallBack itemTouchCallBack = new ItemTouchCallBack();
        //设置帮助类
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(itemTouchCallBack);
        //进行关联
        itemTouchHelper.attachToRecyclerView(recyclerView);

        itemTouchCallBack.setAdapter(rWaterWallAdapter);

    }

    private void initData() {
        dataList = new ArrayList<>();
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
