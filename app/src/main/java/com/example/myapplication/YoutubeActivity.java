package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{
    private String GOOGLE_API_KEY = "AIzaSyDgIbtezwACpY6uqRmlICQUZ4G1U3WRMgY";
    private String YOUTUBE_VIDEO_ID = "j8U06veqxdU";
    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtubeactivity);
        Init();
        Action();
    }

    private void Init() {
        youTubePlayerView = (YouTubePlayerView) this.findViewById(R.id.myYoutube);
        youTubePlayerView.initialize(GOOGLE_API_KEY,this);
    }

    private void Action() {

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
        Toast.makeText(this, "Initialized Youtube Player successfully", Toast.LENGTH_LONG).show(); // khởi tạo thành công
        youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);
        youTubePlayer.setPlaybackEventListener(playbackEventListener);
        if (!wasRestored) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID);
        }
    }

    // các hàm của youtube
    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onPlaying() {
            Toast.makeText(YoutubeActivity.this, "Good, video is playing ok", Toast.LENGTH_LONG).show(); // vd đang chạy
        }
        @Override
        public void onPaused() {
            Toast.makeText(YoutubeActivity.this, "Video has paused", Toast.LENGTH_LONG).show(); // vd tạm dừng
        }
        @Override
        public void onStopped() {
        }
        @Override
        public void onBuffering(boolean b) {
        }
        @Override
        public void onSeekTo(int i) {
        }
    };
    // các hàm của youtube
    YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
        @Override
        public void onLoading() {
        }
        @Override
        public void onLoaded(String s) {
        }
        @Override
        public void onAdStarted() {
            Toast.makeText(YoutubeActivity.this, "Click Ad now, make the video creator rich!", Toast.LENGTH_LONG).show();     //quảng cáo
        }
        @Override
        public void onVideoStarted() {
            Toast.makeText(YoutubeActivity.this, "Video has started!", Toast.LENGTH_LONG).show();     //vd đã bắt đầu
        }
        @Override
        public void onVideoEnded() {
            Toast.makeText(YoutubeActivity.this, "Thanks for watching!", Toast.LENGTH_LONG).show();
        }
        @Override
        public void onError(YouTubePlayer.ErrorReason errorReason) {
        }
    };
    // các hàm của youtube
    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider,YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Failed to Initialize Youtube Player", Toast.LENGTH_LONG).show(); // khởi tạo thất bại
    }
}