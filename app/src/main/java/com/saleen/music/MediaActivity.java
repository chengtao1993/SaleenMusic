package com.saleen.music;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.saleen.music.Fragments.MusicMainFragment;
import com.saleen.music.Fragments.MusicPlayFragment;
import com.saleen.music.Fragments.MusicSearchFragment;

public class MediaActivity extends AppCompatActivity{
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    private MusicMainFragment musicMainFragment = new MusicMainFragment();
    private MusicPlayFragment musicPlayFragment = new MusicPlayFragment();
    private MusicSearchFragment musicSearchFragment = new MusicSearchFragment();
    private Fragment mCurrentFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        /*默认显示音乐主界面*/
        fragmentTransaction.add(R.id.fragment_containner,musicMainFragment,"musicMainFragment")
                .add(R.id.fragment_containner,musicPlayFragment,"musicPlayFragment").hide(musicPlayFragment).add(R.id.fragment_containner,musicSearchFragment,"musicSearchFragment").hide(musicSearchFragment).commit();
    }


    /*切换Fragment*/
    public void switchFragment(String fromTag, String toTag) {
        Fragment from = fragmentManager.findFragmentByTag(fromTag);
        Fragment to = fragmentManager.findFragmentByTag(toTag);
        Log.d("hct","from = "+from+"|to = "+to);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (mCurrentFragment != to) {
            mCurrentFragment = to;
            if (!to.isAdded()) {//判断是否被添加到了Activity里面去了
                fragmentTransaction.hide(from).add(R.id.fragment_containner, to).commit();
            } else {
                fragmentTransaction.hide(from).show(to).commit();
            }
        }


}
}
