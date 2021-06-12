package com.teamnequit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class newsletterActivity extends AppCompatActivity {
    PDFView Newsletter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsletter);
        Newsletter=(PDFView) findViewById(R.id.newsletter);
        Newsletter.fromAsset("NeverQuit7.0NewsLetter.pdf").load();
    }
}