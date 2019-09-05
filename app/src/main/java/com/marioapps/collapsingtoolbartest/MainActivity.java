package com.marioapps.collapsingtoolbartest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    public static WebView webview;
    public static String mURL = "https://antonioleiva.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = findViewById(R.id.webview);

        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webview.getSettings().setBuiltInZoomControls(false);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setLoadsImagesAutomatically(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webview.setWebViewClient(new WebViewClient());
//        webview.clearSslPreferences();
        webview.loadUrl(mURL);
    }
}
