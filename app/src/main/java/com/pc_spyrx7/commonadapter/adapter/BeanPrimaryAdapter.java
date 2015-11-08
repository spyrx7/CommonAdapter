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
public class BeanPrimaryAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private Context context;
    private List<Bean> datas;

    public BeanPrimaryAdapter(Context context, List<Bean> datas) {
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
        ViewHolder holder=ViewHolder.get(context,convertView,parent,R.layout.lv_items,position);
        Bean bean=datas.get(position);

        ((TextView)holder.getView(R.id.item_title)).setText(bean.getTitle());
        ((TextView)holder.getView(R.id.item_content)).setText(bean.getContent());
        ((TextView)holder.getView(R.id.item_datetime)).setText(bean.getDatatime());
        ((ImageView)holder.getView(R.id.img_head)).setImageResource(bean.getImgRes());

        return holder.getConvertView();
    }


}
