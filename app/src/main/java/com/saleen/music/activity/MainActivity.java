package com.saleen.music.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.saleen.music.R;
import com.saleen.music.beans.Mp3Info;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private RelativeLayout musicInfoLayout;
    private ImageView searchBtn;
    private ArrayList<Mp3Info> mp3Infos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        initViews();
        Log.e("hct","Oncreat");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void initDatas() {


    }

    @Override
    public void publish(int progress) {

    }

    @Override
    public void change(int progress) {

    }

    private void initViews() {
        musicInfoLayout =$(R.id.music_info);
        musicInfoLayout.setOnClickListener(this);
        searchBtn = $(R.id.search_btn);
        searchBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.music_info:
                Intent skipToPlayActitvity = new Intent(this,PlayActivity.class);
                startActivity(skipToPlayActitvity);
                break;
            case R.id.search_btn:
                Intent skipToSearchActitvity = new Intent(this,SearchActivity.class);
                startActivity(skipToSearchActitvity);

                break;
        }
    }
}
