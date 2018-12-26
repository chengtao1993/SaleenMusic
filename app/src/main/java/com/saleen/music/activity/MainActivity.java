package com.saleen.music.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.saleen.music.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RelativeLayout musicInfoLayout;
    private ImageView searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        Log.e("hct","Oncreat");
    }

    private void initViews() {
        musicInfoLayout =findViewById(R.id.music_info);
        musicInfoLayout.setOnClickListener(this);
        searchBtn = findViewById(R.id.search_btn);
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
