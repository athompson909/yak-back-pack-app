package com.at.myapplication.main.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.at.myapplication.R;
import com.at.myapplication.main.model.Sound;

/**
 * Created by adamthompson on 9/3/16.
 */
public class GumballMachineActivity extends AppCompatActivity {

    private Sound currentSound;

    private GumballMachineFragment mGumballMachineFragment;

    private VideoFragment mVideoFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gumball_machine);

        getSupportActionBar().hide();

        Bundle bundle = getIntent().getExtras();
        int id = bundle.getInt("id");
        switch (id) {
            case R.id.circ_b: currentSound = Sound.B; break;
            case R.id.circ_ck: currentSound = Sound.CK; break;
            case R.id.circ_ch: currentSound = Sound.CH; break;
            case R.id.circ_d: currentSound = Sound.D; break;
            case R.id.circ_f: currentSound = Sound.F; break;
            case R.id.circ_g: currentSound = Sound.G; break;
            case R.id.circ_h: currentSound = Sound.H; break;
            case R.id.circ_j: currentSound = Sound.J; break;
            case R.id.circ_l: currentSound = Sound.L; break;
            case R.id.circ_m: currentSound = Sound.M; break;
            default:
                Log.e("switch error", "invalid id passed into bundle in GumballMachineActivity");
        }

        mGumballMachineFragment = new GumballMachineFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        ft.replace(R.id.frameLayout, mGumballMachineFragment).commit();

    }

    public void startVideoFragment() {

        mVideoFragment = new VideoFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        ft.replace(R.id.frameLayout, mVideoFragment).commit();
    }
}
