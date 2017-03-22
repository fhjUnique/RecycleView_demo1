package com.bwie.text.recycleview_demo1.callback;

import android.media.browse.MediaBrowser;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.bwie.text.recycleview_demo1.adapter.RWaterFallAdapter;

/**
 *
 * Created by dell on 2017/3/21.
 */

public class ItemTouchCallBack extends ItemTouchHelper.Callback{
    private RWaterFallAdapter waterFallAdapter;
    //获取滑动的标记
    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        //拖动改变位置标记
        int dargflag = ItemTouchHelper.DOWN | ItemTouchHelper.UP | ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
        ////滑动删除的标记
        int swipflag = ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT;
        return makeMovementFlags(dargflag,swipflag);
    }
    /**
     * 交换位置--移动
     * @param recyclerView
     * @param viewHolder
     * @param target
     * @return
     */
    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        //移动的时候
        int oldposition = viewHolder.getAdapterPosition();
        int newposition = target.getAdapterPosition();
        //交换位置-交换集合，刷新适配器
        waterFallAdapter.onMove(oldposition,newposition);
        return false;
    }
    public void setAdapter(RWaterFallAdapter waterFallAdapter){
        this.waterFallAdapter = waterFallAdapter;
    }
    /**
     * 删除
     * @param viewHolder
     * @param direction
     */
    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        waterFallAdapter.onDelete(viewHolder.getAdapterPosition());
    }
}
