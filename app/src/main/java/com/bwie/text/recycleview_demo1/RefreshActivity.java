package com.bwie.text.recycleview_demo1;

import android.graphics.Color;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.bwie.text.recycleview_demo1.adapter.RWaterFallAdapter;

import java.util.ArrayList;

public class RefreshActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{

    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private ArrayList<Integer> dataList;
    Handler handler = new Handler();
    private RWaterFallAdapter waterFallAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refresh);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,RecyclerView.VERTICAL));
        initData();
        waterFallAdapter = new RWaterFallAdapter(this,dataList);
        recyclerView.setAdapter(waterFallAdapter);
        //设置小圆圈颜色
        swipeRefreshLayout.setColorSchemeColors(Color.BLUE,Color.RED,Color.YELLOW);

        swipeRefreshLayout.setOnRefreshListener(this);
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

    @Override
    public void onRefresh() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //刷新条目
                dataList.add(0,R.mipmap.ic_launcher);
                //刷新适配器
                waterFallAdapter.notifyDataSetChanged();
                //隐藏小圆圈
                swipeRefreshLayout.setRefreshing(false);
            }
        },3000);
    }
}
