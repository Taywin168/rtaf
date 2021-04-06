package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class page3_2web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_2web);

        WebView webview = (WebView) findViewById(R.id.webview2);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://thaitechnics.com/aircraft/saab340_t.html");
    }
}