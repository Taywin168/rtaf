package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class page3_3 extends AppCompatActivity {
    ImageButton b1,b2;
    MediaPlayer mySound3;
    int paused3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_3);
        b1 = (ImageButton) findViewById(R.id.imageButton23);
        b2 = (ImageButton) findViewById(R.id.imageButton28);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(page3_3.this, page3_3web.class);
                startActivity(B1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2=new Intent(page3_3.this,page3_3map.class);
                startActivity(B2);
            }
        });
    }

    public void play(View view) {
        if(mySound3==null) {
            mySound3 = MediaPlayer.create(this, R.raw.soundf16);
            mySound3.start();
        }else if (!mySound3.isPlaying()){
            mySound3.seekTo(paused3);
            mySound3.start();
        }
    }
    public void pause(View view) {
        mySound3.pause();
        paused3=mySound3.getCurrentPosition();
    }

    public void stop(View view) {
        mySound3.stop();
        mySound3=null;
    }
}