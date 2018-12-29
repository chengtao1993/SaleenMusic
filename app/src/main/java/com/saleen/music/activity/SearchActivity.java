package com.saleen.music.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.saleen.music.R;

public class SearchActivity extends BaseActivity implements View.OnClickListener{
    private ImageView backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initViews();
    }

    @Override
    public void publish(int progress) {

    }

    @Override
    public void change(int progress) {

    }

    private void initViews() {
        backBtn = $(R.id.btn_back);
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
