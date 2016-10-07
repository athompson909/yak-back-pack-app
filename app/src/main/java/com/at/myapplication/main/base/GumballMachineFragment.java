package com.at.myapplication.main.base;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.at.myapplication.R;

/**
 * Created by adamthompson on 9/28/16.
 */
public class GumballMachineFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_gumball_machine, container, false);

        ImageButton button = (ImageButton) v.findViewById(R.id.gumballmachine);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClicked();
            }

        });

        return v;
    }

    private void onButtonClicked() {
        GumballMachineActivity gma = (GumballMachineActivity) getActivity();
        gma.startVideoFragment();
    }
}
