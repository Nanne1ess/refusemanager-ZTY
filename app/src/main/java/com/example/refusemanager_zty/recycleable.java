package com.example.refusemanager_zty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class recycleable extends AppCompatActivity {
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
        list = new ArrayList<String>(Arrays.asList("塑料瓶", "食品罐头", "玻璃瓶","易拉罐","报纸","旧书包","旧手提包","旧鞋子","牛奶盒","旧塑料篮子","旧玩偶","玻璃壶","旧铁锅","垃圾桶","旧镜子","牙刷","塑料梳子","旧帽子","旧夹子","废锁头","牙膏皮"));
        recycleAdapterDome=new RecycleAdapterDome(context,list);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(recycleAdapterDome);
    }
}