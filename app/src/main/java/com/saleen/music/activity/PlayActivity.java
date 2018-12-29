package com.saleen.music.activity;



import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.saleen.music.R;

public class PlayActivity extends BaseActivity implements View.OnClickListener{
    private ImageView btnBack;
    private ImageView songPic;
    private TextView songName,songer;
    private TextView currentTime,totalTime;
    private SeekBar seekBar;
    private ImageView favoBtn,preBtn,playBtn,nextBtn,playModeBtn;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        initViews();
    }

    @Override
    public void publish(int progress) {

    }

    @Override
    public void change(int progress) {

    }

    private void initViews() {
        btnBack = $(R.id.back);
        btnBack.setOnClickListener(this);
        songPic = $(R.id.song_pic);
        songName = $(R.id.song_name);
        songer = $(R.id.songer);
        currentTime = $(R.id.current_time);
        totalTime = $(R.id.total_time);

        favoBtn = $(R.id.favorite);
        favoBtn.setOnClickListener(this);
        preBtn = $(R.id.music_pre);
        preBtn.setOnClickListener(this);
        playBtn = $(R.id.music_play);
        playBtn.setOnClickListener(this);
        nextBtn = $(R.id.music_next);
        nextBtn.setOnClickListener(this);
        playModeBtn = $(R.id.play_mode);
        playBtn.setOnClickListener(this);
        songList =$(R.id.song_list);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back:
                finish();
                break;
            case R.id.favorite:

                break;
            case R.id.music_pre:
                break;
            case R.id.music_play:
                break;
            case R.id.music_next:
                break;
            case R.id.play_mode:
                break;
        }
    }
}
