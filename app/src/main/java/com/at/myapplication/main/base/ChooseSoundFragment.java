package com.at.myapplication.main.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.at.myapplication.R;

/**
 * Created by adamthompson on 9/3/16.
 */
public class ChooseSoundFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_choose_sound, container, false);

        ImageButton circB = (ImageButton) v.findViewById(R.id.circ_b);
        circB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSoundClick(R.id.circ_b);
            }

        });

        ImageButton circCK = (ImageButton) v.findViewById(R.id.circ_ck);
        circCK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSoundClick(R.id.circ_ck);
            }

        });

        ImageButton circCH = (ImageButton) v.findViewById(R.id.circ_ch);
        circCH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSoundClick(R.id.circ_ch);
            }

        });

        ImageButton circD = (ImageButton) v.findViewById(R.id.circ_d);
        circD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSoundClick(R.id.circ_d);
            }

        });

        ImageButton circF = (ImageButton) v.findViewById(R.id.circ_f);
        circF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSoundClick(R.id.circ_f);
            }

        });

        ImageButton circG = (ImageButton) v.findViewById(R.id.circ_g);
        circG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSoundClick(R.id.circ_g);
            }

        });

        ImageButton circH = (ImageButton) v.findViewById(R.id.circ_h);
        circH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSoundClick(R.id.circ_h);
            }

        });

        ImageButton circJ = (ImageButton) v.findViewById(R.id.circ_j);
        circJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSoundClick(R.id.circ_j);
            }

        });

        ImageButton circL = (ImageButton) v.findViewById(R.id.circ_l);
        circL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSoundClick(R.id.circ_l);
            }

        });

        ImageButton circM = (ImageButton) v.findViewById(R.id.circ_m);
        circM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSoundClick(R.id.circ_m);
            }

        });


        return v;
    }

    /**
     * puts buttonId into a bundle which is put into the intent of GumballMachineActivity
     * ...there will be a switch statement in GumballMachineActivity
     * @param buttonId the id passed in based on which button was pressed
     */
    private void onSoundClick(int buttonId) {
        Intent intent = new Intent(getActivity(), GumballMachineActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("id", buttonId);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}