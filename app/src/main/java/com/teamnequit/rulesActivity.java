package com.teamnequit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class rulesActivity extends AppCompatActivity {
    PDFView rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        rules=(PDFView) findViewById(R.id.teamRules);
        rules.fromAsset("FB rules 2021.pdf").load();

    }
}