package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class page2 extends AppCompatActivity {
ImageButton b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        b1=(ImageButton) findViewById(R.id.imageButton1);
        b2=(ImageButton) findViewById(R.id.imageButton2);
        b3=(ImageButton) findViewById(R.id.imageButton3);
        b4=(ImageButton) findViewById(R.id.imageButton4);
        b5=(ImageButton) findViewById(R.id.imageButton5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1=new Intent(page2.this,page3_1.class);
                startActivity(B1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2=new Intent(page2.this,page3_2.class);
                startActivity(B2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B3=new Intent(page2.this,page3_3.class);
                startActivity(B3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B4=new Intent(page2.this,page3_4.class);
                startActivity(B4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B5=new Intent(page2.this,page3_5.class);
                startActivity(B5);
            }
        });

    }
}