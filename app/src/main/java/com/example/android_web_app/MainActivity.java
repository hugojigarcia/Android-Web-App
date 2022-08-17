package com.example.android_web_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.io.IOException;

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
        initUrl();
        initWeb();
    }

    private void ocultarBarra(){
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    private void initUrl(){
        try {
            this.url = UrlReader.getInstance().getUrl(this.getResources().openRawResource(R.raw.config));
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error al cargar la página web.", Toast.LENGTH_LONG).show();
        }
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