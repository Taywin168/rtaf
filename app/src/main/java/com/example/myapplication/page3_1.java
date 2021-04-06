package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class page3_1 extends AppCompatActivity {
    ImageButton b1,b2;
    MediaPlayer mySound;
    int paused;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_1);
        b1 = (ImageButton) findViewById(R.id.imageButton21);
        b2=(ImageButton) findViewById(R.id.imageButton26);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(page3_1.this, page3_1web.class);
                startActivity(B1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2=new Intent(page3_1.this,page3_1map.class);
                startActivity(B2);
            }
        });

    }
            public void play(View view) {
                if (mySound == null) {
                    mySound = MediaPlayer.create(this, R.raw.soundgripen);
                    mySound.start();
                } else if (!mySound.isPlaying()) {
                    mySound.seekTo(paused);
                    mySound.start();
                }
            }

            public void pause(View view) {
                mySound.pause();
                paused = mySound.getCurrentPosition();
            }

            public void stop(View view) {
                mySound.stop();
                mySound = null;
            }
            }