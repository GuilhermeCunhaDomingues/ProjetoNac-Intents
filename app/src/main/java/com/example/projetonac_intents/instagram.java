package com.example.projetonac_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class instagram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        WebView webviewInsta = findViewById(R.id.webviewInsta);
        webviewInsta.setWebViewClient(new WebViewClient());
        webviewInsta.getSettings().setJavaScriptEnabled(true);
        webviewInsta.loadUrl("https://www.instagram.com/gui_projects/");
    }
}
