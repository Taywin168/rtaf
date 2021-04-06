package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class page3_3web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_3web);

        WebView webview = (WebView) findViewById(R.id.webview3);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://th.wikipedia.org/wiki/%E0%B9%80%E0%B8%AD%E0%B8%9F-16_%" +
                "E0%B9%84%E0%B8%9F%E0%B8%97%E0%B8%B4%E0%B8%87%E0%B8%9F%E0%B8%AD%E0%B8%A5%E0%B8%84%E0%B8%AD%E0%B8%99");
    }
}