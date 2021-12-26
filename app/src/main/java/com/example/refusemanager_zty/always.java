package com.example.refusemanager_zty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class always extends AppCompatActivity {
    private ImageView imageView1;
    private RecyclerView recyclerView;
    private RecycleAdapterDome recycleAdapterDome;
    private List<String> list;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_always);
        imageView1=findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main=new Intent(always.this,MainActivity.class);
                Toast.makeText(getApplicationContext(),"主页",Toast.LENGTH_LONG).show();
                startActivity(main);
            }
        });
        list = new ArrayList<>();
        context=this;
        recyclerView =  (RecyclerView) findViewById(R.id.recyclerview);
        list = new ArrayList<String>(Arrays.asList("电池———————有害垃圾","蛋壳———————湿垃圾","塑料瓶———————可循坏垃圾","卫生纸———————干垃圾"));
        recycleAdapterDome=new RecycleAdapterDome(context,list);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(recycleAdapterDome);
    }
}