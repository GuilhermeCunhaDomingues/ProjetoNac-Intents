package com.example.projetonac_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class subb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subb);

        WebView webview2 = findViewById(R.id.webview2);
        webview2.setWebViewClient(new WebViewClient());
        webview2.getSettings().setJavaScriptEnabled(true);
        webview2.loadUrl("https://www.submarino.com.br/");
    }
}
