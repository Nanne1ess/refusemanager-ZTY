package com.example.refusemanager_zty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class household extends AppCompatActivity {
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
        list = new ArrayList<String>(Arrays.asList("菜叶", "橙皮", "葱","饼干","番茄酱","蛋壳","西瓜皮","马铃薯","鱼骨","甘蔗","玉米","骨头","虾壳","蛋糕","面包","草莓","西红柿","梨","蟹壳","香蕉皮","辣椒"));
        recycleAdapterDome=new RecycleAdapterDome(context,list);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(recycleAdapterDome);
    }
}