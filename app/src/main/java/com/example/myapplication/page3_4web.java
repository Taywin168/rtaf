package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class page3_4web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_4web);

        WebView webview = (WebView) findViewById(R.id.webview4);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://th.wikipedia.org/wiki/%E0%B8%8B%E0%B8%B5-130_" +
                "%E0%B9%80%E0%B8%AE%E0%B8%AD%E0%B8%A3%E0%B9%8C%E0%B8%84%E0%B8%B4%E0%B8%A7%E0%B8%A5%E0%B8%B4%E0%B8%AA");
    }
}