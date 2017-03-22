package com.bwie.text.recycleview_demo1.hoder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bwie.text.recycleview_demo1.R;

/**
 * Created by dell on 2017/3/21.
 */

public class RSimpleHolder extends RecyclerView.ViewHolder{

    public final TextView tv_item;

    public RSimpleHolder(View itemView) {
        super(itemView);
        tv_item = (TextView) itemView.findViewById(R.id.tv_item);
    }
}
