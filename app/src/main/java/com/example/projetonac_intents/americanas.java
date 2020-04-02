package com.example.projetonac_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class americanas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americanas);


        WebView webviewAme = findViewById(R.id.webviewAme);
        webviewAme.setWebViewClient(new WebViewClient());
        webviewAme.getSettings().setJavaScriptEnabled(true);
        webviewAme.loadUrl("https://www.americanas.com.br/");
    }
}
