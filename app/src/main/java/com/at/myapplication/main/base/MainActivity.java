package com.at.myapplication.main.base;

import android.support.v4.app.Fragment;
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

        if(!GameData.getInstance().isStarted()) {

            mStartFragment = new StartFragment();

            getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, mStartFragment).commit();
        }
    }


    public void startChooseLevelFragment() {
        mChooseLevelFragment = new ChooseLevelFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, mChooseLevelFragment).commit();
    }


    public void startChooseSoundFragment() {
        mChooseSoundFragment = new ChooseSoundFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, mChooseSoundFragment).commit();
    }
}