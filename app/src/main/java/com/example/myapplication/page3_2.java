package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class page3_2 extends AppCompatActivity {
    ImageButton b1,b2;
    MediaPlayer mySound2;
    int paused2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_2);
        b1 = (ImageButton) findViewById(R.id.imageButton22);
        b2=(ImageButton) findViewById(R.id.imageButton27);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(page3_2.this, page3_2web.class);
                startActivity(B1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2=new Intent(page3_2.this,page3_2map.class);
                startActivity(B2);
            }
        });

    }

    public void play(View view) {
        if(mySound2==null) {
            mySound2 = MediaPlayer.create(this, R.raw.soundsaab);
            mySound2.start();
        }else if (!mySound2.isPlaying()){
            mySound2.seekTo(paused2);
            mySound2.start();
        }
    }
    public void pause(View view) {
        mySound2.pause();
        paused2=mySound2.getCurrentPosition();
    }

    public void stop(View view) {
        mySound2.stop();
        mySound2=null;
    }
}