package com.example.projetonac_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Intent1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        WebView webview1 = findViewById(R.id.webview1);
        webview1.setWebViewClient(new WebViewClient());
        webview1.getSettings().setJavaScriptEnabled(true);
        webview1.loadUrl("https://www.netshoes.com.br/");
    }
}
