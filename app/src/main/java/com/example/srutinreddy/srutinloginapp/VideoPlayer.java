package com.example.srutinreddy.srutinloginapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class VideoPlayer extends AppCompatActivity {


    VideoView vid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
        vid=(VideoView)findViewById(R.id.id_video);
        String urlpath= "android.resource"+ getPackageName()+R.raw.sample2;
        vid.setVideoURI(Uri.parse(urlpath));
        vid.start();

    }

}
