package com.example.refusemanager_zty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hazardous extends AppCompatActivity {
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
        list = new ArrayList<String>(Arrays.asList("漆桶", "电池", "打火机","创可贴","酒精","调色板","油漆","过期的胶囊药物","温度计","过期药片","荧光灯","蓄电池","医用棉签","杀虫剂","水彩笔","农药瓶","医用纱布","口服液瓶","香水瓶","荧光棒","过期化妆品"));
        recycleAdapterDome=new RecycleAdapterDome(context,list);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(recycleAdapterDome);
    }
}