package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class page3_5map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_5map);
        WebView webview = (WebView) findViewById(R.id.mapview5);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://www.google.com/maps/place/%E0%B8%81%E0%B8%AD%E0%B8%87%E0%B8%9A%E0%B8%B4%E0%B8%99+46" +
                "/@16.7960137,100.270018,17z/data=!3m1!4b1!4m5!3m4!1s0x30df97cd50f974c5:0xaa7e7075c89d332a!8m2!3d16.7960137!4d100.2722067");
    }
}