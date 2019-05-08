package com.example.smartreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Follow extends AppCompatActivity implements View.OnClickListener {


    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back3:
                Intent intMenu = new Intent(this, Menu.class);
                startActivity(intMenu);
                break;
            case R.id.data:
                webView  = (WebView)findViewById(R.id.web);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.youtube.com");
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                break;
        }
    }
}
