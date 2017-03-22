package com.bwie.text.recycleview_demo1.hoder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bwie.text.recycleview_demo1.R;

/**
 * Created by dell on 2017/3/21.
 */

public class RSecondTypeHolder extends RecyclerView.ViewHolder{

    public final TextView text_second;

    public RSecondTypeHolder(View itemView) {
        super(itemView);
        text_second = (TextView) itemView.findViewById(R.id.text_second);
    }
}
