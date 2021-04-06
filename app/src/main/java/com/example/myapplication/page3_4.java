package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class page3_4 extends AppCompatActivity {
    ImageButton b1,b2;
    MediaPlayer mySound4;
    int paused4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_4);
        b1 = (ImageButton) findViewById(R.id.imageButton24);
        b2 = (ImageButton) findViewById(R.id.imageButton29);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(page3_4.this, page3_4web.class);
                startActivity(B1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2=new Intent(page3_4.this,page3_4map.class);
                startActivity(B2);
            }
        });

    }

    public void play(View view) {
        if(mySound4==null) {
            mySound4 = MediaPlayer.create(this, R.raw.soundc130);
            mySound4.start();
        }else if (!mySound4.isPlaying()){
            mySound4.seekTo(paused4);
            mySound4.start();
        }
    }
    public void pause(View view) {
        mySound4.pause();
        paused4=mySound4.getCurrentPosition();
    }

    public void stop(View view) {
        mySound4.stop();
        mySound4=null;
    }
}