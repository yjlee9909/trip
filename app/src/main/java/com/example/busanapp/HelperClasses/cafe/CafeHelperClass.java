package com.example.busanapp.HelperClasses.cafe;

public class CafeHelperClass {
    private String Url, text;

    public CafeHelperClass(String Url, String text) {
        this.Url = Url;
        this.text = text;
    }

    public String getUrl() {
        return Url;
    }

    public String getText() {
        return text;
    }
}