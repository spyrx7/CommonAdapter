package com.pc_spyrx7.commonadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pc_spyrx7.commonadapter.R;
import com.pc_spyrx7.commonadapter.bean.Bean;

import java.util.List;

/**
 * Created by pc-spyrx7 on 2015/11/7.
 * 作者  pc-spyrx7
 * 邮箱 spyhanfeng@qq.com
 */
public class BeanAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private Context context;
    private List<Bean> datas;

    public BeanAdapter(Context context, List<Bean> datas) {
        this.context = context;
        this.datas = datas;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.lv_items,parent,false);
            holder=new ViewHolder();
            holder.title= (TextView) convertView.findViewById(R.id.item_title);
            holder.content= (TextView) convertView.findViewById(R.id.item_content);
            holder.datetime= (TextView) convertView.findViewById(R.id.item_datetime);
            holder.imghead = (ImageView) convertView.findViewById(R.id.img_head);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }

        Bean bean=datas.get(position);
        holder.title.setText(bean.getTitle());
        holder.content.setText(bean.getContent());
        holder.datetime.setText(bean.getDatatime());
        holder.imghead.setImageResource(bean.getImgRes());

        return convertView;
    }

    private class ViewHolder{
        ImageView imghead;
        TextView  title;
        TextView  content;
        TextView  datetime;
    }
}
