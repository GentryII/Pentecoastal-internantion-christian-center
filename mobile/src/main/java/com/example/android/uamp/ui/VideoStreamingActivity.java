package com.example.android.uamp.ui;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.android.uamp.R;

public class VideoStreamingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_streaming);

        String vidAddress = getIntent().getStringExtra("link");

        VideoView vidView = (VideoView)findViewById(R.id.video);
        //String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        vidView.setVideoURI(vidUri);
        vidView.start();
        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(vidView);
        vidView.setMediaController(vidControl);
    }
}
