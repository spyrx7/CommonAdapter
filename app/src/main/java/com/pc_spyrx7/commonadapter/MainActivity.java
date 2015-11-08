package com.pc_spyrx7.commonadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.pc_spyrx7.commonadapter.adapter.BeanAdapter;
import com.pc_spyrx7.commonadapter.adapter.BeanAdvanceAdapter;
import com.pc_spyrx7.commonadapter.adapter.BeanPrimaryAdapter;
import com.pc_spyrx7.commonadapter.bean.Bean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BeanAdvanceAdapter.OnLoadMore {
   public List<Bean> datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniData();
        initView();
    }

    public void initView(){
        ListView listView= (ListView) findViewById(R.id.ls_demo);
        listView.setAdapter(new BeanAdvanceAdapter(this,datas,R.layout.lv_items));
    }

    public void iniData(){
        datas=new ArrayList<Bean>();
    datas.add(new Bean("标题 1","本门课程为高级分享课程。 因为当中会涉及第三方框架的讲解，故建议学生有一定的Android基础，并且有一定的代码阅读能力与实际工作经验。 ","2015-11-7 18：56",R.drawable.ic_items));
        datas.add(new Bean("标题 2","本门课程为高级分享课程。 因为当中会涉及第三方框架的讲解，故建议学生有一定的Android基础，并且有一定的代码阅读能力与实际工作经验。 ","2015-11-7 18：56",R.drawable.ic_items));
        datas.add(new Bean("标题 3","本门课程为高级分享课程。 因为当中会涉及第三方框架的讲解，故建议学生有一定的Android基础，并且有一定的代码阅读能力与实际工作经验。 ","2015-11-7 18：56",R.drawable.ic_items));
        datas.add(new Bean("标题 4","本门课程为高级分享课程。 因为当中会涉及第三方框架的讲解，故建议学生有一定的Android基础，并且有一定的代码阅读能力与实际工作经验。 ","2015-11-7 18：56",R.drawable.ic_items));
        datas.add(new Bean("标题 5","本门课程为高级分享课程。 因为当中会涉及第三方框架的讲解，故建议学生有一定的Android基础，并且有一定的代码阅读能力与实际工作经验。 ","2015-11-7 18：56",R.drawable.ic_items));
        datas.add(new Bean("标题 6","本门课程为高级分享课程。 因为当中会涉及第三方框架的讲解，故建议学生有一定的Android基础，并且有一定的代码阅读能力与实际工作经验。 ","2015-11-7 18：56",R.drawable.ic_items));
        datas.add(new Bean("标题 7","本门课程为高级分享课程。 因为当中会涉及第三方框架的讲解，故建议学生有一定的Android基础，并且有一定的代码阅读能力与实际工作经验。 ","2015-11-7 18：56",R.drawable.ic_items));
        datas.add(new Bean("标题 8","本门课程为高级分享课程。 因为当中会涉及第三方框架的讲解，故建议学生有一定的Android基础，并且有一定的代码阅读能力与实际工作经验。 ","2015-11-7 18：56",R.drawable.ic_items));
        datas.add(new Bean("标题 9","本门课程为高级分享课程。 因为当中会涉及第三方框架的讲解，故建议学生有一定的Android基础，并且有一定的代码阅读能力与实际工作经验。 ","2015-11-7 18：56",R.drawable.ic_items));
        datas.add(new Bean("标题 10","本门课程为高级分享课程。 因为当中会涉及第三方框架的讲解，故建议学生有一定的Android基础，并且有一定的代码阅读能力与实际工作经验。 ","2015-11-7 18：56",R.drawable.ic_items));


    }

    @Override
    public void onLoadMore() {
        Toast.makeText(this,"onLoad",Toast.LENGTH_SHORT).show();
    }
}
