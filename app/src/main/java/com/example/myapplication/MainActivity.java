package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_bai1,btn_bai2,btn_bai3,btn_vd1,btn_vd2,btn_vd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        Action();
    }

    private void Init() {
        btn_vd1 = (Button) this.findViewById(R.id.btn_vd1);
        btn_vd2 = (Button) this.findViewById(R.id.btn_vd2);
        btn_vd3 = (Button) this.findViewById(R.id.btn_vd3);
        btn_bai1 = (Button) this.findViewById(R.id.btn_bai1);
        btn_bai2 = (Button) this.findViewById(R.id.btn_bai2);
        btn_bai3 = (Button) this.findViewById(R.id.btn_bai3);
    }

    private void Action() {
        btn_vd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,vd1.class);
                startActivity(intent);
            }
        });
        btn_vd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,vd2.class);
                startActivity(intent);
            }
        });
        btn_vd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,vd3.class);
                startActivity(intent);
            }
        });
//        btn_bai1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,bai1.class);
//                startActivity(intent);
//            }
//        });
//        btn_bai2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,bai2.class);
//                startActivity(intent);
//            }
//        });
//        btn_bai2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,bai3.class);
//                startActivity(intent);
//            }
//        });
    }
}