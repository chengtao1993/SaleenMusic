package com.saleen.music.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.saleen.music.R;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        initViews();
    }
    private void initViews() {
        btnBack = findViewById(R.id.back);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back:
                Intent backToMainActivityIntent = new Intent(this,MainActivity.class);
                startActivity(backToMainActivityIntent);
                break;
        }
    }
}
