package com.example.android_web_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UrlReader {
    private final static UrlReader INSTANCE = new UrlReader();
    private UrlReader() {}
    public static UrlReader getInstance() {
        return INSTANCE;
    }

    public String getUrl(InputStream inputStream) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(inputStream));
        return lector.readLine();
    }
}
