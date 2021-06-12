package com.teamnequit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class referdocumentActivity extends AppCompatActivity {
    PDFView doc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referdocument);
        doc=(PDFView) findViewById(R.id.referdocument);
        doc.fromAsset("Team NeQuit Goal Sheet 2021.pdf").load();

    }
}