package com.pc_spyrx7.commonadapter.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pc_spyrx7.commonadapter.R;
import com.pc_spyrx7.commonadapter.bean.Bean;

import java.util.List;

/**
 * Created by pc-spyrx7 on 2015/11/8.
 * 作者  pc-spyrx7
 * 邮箱 spyhanfeng@qq.com
 */
public class BeanAdvanceAdapter extends CommonAdapter<Bean> {

    public interface OnLoadMore {
        public void onLoadMore();
    }
    public OnLoadMore loadMore = null;

    public BeanAdvanceAdapter(Context context,List<Bean> datas,int layoutId){
        super(context,datas,layoutId);

    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    public int getItemViewType(int position) {
        if (position >= super.getCount() && position > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public int getCount() {
        int c= super.getCount();
        if(c>0){
            return c+1;
        }
        return c;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(position>=super.getCount()&& position>0){

            convertView= inflater.inflate(R.layout.load_datas, parent, false);
            loadMore();
            Log.e("Load",position+"");
            return  convertView;
        }
        return super.getView(position, convertView, parent);
    }

    @Override
    public void convert(ViewHolder holder, Bean bean) {
       holder.setText(R.id.item_title,bean.getTitle())
               .setText(R.id.item_content, bean.getContent())
               .setText(R.id.item_datetime, bean.getDatatime());
    }
    private void loadMore() {
        if (loadMore != null) {
            loadMore.onLoadMore();
        }
    }
}
