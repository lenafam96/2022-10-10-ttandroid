package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class vd3 extends AppCompatActivity implements View.OnClickListener {
    private Button btnSingle;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vd3);
        Init();
    }

    private void Init() {
        btnSingle = (Button) findViewById(R.id.btnVideo);
        btnNext = (Button) findViewById(R.id.next);
        btnSingle.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        Intent intent = null ;
        switch (v.getId()){
            case  R.id.btnVideo:  // khi click btnvideo sẽ gọi class YoutubeActivity
                intent = new Intent((vd3.this), YoutubeActivity.class);
                break;
            case  R.id.next:// khi click next sẽ gọi class StandaloneActivity
                Log.d("TAG", "onClick: next");
                intent = new Intent((vd3.this), StandaloneActivity.class);
                break;
            default:
        }
        if (intent != null ){
            startActivity(intent);
        }
    }

}