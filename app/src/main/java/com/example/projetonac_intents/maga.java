package com.example.projetonac_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class maga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maga);

        WebView magalu = findViewById(R.id.maga);
        magalu.setWebViewClient(new WebViewClient());
        magalu.getSettings().setJavaScriptEnabled(true);
        magalu.loadUrl("https://www.magazineluiza.com.br/");
    }
}
