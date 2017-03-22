package com.bwie.text.recycleview_demo1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.text.recycleview_demo1.R;
import com.bwie.text.recycleview_demo1.hoder.RFirstTypeHolder;
import com.bwie.text.recycleview_demo1.hoder.RSecondTypeHolder;
import com.bwie.text.recycleview_demo1.hoder.RThreeTypeHolder;

/**
 * 多条目加载
 * Created by dell on 2017/3/21.
 */

public class RMoreItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context context;
    private String str;
    private int FIRST_TYPE = 0;
    private int SECOND_TYPE = 1;
    private int THIRD_TYPE = 2;
    private int type;

    public RMoreItemAdapter(Context context,String str) {
        this.context = context;
        this.str = str;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        switch (viewType){
            case 0:
                View view = LayoutInflater.from(context).inflate(R.layout.first_item_layout, parent, false);
                viewHolder = new RFirstTypeHolder(view);
                break;
            case 1:
                View view1 = LayoutInflater.from(context).inflate(R.layout.second_item_layout, parent, false);
                viewHolder = new RSecondTypeHolder(view1);
                break;
            case 2:
                View view2 = LayoutInflater.from(context).inflate(R.layout.three_item_layout, parent, false);
                viewHolder = new RThreeTypeHolder(view2);
                break;
        }


        return viewHolder;
    }
    /**
     * 判断当前条目类型
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                type = FIRST_TYPE;
                break;
            case 1:
                type = SECOND_TYPE;
                break;
            case 2:
                type = THIRD_TYPE;
                break;
        }
        return type;
    }
    //设置数据使用
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);

        switch (itemViewType){
            case 0:

                break;
            case 1:
                RSecondTypeHolder rSecondTypeHolder = (RSecondTypeHolder) holder;
                rSecondTypeHolder.text_second.setText(str);
                break;
            case 2:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
