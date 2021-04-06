package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class page3_3map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_3map);

        WebView webview = (WebView) findViewById(R.id.mapview3);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://www.google.com/maps/place/%E0%B8%81%E0%B8%AD%E0%B8%87%E0%B8%9A%E0%B8%B4%E0%B8%99+4+%E0%B8%97%E0%B8%AB%E0%B8%B2%E0%B8%A3%E0%B8%AD%E0%B8%B2%E0%B8%81%E0%B8%B2%E0%B8%A8/@15.2521797,100.2798319,15z/data=!4m8!1m2!2m1" +
                "!1z4LiB4Lit4LiH4Lia4Li04LiZIDQ!3m4!1s0x30e1c40395b7b63f:0x6206db4fb61cd0a9!8m2!3d15.2521797!4d100.2885866");
    }
}