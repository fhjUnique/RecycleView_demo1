package com.bwie.text.recycleview_demo1.hoder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwie.text.recycleview_demo1.R;

/**
 * Created by dell on 2017/3/21.
 */

public class RWaterHolder extends RecyclerView.ViewHolder{

    public final ImageView image_image;

    public RWaterHolder(View itemView) {
        super(itemView);
        image_image = (ImageView) itemView.findViewById(R.id.image_image);
    }
}
