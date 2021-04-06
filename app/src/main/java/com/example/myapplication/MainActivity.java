package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton b1;
MediaPlayer bgsound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgsound=MediaPlayer.create(this,R.raw.pino);
        bgsound.start();
        bgsound.isLooping();

        b1=(ImageButton) findViewById(R.id.imageButton);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent B1=new Intent(MainActivity.this,page2.class);
                startActivity(B1);
            }
        });
    }
}