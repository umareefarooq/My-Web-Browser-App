package com.example.webbrowserapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = (EditText)findViewById(R.id.ed);
        wv = (WebView)findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);


        wv.setWebViewClient(new WebViewClient()
        {
            public boolean shouldOverrideUrlLoading( WebView view, String url)
            {
                view.loadUrl(url);
                return false;
            }
        });

    }



    public void search(View view) {

        String query = ed.getText().toString();
        wv.loadUrl(query);
    }

    public void back(View view) {

        //back button method
        wv.goBack();
    }

    public void forward(View view) {

        //forward button method
        wv.goForward();
    }

}