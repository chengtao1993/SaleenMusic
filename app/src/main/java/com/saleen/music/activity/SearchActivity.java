package com.saleen.music.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.saleen.music.R;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener{
    private View musicSearchFragmentView;
    private ImageView backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initViews();
    }
    private void initViews() {
        backBtn = findViewById(R.id.btn_back);
        backBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_back:
                finish();
                break;
        }
    }
}
