package com.example.tasknews.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.tasknews.R;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView mywebview = findViewById(R.id.webView);
        Intent intent=getIntent();
        String url=intent.getStringExtra("URL");
        mywebview.loadUrl(url);
    }
}