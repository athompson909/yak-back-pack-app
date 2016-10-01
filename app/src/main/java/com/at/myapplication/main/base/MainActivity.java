package com.at.myapplication.main.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.at.myapplication.R;
import com.at.myapplication.main.model.GameData;

public class MainActivity extends AppCompatActivity {

    private StartFragment mStartFragment;
    private ChooseLevelFragment mChooseLevelFragment;
    private ChooseSoundFragment mChooseSoundFragment;

    /**
     * if the user hasn't yet pressed start, mStartFragment appears
     *
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        mStartFragment = new StartFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, mStartFragment).commit();
    }


    public void startChooseLevelFragment() {
        mChooseLevelFragment = new ChooseLevelFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        ft.replace(R.id.frameLayout, mChooseLevelFragment).commit();
    }


    public void startChooseSoundFragment() {
        mChooseSoundFragment = new ChooseSoundFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        ft.replace(R.id.frameLayout, mChooseSoundFragment).commit();
    }
}