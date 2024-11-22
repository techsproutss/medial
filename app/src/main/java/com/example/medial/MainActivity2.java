package com.example.medial;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        VideoView playVideo  = findViewById(R.id.videoBtn);

        String vPath = "android.resource://"+getPackageName()+"/raw/androidnow";

//        String onlinePath = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4";

        Uri videoUri = Uri.parse(vPath);

//        Uri onlineUri = Uri.parse(onlinePath);


        playVideo.setVideoURI(videoUri);
        playVideo.start();

        MediaController mediaController = new MediaController(this);
        playVideo.setMediaController(mediaController);
        mediaController.setAnchorView(playVideo);



    }
}