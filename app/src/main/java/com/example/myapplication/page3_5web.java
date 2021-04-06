package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class page3_5web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_5web);

        WebView webview = (WebView) findViewById(R.id.webview5);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://today.line.me/th/v2/article/kG33zw");
    }
}