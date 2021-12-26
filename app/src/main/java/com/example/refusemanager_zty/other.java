package com.example.refusemanager_zty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class other extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecycleAdapterDome recycleAdapterDome;
    private Context context;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.activity_household);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        list = new ArrayList<String>(Arrays.asList("旧浴缸", "盆子", "坏马桶","旧水槽","贝壳","化妆刷","坛子","海绵","花生壳","菜板","砖块","卫生纸","篮球","核桃","杯子","陶瓷碗","一次性筷子","西海核","坏的花盆","木制梳子","脏污的衣服"));
        recycleAdapterDome=new RecycleAdapterDome(context,list);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(recycleAdapterDome);
    }
}