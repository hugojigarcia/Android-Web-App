package com.example.android_web_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView pagina;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        ocultarBarra();
        this.url = getUrl();
        initWeb();
    }

    private void ocultarBarra(){
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    private String getUrl(){
        //TODO
        return "";
    }

    private void initWeb(){
        pagina = (WebView) findViewById(R.id.pagina);
        pagina.setWebViewClient(new WebViewClient());
        pagina.getSettings().setJavaScriptEnabled(true);
        cargarWeb();
    }

    private void cargarWeb(){
        pagina.loadUrl(url);
    }


}