package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class page3_4map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_4map);
        WebView webview = (WebView) findViewById(R.id.mapview4);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://www.google.com/maps/place/%E0%B8%81%E0%B8%AD%E0%B8%87%E0%B8%9A%E0%B8%B4%E0%B8%99+6/@13.9085295," +
                "100.6071512,17z/data=!3m1!4b1!4m5!3m4!1s0x30e282814cb1f6c1:0x2ef0da1c60ef765!8m2!3d13.9085295!4d100.6093399");
    }
}