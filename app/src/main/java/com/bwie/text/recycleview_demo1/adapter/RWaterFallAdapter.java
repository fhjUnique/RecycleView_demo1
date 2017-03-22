package com.bwie.text.recycleview_demo1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.text.recycleview_demo1.R;
import com.bwie.text.recycleview_demo1.hoder.RSimpleHolder;
import com.bwie.text.recycleview_demo1.hoder.RWaterHolder;
import com.bwie.text.recycleview_demo1.listener.OnRecyclerViewTouchItemClickListener;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 瀑布流
 * Created by dell on 2017/3/21.
 */

public class RWaterFallAdapter extends RecyclerView.Adapter<RWaterHolder> {
    private Context context;
    private ArrayList<Integer> dataList;
    private ArrayList<Integer> heightList;
    private OnRecyclerViewTouchItemClickListener onItemClickListener;

    public RWaterFallAdapter(Context context, ArrayList<Integer> dataList) {
        this.context = context;
        this.dataList = dataList;
        heightList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            heightList.add((int) (100 + (int) 200 * Math.random()));
        }

    }

    public void setOnItemClickListener(OnRecyclerViewTouchItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public RWaterHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_image, parent, false);
        RWaterHolder rSimpleHolder = new RWaterHolder(view);

        return rSimpleHolder;
    }

    @Override
    public void onBindViewHolder(RWaterHolder holder, final int position) {
        ViewGroup.LayoutParams layoutParams = holder.image_image.getLayoutParams();
        layoutParams.height = heightList.get(position);

        holder.image_image.setLayoutParams(layoutParams);
//        holder.tv_item.setBackgroundColor(Color.rgb(100+(int)155*Math.random(),100+(int)155*Math.random(),100+(int)155*Math.random());
        holder.image_image.setImageResource(dataList.get(position));
        //对某一个控件设置点击事件
        holder.image_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    //触发回调
                    onItemClickListener.onItemClick(position);
                }
            }
        });
        //设置长按事件
        holder.image_image.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemLongClick(position);
                }
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void onMove(int oldposition, int newposition) {
        //交换数据
        Collections.swap(dataList, oldposition, newposition);
        //刷新数据
        this.notifyItemMoved(oldposition, newposition);

    }

    public void onDelete(int adapterPosition) {
        dataList.remove(adapterPosition);
        this.notifyItemRemoved(adapterPosition);
    }
}
