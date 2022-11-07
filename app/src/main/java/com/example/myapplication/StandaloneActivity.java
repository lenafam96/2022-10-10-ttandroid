package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity implements  View. OnClickListener {
    private String GOOGLE_API_KEY = "AIzaSyDgIbtezwACpY6uqRmlICQUZ4G1U3WRMgY";
    private String YOUTUBE_VIDEO_ID = "j8U06veqxdU";
    private String YOUTUBE_PLAYLIST_ID = "PLMGwXbxvTnARYX3nP-Boeur4VCJiCoewB";
    private Button btnPlayVideo ;
    private Button btnPlayplaylist ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Init();
        Action();
    }

    private void Init() {
        btnPlayplaylist = (Button) findViewById(R.id.btnPlayList );
        btnPlayVideo = (Button) findViewById(R.id.btnVideo );
        btnPlayVideo.setOnClickListener(this);
        btnPlayplaylist.setOnClickListener(this);

    }

    @Override
    public void onClick (View  v) {
        Intent intent = null ;
        switch (v.getId()){
            case R.id.btnVideo: // khi click vào btnvideo màn hình sẽ phát video được chọn thông qua Key video
                intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID); // gọi hoạt động phát video
                break;
            case  R.id.btnPlayList:// khi click vào btnplaylist màn hình sẽ phát list video được chọn thông qua Key list
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_ID);// gọi hoạt động phát list video
                break ;
            default :
        }
        if ( intent != null ){
            startActivity(intent);
        }
    }

    private void Action() {

    }
}