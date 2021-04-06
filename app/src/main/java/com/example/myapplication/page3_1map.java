package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class page3_1map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_1map);

        WebView webview = (WebView) findViewById(R.id.mapview);

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://www.google.com/maps/place/%E0%B8%81%E0%B8%AD%E0%B8%87%E0%B8%9A%E0%B8%B1%E0%B8%87%E0%B8%84%E0%B8%B1%E0%B8%9A%E0%B8%81%E0%B8%B2%E0%B8%A3+%E0%B8%81%E0%B8%AD%E0%B8%87%E0%B8%9A%E0%B8%B4%E0%B8%99+7/@9.1526496,99.1458573,17z/data=!3m1!4b1!4m8!1m2!2m1!1z4LiB4Lit4LiH4Lia4Li04LiZIDc!3m4!" +
                "1s0x3056aa2d7494f049:0x728821680b2d2b67!8m2!3d9.1526496!4d99.148046");
    }
}