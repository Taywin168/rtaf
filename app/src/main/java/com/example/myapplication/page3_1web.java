package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class page3_1web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_1web);

        WebView webview = (WebView) findViewById(R.id.webview);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://th.wikipedia.org/wiki/%E0%B8%A2%E0%B8%B2%E0%B8%AA_39");
    }
}