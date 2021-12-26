package com.example.refusemanager_zty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView image_household,image_recycleable,image_other,image_hazardous,image_search,image_always;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_household=findViewById(R.id.imageView);
        image_search=findViewById(R.id.imageView1);
        image_always=findViewById(R.id.imageView2);
        image_recycleable=findViewById(R.id.imageView3);
        image_hazardous=findViewById(R.id.imageView5);
        image_other=findViewById(R.id.imageView4);

        image_household.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main=new Intent(MainActivity.this,household.class);
                Toast.makeText(getApplicationContext(),"湿垃圾",Toast.LENGTH_LONG).show();
                startActivity(main);
            }
        });

        image_recycleable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main=new Intent(MainActivity.this,recycleable.class);
                Toast.makeText(getApplicationContext(),"可循坏垃圾",Toast.LENGTH_LONG).show();
                startActivity(main);
            }
        });

        image_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main=new Intent(MainActivity.this,other.class);
                Toast.makeText(getApplicationContext(),"干垃圾",Toast.LENGTH_LONG).show();
                startActivity(main);
            }
        });

        image_hazardous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main=new Intent(MainActivity.this,hazardous.class);
                Toast.makeText(getApplicationContext(),"有害垃圾",Toast.LENGTH_LONG).show();
                startActivity(main);
            }
        });

        image_always.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main=new Intent(MainActivity.this,always.class);
                Toast.makeText(getApplicationContext(),"常用",Toast.LENGTH_LONG).show();
                startActivity(main);
            }
        });


    }
}