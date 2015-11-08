package com.pc_spyrx7.commonadapter.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pc_spyrx7.commonadapter.R;

/**
 * Created by pc-spyrx7 on 2015/11/7.
 * 作者  pc-spyrx7
 * 邮箱 spyhanfeng@qq.com
 */
public class ViewHolder {
    private SparseArray<View> views;
    private Context context;
    private int pos;

    private View convertView;

    public ViewHolder(Context context,ViewGroup parent,int layout,int position) {
        this.views=new SparseArray<View>();
        this.pos=position;
        convertView= LayoutInflater.from(context).inflate(R.layout.lv_items,parent,false);
        convertView.setTag(this);
    }

    public static ViewHolder get(Context context,View convertView,ViewGroup parent,int layout,int position){
        if(convertView==null){
            return new ViewHolder(context,parent,layout,position);
        }else{
            ViewHolder holder= (ViewHolder) convertView.getTag();
            holder.pos=position;
            return holder;
        }
    }
    public View getConvertView() {
        return convertView;
    }

    public <T extends View> T getView(int viewId){
        View view=views.get(viewId);
        if(view==null){
            view=convertView.findViewById(viewId);
            views.put(viewId,view);
        }
        return (T)view;
    }

    public ViewHolder setText(int viewId,String text){
        TextView view=getView(viewId);
        view.setText(text);
        return this;
    }

}
