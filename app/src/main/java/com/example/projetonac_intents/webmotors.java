package com.example.projetonac_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webmotors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webmotors);


        WebView webview4 = findViewById(R.id.webview4);
        webview4.setWebViewClient(new WebViewClient());
        webview4.getSettings().setJavaScriptEnabled(true);
        webview4.loadUrl("https://www.webmotors.com.br/");
    }
}
