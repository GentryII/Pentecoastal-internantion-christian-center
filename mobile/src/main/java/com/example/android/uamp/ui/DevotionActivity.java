package com.example.android.uamp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.android.uamp.R;
import com.example.android.uamp.ui.tv.LiveActivity;

public class DevotionActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devotion);

        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://virtuallabsonline.000webhostapp.com/new/generic.html");
        //http://virtuallabsonline.epizy.com/live/live_service.html
        //http://virtuallabsonline.000webhostapp.com/audio/audioplayer.html
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        //Intent intent = new Intent();
        //intent.setAction(Intent.ACTION_VIEW);
        //intent.addCategory(Intent.CATEGORY_BROWSABLE);
        //intent.setData(Uri.parse("http://mixlr.com/shepherds-chapel/"));


        //startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack();
            Intent g = new Intent(DevotionActivity.this, ProfileActivity.class);
            startActivity(g);
        }
        else
        {
            super.onBackPressed();
        }
    }
    }

