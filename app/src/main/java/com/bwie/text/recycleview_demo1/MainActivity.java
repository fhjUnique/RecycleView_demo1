package com.bwie.text.recycleview_demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.list_view);
        initdata();
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataList));
        listView.setOnItemClickListener(this);


    }

    private void initdata() {
        dataList = new ArrayList<>();
        dataList.add("单行 多行 单横 多横");
        dataList.add("瀑布流效果 条目动画");
        dataList.add("多条目效果展示");
        dataList.add("条目拖动删除效果");
        dataList.add("下拉刷新上拉加载");

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                enterActivty(SimpleActivity.class);
                break;
            case 1:
                enterActivty(WaterFallActivity.class);
                break;
            case 2:
                enterActivty(MoreItemActivity.class);
                break;
            case 3:
                enterActivty(RDragActivity.class);
                break;
            case 4:
                enterActivty(RefreshActivity.class);
                break;
        }
    }
    public void enterActivty(Class clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
