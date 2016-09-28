package com.at.myapplication.main.base;

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
                onCircBClicked();
            }

        });

        return v;
    }

    private void onCircBClicked() {

    }
}