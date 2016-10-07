package com.at.myapplication.main.base;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.at.myapplication.R;

/**
 * Created by adamthompson on 10/1/16.
 */
public class VideoFragment extends Fragment {

    private VideoView videoView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_video, container, false);

        // todo: start video

        VideoView videoView = (VideoView) v.findViewById(R.id.video);

        return v;
    }

    // inflate to view

    // start video
}
