package com.pc_spyrx7.commonadapter.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pc_spyrx7.commonadapter.R;
import com.pc_spyrx7.commonadapter.bean.Bean;

import java.util.List;
import java.util.Objects;

/**
 * Created by pc-spyrx7 on 2015/11/7.
 * 作者  pc-spyrx7
 * 邮箱 spyhanfeng@qq.com
 */
public abstract class CommonAdapter<T>  extends BaseAdapter{
    public LayoutInflater inflater;
    public Context context;
    public List<T> datas;
    public int layoutId;

    public CommonAdapter(Context context, List<T> datas,int layoutId){
        this.context = context;
        this.datas = datas;
        this.inflater=LayoutInflater.from(context);
        this.layoutId=layoutId;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public T getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder = ViewHolder.get(context, convertView, parent, layoutId, position);
            convert(holder, getItem(position));
            Log.e("holder","..."+position);
            return holder.getConvertView();

    }

    public abstract void convert(ViewHolder holder,T t);
}
