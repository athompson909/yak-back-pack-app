package com.at.myapplication.main.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.at.myapplication.R;

/**
 * Created by adamthompson on 9/3/16.
 */
public class ChooseLevelFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_choose_level, container, false);

        Button buttonBVS = (Button) v.findViewById(R.id.beginningVowelSounds);
        buttonBVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBVSClick();
            }

        });

        Button buttonAVS = (Button) v.findViewById(R.id.advancedVowelSounds);
        buttonAVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAVSClick();
            }

        });

        return v;
    }

    public void onBVSClick() {
        MainActivity ma = (MainActivity) getActivity();
        ma.startChooseSoundFragment();
    }

    public void onAVSClick() {
        MainActivity ma = (MainActivity) getActivity();
        ma.startChooseSoundFragment();
    }
}
