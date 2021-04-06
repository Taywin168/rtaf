package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class page3_5 extends AppCompatActivity {
    ImageButton b1,b2;
    MediaPlayer mySound5;
    int paused5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_5);
        b1 = (ImageButton) findViewById(R.id.imageButton25);
        b2 = (ImageButton) findViewById(R.id.imageButton30);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(page3_5.this, page3_5web.class);
                startActivity(B1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2=new Intent(page3_5.this,page3_5map.class);
                startActivity(B2);
            }
        });

    }

    public void play(View view) {
        if(mySound5==null) {
            mySound5 = MediaPlayer.create(this, R.raw.soundbt67);
            mySound5.start();
        }else if (!mySound5.isPlaying()){
            mySound5.seekTo(paused5);
            mySound5.start();
        }
    }
    public void pause(View view) {
        mySound5.pause();
        paused5=mySound5.getCurrentPosition();
    }

    public void stop(View view) {
        mySound5.stop();
        mySound5=null;
    }
}